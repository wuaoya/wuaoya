package com.way.controller;

import com.alibaba.fastjson.JSON;
import com.way.domain.AdminEntity;
import com.way.domain.LostEntity;
import com.way.domain.StudentEntity;
import com.way.service.BgLostService;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
@RequestMapping("/lost")
public class BgLostController {
    int i=0;
    @Autowired
private BgLostService bgLostService;

    public void setBgLostService(BgLostService bgLostService) {
        this.bgLostService = bgLostService;
    }
//    --------------------------------------------------------------------
//    添加信息，（图片上传）通过判断来知道发布信息的是管理员还是学生
    @RequestMapping("/addLost")
    @ResponseBody
    public String addLost(LostEntity lostEntity,@RequestParam("limage") MultipartFile myfile, HttpServletRequest request){

        String filename=myfile.getOriginalFilename();
        lostEntity.setLimage("images/"+filename);
        String path2=request.getServletContext().getRealPath("background//images");
        File destFile=new File(path2+File.separator+filename);

        try {
            InputStream in=myfile.getInputStream();
            FileUtils.copyInputStreamToFile(in,destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        至此，上传图片完成
//        这里开始判断学生还是管理人员，为的是这样写不发生空指针异常
        if (request.getSession().getAttribute("CURRENT_SESSION_KEY") instanceof AdminEntity){
            AdminEntity adminEntity =(AdminEntity) request.getSession().getAttribute("CURRENT_SESSION_KEY");
            lostEntity.setAid(adminEntity.getAid());
        }else{
            StudentEntity studentEntity=(StudentEntity)request.getSession().getAttribute("CURRENT_SESSION_KEY");
            lostEntity.setSid(studentEntity.getSid());
        }

        if (bgLostService.addLost(lostEntity)){
            i=1;
            return JSON.toJSONString(i);
        }
        i=2;
        return JSON.toJSONString(i);
    }

//    分页以及查询
    @RequestMapping("/listLost")
    @ResponseBody
    public String listLost(int currentpage, LostEntity lostEntity){
        List<LostEntity>list=bgLostService.list(currentpage,lostEntity);
        return JSON.toJSONString(list);
    }

//    我发布的
    @RequestMapping("/listMine")
    @ResponseBody
    public String listMine(LostEntity lostEntity, HttpServletRequest request){
        //       这里开始判断学生还是管理人员，为的是这样写不发生空指针异常
        if (request.getSession().getAttribute("CURRENT_SESSION_KEY") instanceof AdminEntity){
            AdminEntity adminEntity =(AdminEntity) request.getSession().getAttribute("CURRENT_SESSION_KEY");
            lostEntity.setAid(adminEntity.getAid());
        }else{
            StudentEntity studentEntity=(StudentEntity)request.getSession().getAttribute("CURRENT_SESSION_KEY");
            lostEntity.setSid(studentEntity.getSid());
        }
        List<LostEntity>list=bgLostService.listMine(lostEntity);
        return JSON.toJSONString(list);
    }

//   改变状态
    @RequestMapping("/changeLstatus")
    @ResponseBody
    public String changeLstatus(LostEntity lostEntity){
        if(bgLostService.changeLstatus(lostEntity)){
            i=1;
            return  JSON.toJSONString(i);
        }
        i=2;
        return JSON.toJSONString(i);
    }

}

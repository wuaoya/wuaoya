package com.way.controller;

import com.alibaba.fastjson.JSON;
import com.way.domain.AdminEntity;
import com.way.domain.NewsEntity;
import com.way.service.BgNewService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/news")
public class BgNewsController {
    int i=0;
    @Resource
    private BgNewService bgNewService;

    public void setBgNewService(BgNewService bgNewService) {
        this.bgNewService = bgNewService;
    }
//-----------------------------------------------------------------------
//    添加新闻
    @RequestMapping("/addNews")
    @ResponseBody
    public String addnews(NewsEntity newsEntity, HttpServletRequest request){
    AdminEntity adminEntity=(AdminEntity) request.getSession().getAttribute("CURRENT_SESSION_KEY");
      newsEntity.setAid(adminEntity.getAid());
      if (bgNewService.saveNews(newsEntity)){
//          添加成功
          i=1;
          System.out.println("添加成功");
          return JSON.toJSONString(i);
      }
     i=2;
        System.out.println("添加失败");
    return JSON.toJSONString(i);
    }

//    改变状态
    @RequestMapping("/changeNews")
    @ResponseBody
    public String changeNews(NewsEntity newsEntity){
        if(bgNewService.changeNews(newsEntity)){
            i=1;
            return JSON.toJSONString(i);
        }
        i=2;
        return JSON.toJSONString(i);
    }
//    修改内容
    @RequestMapping("/updateNews")
    @ResponseBody
    public String updateNews(NewsEntity newsEntity){
        if (bgNewService.updateNews(newsEntity)){
            i=1;
            return JSON.toJSONString(i);
        }
        i=2;
        return JSON.toJSONString(i);
    }
//    分页和查询
    @RequestMapping("/listNews")
    @ResponseBody
    public String list(int currentpage,NewsEntity newsEntity){
       List<NewsEntity>list=bgNewService.list(currentpage,newsEntity);
            return JSON.toJSONString(list);

    }

}

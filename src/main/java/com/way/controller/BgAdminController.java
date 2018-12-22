package com.way.controller;

import com.alibaba.fastjson.JSON;
import com.way.domain.AdminEntity;
import com.way.service.BgAdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/background")
public class BgAdminController {
    @Resource
    private BgAdminService bgAdminService;

    public void setBgAdminService(BgAdminService bgAdminService) {
        this.bgAdminService = bgAdminService;
    }

//    定义全局变量
        int i=0;
/*--------------------------------------------------------------------------------------*/
    @RequestMapping("/haveAname")
    @ResponseBody
    public String  haveAname(AdminEntity adminEntity, HttpServletRequest request, String hdcode){
     if (bgAdminService.haveAname(adminEntity)){
         if (bgAdminService.trueApwd(adminEntity)){
             if (hdcode.equals("验证成功")){
             i=4;
             AdminEntity adminEntity1=bgAdminService.getAdmin(adminEntity);
             request.getSession().setAttribute("CURRENT_SESSION_KEY",adminEntity1);
                 System.out.println(adminEntity1);
             return JSON.toJSONString(i);
            }
            i=3;
             return JSON.toJSONString(i);
         }
         i=2;
         return JSON.toJSONString(i);
     }
     i=1;
     return JSON.toJSONString(i);
    }


}

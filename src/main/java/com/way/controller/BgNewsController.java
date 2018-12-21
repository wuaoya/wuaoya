package com.way.controller;

import com.alibaba.fastjson.JSON;
import com.way.domain.NewsEntity;
import com.way.service.BgNewService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

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
    public String addnews(NewsEntity newsEntity){
    return JSON.toJSONString(i);
    }

//    改变状态
    @RequestMapping("/changeNews")
    public String changeNews(NewsEntity newsEntity){
        return JSON.toJSONString(i);
    }
//    修改内容
    @RequestMapping("/changeNews")
    public String updateNews(NewsEntity newsEntity){
        return JSON.toJSONString(i);
    }
//    分页和查询
    @RequestMapping("/changeNews")
    public String list(NewsEntity newsEntity){
        return JSON.toJSONString(i);
    }

}

package com.way.service;

import com.way.domain.NewsEntity;

import java.util.List;

public interface BgNewService {
    //    分页和条件查询
    public List<NewsEntity> list(int currentpage, NewsEntity newsEntity);
    //    保存
    public boolean saveNews(NewsEntity newsEntity);
    //    改变状态
    public boolean changeNews(NewsEntity newsEntity);
    //    更新内容
    public boolean updateNews(NewsEntity newsEntity);
}

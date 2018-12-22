package com.way.service.impl;

import com.way.dao.BgNewsDao;
import com.way.domain.NewsEntity;
import com.way.service.BgNewService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BgNewServiceImpl implements BgNewService {
    @Resource
    private BgNewsDao bgNewsDao;

    public void setBgNewsDao(BgNewsDao bgNewsDao) {
        this.bgNewsDao = bgNewsDao;
    }

    //----------------------------------------------------------------------------
    @Override
    public List<NewsEntity> list(int currentpage, NewsEntity newsEntity) {
        return bgNewsDao.list(currentpage,newsEntity);
    }

    @Override
    public boolean saveNews(NewsEntity newsEntity) {
        return bgNewsDao.saveNews(newsEntity);
    }

    @Override
    public boolean changeNews(NewsEntity newsEntity) {
        return bgNewsDao.changeNews(newsEntity);
    }

    @Override
    public boolean updateNews(NewsEntity newsEntity) {
        return bgNewsDao.updateNews(newsEntity);
    }
}

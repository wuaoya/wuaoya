package com.way.dao.impl;

import com.way.dao.BgNewsDao;
import com.way.domain.NewsEntity;
import com.way.service.BgNewService;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository
public class BgNewsDaoImpl implements BgNewsDao {
    @Resource
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    //----------------------------------------------------------------------------
    @Override
    public List<NewsEntity> list(int currentpage, NewsEntity newsEntity) {
        return null;
    }

    @Override
    public boolean saveNews(NewsEntity newsEntity) {
        return false;
    }

    @Override
    public boolean changeNews(NewsEntity newsEntity) {
        return false;
    }

    @Override
    public boolean updateNews(NewsEntity newsEntity) {
        return false;
    }
}

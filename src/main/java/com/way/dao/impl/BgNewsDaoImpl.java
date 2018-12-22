package com.way.dao.impl;

import com.way.dao.BgNewsDao;
import com.way.domain.NewsEntity;
import org.hibernate.Session;
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
    //-----------------------------记住，这里设置占位符的值从0开始-----------------------------------------------
//    分页查询
    @Override
    public List<NewsEntity> list(int currentpage, NewsEntity newsEntity) {
        Session session=hibernateTemplate.getSessionFactory().getCurrentSession();
        List<NewsEntity>list=session.createQuery("from NewsEntity").setFirstResult((currentpage-1)*3).setMaxResults(3).list();
        return list;
    }
//    添加新闻
    @Override
    public boolean saveNews(NewsEntity newsEntity) {
        Session session=hibernateTemplate.getSessionFactory().getCurrentSession();
       session.save(newsEntity);
       List<NewsEntity>list=session.createQuery("from NewsEntity").list();
        for (NewsEntity tmp:list) {
            if (tmp.getNtitle().equals(newsEntity.getNtitle())){
                return true;
            }
        }
        return false;
    }
//    改变状态
    @Override
    public boolean changeNews(NewsEntity newsEntity) {
        Session session=hibernateTemplate.getSessionFactory().getCurrentSession();
        NewsEntity newsEntity1=(NewsEntity) session.createQuery("from NewsEntity where nid=?").setParameter(0,newsEntity.getNid()).uniqueResult();
        if ("发布".equals(newsEntity1.getNstatus())){
            newsEntity1.setNstatus("隐藏");
        }else{
            newsEntity1.setNstatus("发布");
        }
        session.save(newsEntity1);
        return false;
    }
//    更新新闻
    @Override
    public boolean updateNews(NewsEntity newsEntity) {
        Session session=hibernateTemplate.getSessionFactory().getCurrentSession();
//        调用下面方法
        session.update(alertNews(newsEntity));
        return false;
    }
//    配合更新（先查出来放到框子里，然后在进行更新）
    public NewsEntity alertNews(NewsEntity newsEntity){
        Session session=hibernateTemplate.getSessionFactory().getCurrentSession();
        NewsEntity newsEntity1=(NewsEntity) session.createQuery("from NewsEntity where nid=?").setParameter(0,newsEntity.getNid()).uniqueResult();
        return newsEntity1;
    }
}

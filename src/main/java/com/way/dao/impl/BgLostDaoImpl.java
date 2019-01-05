package com.way.dao.impl;

import com.way.dao.BgLostDao;
import com.way.domain.LostEntity;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository
public class BgLostDaoImpl implements BgLostDao {
    @Resource
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
//---------------------------------------------------------
//      添加
    @Override
    public boolean addLost(LostEntity lostEntity) {
        Session session=hibernateTemplate.getSessionFactory().getCurrentSession();
        session.save(lostEntity);
//       这个判断学生和管理人员的逻辑真的sb，省了，没大影响
        return true;
    }
//    全部列表和分页查询（未完成）
    @Override
    public List<LostEntity> list(int currentpage, LostEntity lostEntity) {
        Session session=hibernateTemplate.getSessionFactory().getCurrentSession();
        session.createQuery("from LostEntity ");
        return null;
    }
//   详情
    @Override
    public LostEntity listDetail(LostEntity lostEntity) {
        Session session=hibernateTemplate.getSessionFactory().getCurrentSession();
        LostEntity lostEntity1=(LostEntity) session.createQuery("from LostEntity where lid=?").setParameter(0,lostEntity.getLid()).uniqueResult();
        return lostEntity1;
    }
//    我发布的
    @Override
    public List<LostEntity> listMine(LostEntity lostEntity) {
        Session session=hibernateTemplate.getSessionFactory().getCurrentSession();
        if (lostEntity.getAid()!=null){
            List<LostEntity>list=session.createQuery("from LostEntity where aid=?").setParameter(0,lostEntity.getAid()).list();
            return list;
        }else{
            List<LostEntity>list=session.createQuery("from LostEntity where sid=?").setParameter(0,lostEntity.getSid()).list();
            return list;
        }
    }
//    改变状态
    @Override
    public boolean changeLstatus(LostEntity lostEntity) {
        Session session=hibernateTemplate.getSessionFactory().getCurrentSession();
        LostEntity lostEntity1=(LostEntity) session.createQuery("from LostEntity where lid=?").setParameter(0,lostEntity.getLid()).uniqueResult();
        if(("发布已确认").equals(lostEntity1.getLstatus())){
            lostEntity1.setLstatus("发布已取消");
            session.update(lostEntity1);
        }


//        这里并没有真正的去查询数据库来判断正确与否
        return true;
    }
}

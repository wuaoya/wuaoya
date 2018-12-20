package com.way.dao.impl;

import com.way.dao.BgAdminDao;
import com.way.domain.AdminEntity;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository
public class BgAdminDaoImpl implements BgAdminDao {
    @Resource
    private HibernateTemplate hibernateTemplate;

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {

        this.hibernateTemplate = hibernateTemplate;
    }
/*--------------------------------------------------------*/
    @Override
    public boolean haveAname(AdminEntity adminEntity) {
        Session session=hibernateTemplate.getSessionFactory().getCurrentSession();
        List<AdminEntity>list=session.createQuery("from AdminEntity where aname=?").setParameter(0,adminEntity.getAname()).list();
        if (list.size()!=0){
            return true;
        }
        return false;
    }

    @Override
    public boolean trueApwd(AdminEntity adminEntity) {
        Session session=hibernateTemplate.getSessionFactory().getCurrentSession();
        AdminEntity adminEntity1=(AdminEntity) session.createQuery("from AdminEntity where aname=?").setParameter(0,adminEntity.getAname()).uniqueResult();
        if (adminEntity1.getApwd().equals(adminEntity.getApwd())){
            return true;
        }
        return false;
    }

    @Override
    public boolean oldApwd(AdminEntity adminEntity) {
        return false;
    }

    @Override
    public boolean newApwd(AdminEntity adminEntity) {
        return false;
    }

    @Override
    public boolean renewApwd(AdminEntity adminEntity) {
        return false;
    }

    @Override
    public boolean changeAdminＭsg(AdminEntity adminEntity) {
        return false;
    }

    @Override
    public boolean addAdmin(AdminEntity adminEntity) {
        return false;
    }

    @Override
    public List<AdminEntity> listAdmin(int page, AdminEntity adminEntity) {
        return null;
    }
}

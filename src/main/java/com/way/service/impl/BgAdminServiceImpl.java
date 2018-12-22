package com.way.service.impl;

import com.way.dao.BgAdminDao;
import com.way.domain.AdminEntity;
import com.way.service.BgAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BgAdminServiceImpl implements BgAdminService {
@Resource
    private BgAdminDao bgAdminDao;

    public void setBgAdminDao(BgAdminDao bgAdminDao) {
        this.bgAdminDao = bgAdminDao;
    }
/*-------------------------------------------------------*/
    
    @Override
    public boolean haveAname(AdminEntity adminEntity) {
        return bgAdminDao.haveAname(adminEntity);
    }

    @Override
    public boolean trueApwd(AdminEntity adminEntity) {
        return bgAdminDao.trueApwd(adminEntity);
    }

    @Override
    public AdminEntity getAdmin(AdminEntity adminEntity) {
        return bgAdminDao.getAdmin(adminEntity);
    }

    @Override
    public boolean oldApwd(AdminEntity adminEntity) {
        return bgAdminDao.oldApwd(adminEntity);
    }

    @Override
    public boolean newApwd(AdminEntity adminEntity) {
        return bgAdminDao.newApwd(adminEntity);
    }

    @Override
    public boolean renewApwd(AdminEntity adminEntity) {
        return bgAdminDao.renewApwd(adminEntity);
    }

    @Override
    public boolean changeAdminＭsg(AdminEntity adminEntity) {
        return bgAdminDao.changeAdminＭsg(adminEntity);
    }

    @Override
    public boolean addAdmin(AdminEntity adminEntity) {
        return bgAdminDao.addAdmin(adminEntity);
    }

    @Override
    public List<AdminEntity> listAdmin(int page, AdminEntity adminEntity) {
        return bgAdminDao.listAdmin(page,adminEntity);
    }
}

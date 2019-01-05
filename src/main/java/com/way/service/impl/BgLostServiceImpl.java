package com.way.service.impl;

import com.way.dao.BgLostDao;
import com.way.domain.LostEntity;
import com.way.service.BgLostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BgLostServiceImpl implements BgLostService {
    @Autowired
    private BgLostDao bgLostDao;

    public void setBgLostDao(BgLostDao bgLostDao) {
        this.bgLostDao = bgLostDao;
    }
//-----------------------------------------------------
    @Override
    public boolean addLost(LostEntity lostEntity) {
        return bgLostDao.addLost(lostEntity);
    }

    @Override
    public List<LostEntity> list(int currentpage, LostEntity lostEntity) {
        return bgLostDao.list(currentpage,lostEntity);
    }

    @Override
    public LostEntity listDetail(LostEntity lostEntity) {
        return bgLostDao.listDetail(lostEntity);
    }



    @Override
    public List<LostEntity> listMine(LostEntity lostEntity) {
        return bgLostDao.listMine(lostEntity);
    }

    @Override
    public boolean changeLstatus(LostEntity lostEntity) {
        return bgLostDao.changeLstatus(lostEntity);
    }
}

package com.way.service;

import com.way.domain.LostEntity;

import java.util.List;

public interface BgLostService {
    //  添加丢失&招领信息
    public boolean addLost(LostEntity lostEntity);

    //  分页展示（条件查询）功能 ---有丢失和招领功能，可以通过时间来查询
    public List<LostEntity> list(int currentpage, LostEntity lostEntity);

    //  通过点击详情来查看详情页面(通过lid来传值，获取全部的信息)
    public LostEntity listDetail(LostEntity lostEntity);

    //  此方法是为了展示“我发布的”列表
    public List<LostEntity>listMine(LostEntity lostEntity);

    //  这个方法是将失物招领改变状态(通过登录的人来找到自己发布的信息来改变状态)
    public boolean changeLstatus(LostEntity lostEntity);
}

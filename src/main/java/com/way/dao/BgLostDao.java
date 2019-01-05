package com.way.dao;

import com.way.domain.LostEntity;

import java.util.List;

/*
* 这里的失物招领功能只提供展示，我们只留联系方式（必填），学生和管理人员具有相同的操作权限，
* 此功能留有备用方法，但考虑到具体情况不必添加这些功能，但在数据库中仍然保留一个冗余字段lstatus应对
* 需求可能改变的情况（未领取&未找到-->已领取&已找到，该功能需要判断是丢失还是招领，
* 需要判断才能存入数据库中）
* 其中，字段laf为一个标识，标识是失物还是招领（只在分页展示全部时使用）
* */
public interface BgLostDao {
//  添加丢失&招领信息
    public boolean addLost(LostEntity lostEntity);

//  分页展示（条件查询）功能 ---有丢失和招领功能，可以通过时间来查询
    public List<LostEntity>list(int currentpage,LostEntity lostEntity);

//  通过点击详情来查看详情页面(通过lid来传值，获取全部的信息)
    public LostEntity listDetail(LostEntity lostEntity);

//  此方法是为了展示“我发布的”列表
    public List<LostEntity>listMine(LostEntity lostEntity);

//  这个方法是将失物招领改变状态(通过登录的人来找到自己发布的信息来改变状态)
    public boolean changeLstatus(LostEntity lostEntity);
}

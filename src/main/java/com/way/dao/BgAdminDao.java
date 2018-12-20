package com.way.dao;


import com.way.domain.AdminEntity;

import java.util.List;

public interface BgAdminDao {

     //登录
  public boolean haveAname(AdminEntity adminEntity);
  public boolean trueApwd(AdminEntity adminEntity);

     //修改个人信息
        /*改密码*/
    public boolean oldApwd(AdminEntity adminEntity);
    public boolean newApwd(AdminEntity adminEntity);
    public boolean renewApwd(AdminEntity adminEntity);

        /*修改电话，修改职务*/
    public boolean changeAdminＭsg(AdminEntity adminEntity);


    //管理员的增改查
        /*添加管理员*/
    public boolean addAdmin(AdminEntity adminEntity);
        /*管理员列表*/
    public List<AdminEntity> listAdmin(int page,AdminEntity adminEntity);
        /*禁用.解除禁用，学生*/



}

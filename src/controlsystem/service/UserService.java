package controlsystem.service;

import controlsystem.entity.T_User;
import controlsystem.entity.T_priviage;

import java.util.List;

public interface UserService {

    int getUserCount();

//    根据账号查询用户
    T_User getuser(String acount);
//更新用户状态
    int updateUser(String ucode,Short ustatus);
    /*
     *获取用户的权限信息
     */
    List<T_priviage> getUserPri(Integer  rid) ;
}

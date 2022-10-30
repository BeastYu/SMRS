package controlsystem.dao;

import controlsystem.entity.T_User;

import java.util.Map;


public interface UserDao {

//    测试
    int select();
//    查询用户信息,根据账号查询（用户编号、用户的手机号码
    T_User selectUserByCondition(String str);
//更新用户账号
    int updateUser(Map<String,Object> paramap);

}

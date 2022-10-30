package controlsystem.service.impl;

import controlsystem.dao.PriDao;
import controlsystem.dao.UserDao;
import controlsystem.entity.T_User;
import controlsystem.entity.T_priviage;
import controlsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    //    引入dao层
    @Autowired
    UserDao userMapper;
    @Autowired
    PriDao priMapper;

    @Override
    public int getUserCount() {
        return userMapper.select();

    }

    @Override
    public T_User getuser(String acount) {
        return userMapper.selectUserByCondition(acount);
    }

    @Override
    public int updateUser(String ucode, Short ustatus) {
        HashMap<String, Object> paramap = new HashMap<>();
        paramap.put("ucode", ucode);
        paramap.put("ustatus", ustatus);
        return userMapper.updateUser(paramap);
    }

    @Override
    public List<T_priviage> getUserPri(Integer rid) {
        //怎么一下把模块/按钮权限全部查询?
        //要求-模块包含按钮权限
        //首先查询该用户的模块权限
        List<T_priviage> t_priviages = priMapper.selectPriviage(rid);
        System.out.println(rid + "--查询到的父级权限--" + t_priviages);
        //根据模块级权限id查询按钮权限
        for (T_priviage priviage : t_priviages) {
            Map<String, Object> paramMap = new HashMap<>();
            paramMap.put("pid", priviage.getPid());
            paramMap.put("rid", rid);
            List<T_priviage> sonPriList = priMapper.selectSonPriviage(paramMap);
            priviage.setPriList(sonPriList);
        }
        return t_priviages;
    }
}

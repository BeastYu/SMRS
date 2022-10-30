package controlsystem.test;

import controlsystem.dao.UserDao;
import controlsystem.entity.T_User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserDaoTest {

    @Autowired
    UserDao userMapper ;

    @Test
    public void test_select(){
        int count= userMapper.select();
        System.out.println(count);
    }

    @Test
    public void test_selectUserByCondition(){
        T_User t_user = userMapper.selectUserByCondition("133");
        System.out.println(t_user);
    }
}

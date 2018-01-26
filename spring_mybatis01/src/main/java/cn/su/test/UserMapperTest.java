package cn.su.test;

import cn.su.mapper.UserMapper;
import cn.su.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserMapperTest {
    private ApplicationContext ac;

    @Before
    public void setUp() throws Exception {
        ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");//得到spring容器
    }

    @Test
    public void testGetUserById() throws Exception {
        UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
        User user = userMapper.getUserById("1");
        System.out.println(user);
    }

}

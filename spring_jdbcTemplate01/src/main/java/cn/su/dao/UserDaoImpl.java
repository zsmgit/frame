package cn.su.dao;

import cn.su.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> findUsers() {
        String sql = "select * from user WHERE id =?";
//        Object[] objects = {"1"};
        return jdbcTemplate.query(sql,new Object[]{"1"},new UserMapper());
    }
}

package cn.su.dao;

import cn.su.po.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class UserMapper implements RowMapper<User> {
    public User mapRow(ResultSet rs, int i) throws SQLException {
        User u = new User();
        u.setId(rs.getString(1));
        u.setName(rs.getString(2));
        u.setPassword(rs.getString(3));
        return u;
    }
}

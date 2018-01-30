package cn.su.dao;

import cn.su.po.User;

import java.util.List;

public interface UserDao {
    public List<User> findUsers();
}

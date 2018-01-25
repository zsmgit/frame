package cn.su.dao;
import cn.su.model.User;
import cn.su.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDao {
    public List<User> findUsers(){
            SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
            List<User> users = sqlSession.selectList("cn.su.mapping.UserMapper.findUsers");
            sqlSession.close();
            return users;
        }


    public User getUser(String id){
        SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
        System.out.println(sqlSession);
        //参数2个：statement,id
        User user = sqlSession.selectOne("cn.su.mapping.UserMapper.getUserById","1");
        sqlSession.close();
        return user;
    }
}

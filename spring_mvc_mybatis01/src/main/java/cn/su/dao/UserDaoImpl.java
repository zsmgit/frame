package cn.su.dao;

import cn.su.po.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserDaoImpl implements UserDao {
//    @Autowired
//    private SqlSessionTemplate sqlSessionTemplate;
//
//    public UserDaoImpl() {
//    }
//
//    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
//        this.sqlSessionTemplate = sqlSessionTemplate;
//    }
//      /**
//     * jdbcTemplate
//     * @return
//      */
//    public List<User> findUsers() {
//        List<User> users = sqlSessionTemplate.selectList("cn.su.mapping.UserMapper.findUsers");
//        return users;
//    }
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    /**
     * sqlSessionFactory
     * @return
     */
    public List<User> findUsers() {
        return sqlSessionFactory.openSession().selectList("cn.su.mapping.UserMapper.findUsers");
    }
}

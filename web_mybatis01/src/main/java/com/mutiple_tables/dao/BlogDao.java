package com.mutiple_tables.dao;

import cn.su.utils.MybatisUtil;
import com.mutiple_tables.model.Blog;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BlogDao {
    public List<Blog> findBlogs(){
        SqlSession sqlSession = MybatisUtil.getSqlSessionFactory().openSession();
        List<Blog> blogs = sqlSession.selectList("com.mutiple_tables.mapping.BlogMapper.findBlogs");
        sqlSession.close();
        return blogs;
    }
}

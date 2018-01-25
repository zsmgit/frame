package cn.su.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    private static SqlSessionFactory factory;

    private MybatisUtil() {
    }
    public static SqlSessionFactory getSqlSessionFactory(){
        //java和resources路径最后都会在classes路径下
        try{
            String resource = "config/mybatis-config.xml";
            InputStream in = Resources.getResourceAsStream(resource);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            factory = builder.build(in);
        }catch (IOException e){
            e.fillInStackTrace();
        }
        if(factory == null){
            System.out.println("sqlSessionFactory is"+null);
        }
        return factory;
    }
}

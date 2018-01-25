package test.cn.su.utils;

import cn.su.utils.MybatisUtil;
import junit.framework.Test;
import junit.framework.TestSuite; 
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSessionFactory;

/** 
* MybatisUtil Tester. 
* 
* @author <Authors name> 
* @since <pre>01/25/2018</pre> 
* @version 1.0 
*/ 
public class MybatisUtilTest extends TestCase { 
public MybatisUtilTest(String name) { 
super(name); 
} 

public void setUp() throws Exception { 
super.setUp(); 
} 

public void tearDown() throws Exception { 
super.tearDown(); 
} 

/** 
* 
* Method: getSqlSessionFactory() 
* 
*/ 
public void testGetSqlSessionFactory() throws Exception {
    SqlSessionFactory factory = MybatisUtil.getSqlSessionFactory();
    System.out.println(factory);
} 



public static Test suite() { 
return new TestSuite(MybatisUtilTest.class); 
} 
} 

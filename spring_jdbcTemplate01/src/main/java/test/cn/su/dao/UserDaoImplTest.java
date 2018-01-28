package test.cn.su.dao; 

import cn.su.dao.UserDao;
import cn.su.po.User;
import junit.framework.Test;
import junit.framework.TestSuite; 
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/** 
* UserDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>01/28/2018</pre> 
* @version 1.0 
*/ 
public class UserDaoImplTest extends TestCase { 
public UserDaoImplTest(String name) { 
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
* Method: findUsers() 
* 
*/ 
public void testFindUsers() throws Exception {
    ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    UserDao userDao = (UserDao) ac.getBean("userDaoImpl");
    List<User> users = userDao.findUsers();
    System.out.println(users.toString());
}



public static Test suite() { 
return new TestSuite(UserDaoImplTest.class); 
} 
} 

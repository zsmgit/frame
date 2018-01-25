package test.cn.su.dao;

import cn.su.dao.UserDao;
import cn.su.model.User;
import junit.framework.Test;
import junit.framework.TestSuite; 
import junit.framework.TestCase; 

/** 
* UserDao Tester. 
* 
* @author <Authors name> 
* @since <pre>01/25/2018</pre> 
* @version 1.0 
*/ 
public class UserDaoTest extends TestCase { 
public UserDaoTest(String name) { 
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
//TODO: Test goes here... 
} 

/** 
* 
* Method: getUser(String id) 
* 
*/ 
public void testGetUser() throws Exception { 
    UserDao userDao = new UserDao();
    User user = userDao.getUser("2");
    System.out.println(user.toString());
} 



public static Test suite() { 
return new TestSuite(UserDaoTest.class); 
} 
} 

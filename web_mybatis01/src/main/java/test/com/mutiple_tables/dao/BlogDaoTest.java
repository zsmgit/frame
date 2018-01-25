package test.com.mutiple_tables.dao; 

import com.mutiple_tables.dao.BlogDao;
import com.mutiple_tables.model.Blog;
import junit.framework.Test;
import junit.framework.TestSuite; 
import junit.framework.TestCase;

import java.util.List;

/** 
* BlogDao Tester. 
* 
* @author <Authors name> 
* @since <pre>01/25/2018</pre> 
* @version 1.0 
*/ 
public class BlogDaoTest extends TestCase { 
public BlogDaoTest(String name) { 
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
* Method: findBlogs() 
* 
*/ 
public void testFindBlogs() throws Exception {
    BlogDao blogDao = new BlogDao();
    List<Blog> blogs = blogDao.findBlogs();
    System.out.println(blogs.toString());
    //[Blog{id=1, tittle='c', author=Author{id=3, name='b', password='123'}, post=[Post{id=1, tittle='c', content='content1'}, Post{id=2, tittle='c', content='content3'}, Post{id=3, tittle='c', content='content5'}]}]
}



public static Test suite() { 
return new TestSuite(BlogDaoTest.class); 
} 
} 

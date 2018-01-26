package spring;

import no_spring.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBean {
    /**
     * 1. 创建一个Spring的IOC容器对象
     * 2. 从IOC容器中获取Bean实例
     * 3. 调用sayHello()方法
     *
     * @param args
     */
    public static void main(String[] args) {
        //初始化IOC容器时调用了pojo的初始化方法和set方法
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        //no param init
        // setter
        Hello h = (Hello) ac.getBean("hello");
        h.sayHello();

    }
}

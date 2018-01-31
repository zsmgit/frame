package application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Application can not directly in  main/java package==default package
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    /**
     * 检索由您的应用程序创建的所有bean，或者由于Spring Boot而自动添加的bean
     * @param ac
     * @return
     */
    @Bean
    public CommandLineRunner runner(ApplicationContext ac){
        return args ->{
            System.out.println("Let's inspect the beans provided by Spring Boot:");
            String[] beanNames = ac.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for(String beanName:beanNames){
                System.out.println(beanName);
            }
        };
    }
}

package main;

import com.liuyuan.dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService UserService =  context.getBean("UserService", UserService.class);
        UserService.sayHello();
    }
}

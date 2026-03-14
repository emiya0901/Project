package main;

import com.liuyuan.dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中获取 testDao 实例, 参数：testDao为配置文件中的bean id
        // 通过接口获取 bean（Spring 会返回实现类的实例）
        TestDao testDao = (TestDao) applicationContext.getBean("testDao", TestDao.class);
        testDao.sayHello();
    }
}

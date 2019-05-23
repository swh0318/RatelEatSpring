package com.ratel.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
  public static void main(String[] args) {
      //初始化spring容器，加载配置文件
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
      //通过容器获取userDao实例
      UserDao userDao = (UserDao) applicationContext.getBean("UserDao");
      //调用say方法
      userDao.say();

      }

}

package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @包名 com.itheima
 * @Author MuBuYi
 * @Date 2020-08-16 20:57
 */
public class DaoTest {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao dao = act.getBean(ItemsDao.class);
        Items findId = dao.findById(1);
        System.out.println(findId);
    }
}

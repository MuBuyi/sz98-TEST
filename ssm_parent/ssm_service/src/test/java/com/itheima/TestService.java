package com.itheima;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @包名 com.itheima
 * @Author MuBuYi
 * @Date 2020-08-16 21:56
 */
public class TestService {
    @Test
    public void test01() {
        ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("classpath:spring-service.xml");
        ItemsService service = act.getBean(ItemsService.class);
        Items findId = service.findById(2);
        System.out.println(findId);
    }
}

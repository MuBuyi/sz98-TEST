package com.itheima.test;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

import java.util.List;

/**
 * @包名 com.itheima.test
 * @Author MuBuYi
 * @Date 2020-08-17 10:24
 */
public class TestWeb {
    @Test
    public void test02(){
    ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
    ItemsService service = act.getBean(ItemsService.class);
    List<Items> findAll = service.findAll();
        System.out.println(findAll);
    }
}

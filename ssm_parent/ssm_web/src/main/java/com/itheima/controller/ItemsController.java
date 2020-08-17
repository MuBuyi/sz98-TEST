package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @包名 com.itheima.controller
 * @Author MuBuYi
 * @Date 2020-08-16 22:09
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
   /* public String findById(int id, Model model){
        //model数据模型
        Items item = itemsService.findById(id);
        //返回给页面
        model.addAttribute("item",item);
        return "item";
    }*/
    @GetMapping("/findAll")
    public String findAll(Model model){
        //model数据模型
        List<Items> items = itemsService.findAll();
        //返回给页面
        model.addAttribute("items",items);
        return "items";
    }
}

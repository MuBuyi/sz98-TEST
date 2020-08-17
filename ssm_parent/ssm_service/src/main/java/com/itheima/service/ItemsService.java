package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @包名 com.itheima.service
 * @Author MuBuYi
 * @Date 2020-08-16 21:53
 */
public interface ItemsService {
    Items findById(int id);

    /**
     * 查询所有
     * @return
     */
    List<Items> findAll();
}

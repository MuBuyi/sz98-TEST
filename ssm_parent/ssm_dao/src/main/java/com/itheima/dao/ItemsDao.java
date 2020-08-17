package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @包名 com.itheima.dao
 * @Author MuBuYi
 * @Date 2020-08-16 20:20
 */
public interface ItemsDao {

    Items findById(int id);

    List<Items> findAll();
}

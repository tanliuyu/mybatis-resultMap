package com.tly.spring.Dao.Impl;

import com.tly.spring.Dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
        public void saveUser(){
            System.out.println("保存成功");
        }
}

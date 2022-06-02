package com.baizhi.service;

import com.baizhi.bean.Admin;
import com.baizhi.dao.AdminsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminsDao adminDao;
    @Override
    public void save(Admin admin) {
        adminDao.save(admin);
    }

    @Override
    public List<Admin> getAll() {

       return  adminDao.getAll();
    }

    @Override
    public void update(String name,String id) {
        adminDao.update(name,id);
    }
}

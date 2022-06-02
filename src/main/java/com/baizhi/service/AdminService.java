package com.baizhi.service;

import com.baizhi.bean.Admin;

import java.util.List;

public interface AdminService {
    public void save(Admin admin);

    public List<Admin> getAll();

    public void update(String name,String id);

}

package com.baizhi.dao;

import com.baizhi.bean.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdminsDao {
    public void save(Admin admin);

    public List<Admin> getAll();

    public void update(@Param("name") String name, @Param("id") String id);


}

package com.baizhi;

import com.baizhi.bean.Admin;
import com.baizhi.dao.AdminsDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class})
public class AdminTest {
    @Autowired
    private AdminsDao adminsDao;

    @Test
    public void test1(){
        System.out.println("ceshi");
        adminsDao.save(new Admin(14,"12","12","12","0"));

    }



}

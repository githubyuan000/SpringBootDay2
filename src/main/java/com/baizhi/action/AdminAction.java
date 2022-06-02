package com.baizhi.action;

import com.baizhi.bean.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminAction {
    @Autowired
    private AdminService adminService;
    //添加
    @RequestMapping("/save")
    public String save(Admin admin){
        adminService.save(admin);
        return "redirect:/admin/schAll";
    }
    @RequestMapping("/schAll")
    public String schAll(HttpServletRequest request){
        List<Admin> list = adminService.getAll();
        request.setAttribute("adminList",list);
        return "showAll";
    }
}

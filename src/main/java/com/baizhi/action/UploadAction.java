package com.baizhi.action;

import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;

@Controller
@RequestMapping("/uploadAction")
public class UploadAction {
    @RequestMapping("/u")
    public String uploadFile(MultipartFile upload, HttpSession session) throws Exception{
        //获取目标文件夹的位置
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("/file");
        //在目标文件夹中创建于目标文件名称相同的文件
        File file = new File(realPath+"/"+upload.getOriginalFilename());
        //把上传文件的内容传到空文件
        upload.transferTo(file);
        return "index";

    }
    @RequestMapping("/sc")
    public  void sc(String names, HttpSession session, HttpServletResponse response) throws Exception{
        names = URLEncoder.encode(names,"UTF-8");
        System.out.println(names);
        //String downName = new String(names.getBytes("UTF-8"),"ISO-8859-1");
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("/file");
        FileInputStream is = new FileInputStream(new File(realPath,names));
        ServletOutputStream outputStream = response.getOutputStream();
        response.setHeader("content-disposition","attachment;fileName="+ URLEncoder.encode(names,"UTF-8"));
        IOUtils.copy(is,outputStream);
        IOUtils.closeQuietly(is);
        IOUtils.closeQuietly(outputStream);
    }
    @RequestMapping("/downLoad")
    public ResponseEntity<byte[]> downLoad(String names, HttpSession session) throws Exception{
        ServletContext servletContext = session.getServletContext();
        String realPath = servletContext.getRealPath("/file");
        File file = new File(realPath+"/"+names);
        byte[] bytes = FileUtils.readFileToByteArray(file);
        //创建请求头
        HttpHeaders httpHeaders = new HttpHeaders();
        //解决下载文件后乱码问题
        String downName = new String(names.getBytes("UTF-8"),"ISO-8859-1");
        httpHeaders.setContentDispositionFormData("attachment",downName);
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]> (bytes,httpHeaders, HttpStatus.CREATED);

    }
}

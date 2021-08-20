package com.zhaoqw.springboot_web.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/12 - 08 - 12 - 20:16
 * @Description: com.zhaoqw.springboot_web.servlet
 * @version: 1.0
 */
@WebServlet(name = "myServlet",urlPatterns = "/srv")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("111");
        super.doGet(req, resp);
    }


}
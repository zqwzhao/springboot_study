package com.zhaoqw.springboot_web.servlet;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @Auther: zhaoqw
 * @Date: 2021/8/17 - 08 - 17 - 16:40
 * @Description: com.zhaoqw.springboot_web.servlet
 * @version: 1.0
 */
public class MyHttpSessionListener implements HttpSessionListener {
    public static int online=0;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        se.getSession().setAttribute("aaa","aaa");
        System.out.println("创建session");
        online++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("销毁session");
        online--;
    }
}

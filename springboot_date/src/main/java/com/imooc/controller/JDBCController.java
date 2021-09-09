package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-05 21:22]
 */

@RestController
public class JDBCController {


    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/selectAll",method = RequestMethod.GET)
    public List<Map<String, Object>> selectAll() {
        String sql = "select * from t_emp";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }


    @RequestMapping("/addEmp")
    public String addEmp() {
        String sql = "insert into t_emp(empno,ename) values(8003,'niudiewei')";
        int update = jdbcTemplate.update(sql);
        System.out.println(update);
        return "add_successful";
    }

    @RequestMapping(value = "/updateEmp/{empno}",method = RequestMethod.GET)
    public String selectAll(@PathVariable("empno") int empno) {
        String sql = "update t_emp set ename= ? where empno = " + empno;
        String ename = "niudiewei";
        int update = jdbcTemplate.update(sql,ename);
        System.out.println(update);
        return update>0 ? "successful":"false";
    }


    @RequestMapping("deleteEmp/{empno}")
    public String deleteEmp(@PathVariable("empno") int empno) {
        String sql = "delete from t_emp where empno = " + empno;
        int update = jdbcTemplate.update(sql);
        System.out.println(update);
        return "delete_success";
    }
}

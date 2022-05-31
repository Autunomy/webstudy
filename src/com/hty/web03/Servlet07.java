package com.hty.web03;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.fastjson.JSON;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

//根据书籍id查询书名
public class Servlet07 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            //获取页面传递的书籍的id
            Integer id = Integer.valueOf(req.getParameter("id"));
            //数据库连接池
            Properties prop = new Properties();
            prop.load(this.getClass().getClassLoader().getResourceAsStream("db.properties"));
            DataSource druidDataSource = DruidDataSourceFactory.createDataSource(prop);
            QueryRunner queryRunner = new QueryRunner(druidDataSource);
            Map result = (Map)queryRunner.query("select * from book where id = ?", id, new MapHandler());

            resp.setContentType("application/json;charset=utf-8");
            resp.getWriter().write(JSON.toJSONString(result));

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

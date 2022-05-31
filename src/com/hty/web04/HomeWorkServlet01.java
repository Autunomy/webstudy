package com.hty.web04;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.fastjson.JSON;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class HomeWorkServlet01 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            req.setCharacterEncoding("utf-8");

            Properties pro = new Properties();
            pro.load(this.getClass().getClassLoader().getResourceAsStream("db.properties"));

            DataSource druidDataSource = DruidDataSourceFactory.createDataSource(pro);
            QueryRunner queryRunner = new QueryRunner(druidDataSource);
            List<String> result = (List<String>)queryRunner.query("select name from city",new ArrayListHandler());

//            System.out.println(JSON.toJSONString(result));
            resp.setContentType("application/json;charset=utf-8");
            resp.getWriter().write(JSON.toJSONString(result));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.hty.web03;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.junit.Test;

import java.sql.SQLException;

public class DataSourceTest {
    @Test
    public void test01() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://10.10.10.134:3306/java21?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai");
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");

        QueryRunner queryRunner = new QueryRunner(druidDataSource);
        Object query = queryRunner.query("select * from book", new MapListHandler());

    }
}

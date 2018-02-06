package com.aop.test;

import java.sql.*;

/**
 * Created by hew on 2018/1/25.
 */
public class JdbcTest {

    public static void main(String[] args) {
        String driverName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/aop?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "root";

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //加载数据库驱动
            Class.forName(driverName);
            //创建数据库连接
            conn = DriverManager.getConnection(url, username, password);
            //创建PrepareStatement对象，执行sql查询语句
            String sql = "select * from airline_company";
            ps = conn.prepareStatement(sql);

            rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println("公司名称：" + rs.getString("company_name"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                ps.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

    }
}

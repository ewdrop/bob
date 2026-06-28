package com.wwj.lianxi.repair;

import java.sql.*;

public class JDBC {
    /**private static final String url =
            "jdbc:mysql://localhost:3306/repair_db?useSSL=false&serverTimezone=Asia/Shanghai&characterEncoding=utf8";
    private static final String user = "root";
    private static final String password = "password";

    try{
        insert(3L,"门锁坏了","待受理");
        queryAll();
        queryByStatus("待受理");
    }catch (
    SQLException e){
        System.out.println("数据库错误"+e.getMessage());
    }

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    static void insert(Long id, String desc, String status) throws SQLException {
        String sql = "INSERT INTO repair_order(id, description, status) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(1, id);
            ps.setString(2, desc);
            ps.setString(3, status);
            ps.executeUpdate();
            System.out.println("插入成功" + id);
        }
    }

    static void queryAll() throws SQLException {
        String sql = "SELECT id,description,status FROM repair_order";
        try(Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){
            System.out.println("---全部报修---");
            while (rs.next()) {
                long id = rs.getLong("id");
                String desc = rs.getString("description");
                String status = rs.getString("status");
                System.out.println(id+"|"+desc+"|"+status);
            }
        }
    }

    static void  queryByStatus(String status) throws SQLException {
        String sql = "SELECT id, description,status FROM repair_order WHERE status = ?";
        try(Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1,status);
            try(ResultSet rs = ps.executeQuery()){
                System.out.println("------状态="+status+"-------");
                while (rs.next()){
                    System.out.println(rs.getLong("id")+"|"+rs.getString("description"));
                }
            }
        }
    }*/

}

package com.vti.utils;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
    public static void main(String[] args) {
        JdbcUtils.getConnection();
    }
    static Connection connection = null ;

    public static Connection getConnection(){
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("C:\\Users\\Precision 7530\\Documents\\GitHub\\TEsting system10\\src\\main\\resources\\db.properties"));

        String username = properties.getProperty("username") ;
        String password = properties.getProperty("password");
        String url =properties.getProperty("url");
        String driver = properties.getProperty("driver"); ;
        Class.forName(driver);
        connection = DriverManager.getConnection(url, username , password);
    if (connection!= null){
//        System.out.println("Ket noi vao mySQL thanh cong");
    } else {
        System.out.println("Ket noi that bai ");
    }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static void closeConnection(){
        if (connection!= null){
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Co loi xay ra");
            }
        }
    }
}

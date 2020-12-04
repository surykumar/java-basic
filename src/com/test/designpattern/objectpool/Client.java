package com.test.designpattern.objectpool;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Client {
    public static void main(String[] args) {
        try {
            ConnectionPool reusablepool = new ConnectionPool("com.mysql.cj.jdbc.Driver",
                    "jdbc:mysql://localhost:3306/sakila?createDatabaseIfNotExist=true",
                    "root", "mysql");
            Connection con1 = reusablepool.getInstance();
            Connection con2 = reusablepool.getInstance();
            System.out.println("Creating Connection 1: " + con1);
            System.out.println("Creating Connection 2: " + con2);
//            System.out.println("Releasing Connection 1 to Pool... " + con1);
//            reusablepool.releaseObject(con1);
//            System.out.println("Releasing Connection 2 to Pool... " + con2);
//            reusablepool.releaseObject(con2);

            Thread.sleep(10);

            Connection con3 = reusablepool.getInstance();
            System.out.println("Creating Connection 3... " + con3);
            Connection con4 = reusablepool.getInstance();
            System.out.println("Creating Connection 4... " + con4);
            Connection con5 = reusablepool.getInstance();
            System.out.println("Creating Connection 5... " + con5);
            reusablepool.releaseObject(con2);
            Connection con6 = reusablepool.getInstance();
            System.out.println("Creating Connection 6... " + con6);

            Statement statement = con3.createStatement();

//            DataSource dataSource = DBUtils.getDataSource();
//            Connection connection = dataSource.getConnection();
//            System.out.println("Connection..." + connection);
//            connection.close();
//            Connection connection1 = dataSource.getConnection();
//            Connection connection2 = dataSource.getConnection();
//            System.out.println("Connection...1" + connection1);
//            System.out.println("Connection...2" + connection2);
//
//            Statement statement1 = connection.createStatement();


        }catch (SQLException | InterruptedException e){
            e.printStackTrace();
        }
    }
}

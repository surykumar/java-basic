package com.test.designpattern.objectpool;
import java.sql.Connection;

public class Client {
    public static void main(String[] args) {
        ConnectionPool reusablepool = new ConnectionPool("com.mysql.jdbc.Driver",
                "jdbc:mysql://localhost:3306/sakila?createDatabaseIfNotExist=true",
                "root", "zemoso123");
        Connection con = reusablepool.getInstance();
        // Use Connection object as per the requirement(CRUD operation).
        reusablepool.releaseObject(con);
    }
}

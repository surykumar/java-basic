package com.test.designpattern.objectpool;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

// This JDBC Utils class is just for testing Hikari Pool Connection
public class DBUtils {
    private static HikariDataSource dataSource;
    static{
            HikariConfig config = new HikariConfig();
            config.setJdbcUrl( "jdbc:mysql://localhost:3306/sakila?createDatabaseIfNotExist=true" );
            config.setUsername( "root" );
            config.setPassword( "mysql" );
            config.addDataSourceProperty( "cachePrepStmts" , "true" );
            config.addDataSourceProperty( "prepStmtCacheSize" , "250" );
            config.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );
           dataSource = new HikariDataSource( config );
    }

    public static DataSource getDataSource(){
        return dataSource;
    }
}

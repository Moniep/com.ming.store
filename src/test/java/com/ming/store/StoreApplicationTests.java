package com.ming.store;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class StoreApplicationTests {
    @Autowired //自动装配
    private DataSource dataSource;

    @Test
    void contextLoads() {
    }


    /**
     * 数据库连接池:
     * 1.DBCP
     * 2.C3P0
     * 3.Hikari
     * HikariProxyConnection@1027623306 wrapping com.mysql.cj.jdbc.ConnectionImpl@14d1737a
     * */
    @Test
    void getConnection() throws SQLException {
        System.out.println(dataSource.getConnection());
    }

}

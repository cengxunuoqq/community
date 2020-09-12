package com.lg.community;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTest {
    @Autowired
    DataSource dataSource;

    @Test
    public void test() throws SQLException {
        System.out.println(dataSource.getConnection());
    }
}

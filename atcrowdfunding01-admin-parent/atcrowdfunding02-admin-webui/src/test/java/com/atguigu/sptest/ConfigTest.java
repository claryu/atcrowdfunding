/**
 * 
 */
package com.atguigu.sptest;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.mapper.AdminMapper;
import com.atguigu.crowd.service.api.AdminService;

/**
 *
 * @Author: xy187 2020年11月29日 下午5:11:59
 *
 * @Desc:
 */

// 指定 Spring 给 Junit 提供的运行器类
@RunWith(SpringJUnit4ClassRunner.class)
// 加载 Spring 配置文件的注解
@ContextConfiguration(locations = { "classpath:spring-persist-mybatis.xml", "classpath:spring-persist-tx.xml" })
public class ConfigTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private AdminService adminService;

    @Test
    public void testTX() {
        Admin admin = new Admin(null, "Jone", "123", "sunny", "liu.ying@dxc.com", null);
        adminService.saveAdmin(admin);
    }

    @Test
    public void testLog() {
        Admin usr = adminMapper.selectByPrimaryKey(3);
        Logger logger = LoggerFactory.getLogger(ConfigTest.class);
        logger.debug("Bebug messages....");
        logger.debug("Bebug messages....");
        logger.debug("Bebug messages....");
        logger.debug("Bebug messages....");
        logger.debug("Bebug messages....");
        System.out.println(logger);
    }

    @Test
    public void TestMapper() {
        Admin admin = new Admin(null, "Allen", "123123", "张红波", "zhang.hong@dxc.com", null);
        int count = adminMapper.insert(admin);
        System.out.println("count: " + count);
    }

    @Test
    public void TestConnection() throws SQLException {
        Connection connection = dataSource.getConnection();

        System.out.println(connection);
    }
}

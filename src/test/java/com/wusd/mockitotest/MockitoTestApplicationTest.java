package com.wusd.mockitotest;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author wusd
 * @date 2020/1/14 10:35
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MockitoTestApplication.class)
@Slf4j
public abstract class MockitoTestApplicationTest {
//    @Before
//    public void setUp() throws Exception {
//        // 初始化测试用例类中由Mockito的注解标注的所有模拟对象
//        MockitoAnnotations.initMocks(this);
//    }
}

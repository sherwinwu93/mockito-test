package com.wusd.mockitotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wusd
 * @date 2020/1/14 10:29
 */
@SpringBootApplication(
        scanBasePackages = {
                "com.wusd.mockitotest"
        }
)
public class MockitoTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(MockitoTestApplication.class, args);
    }
}

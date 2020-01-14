package com.wusd.mockitotest.model;

import lombok.Data;

/**
 * @author wusd
 * @date 2020/1/14 10:31
 */
@Data
public class Account {
    private int id;
    private int balance;
    private Person person;
}

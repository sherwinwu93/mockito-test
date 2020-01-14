package com.wusd.mockitotest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wusd
 * @date 2020/1/14 10:31
 */
@Data
@AllArgsConstructor
public class Person {
    private int     id;
    private String  name;
    private Account defaultAccount;
}

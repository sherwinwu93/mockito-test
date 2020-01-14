package com.wusd.mockitotest.service;

import com.wusd.mockitotest.model.Account;
import com.wusd.mockitotest.model.Person;

/**
 * @author wusd
 * @date 2020/1/14 10:32
 */
public interface PersonService {
    /**
     * 查询人员用户
     */
    Person getPerson(int id);

    /**
     * 得到人员默认账户
     */
    Account getDefaultAccount(Person p);
}

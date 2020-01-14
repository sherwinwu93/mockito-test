package com.wusd.mockitotest.service.impl;

import com.wusd.mockitotest.model.Account;
import com.wusd.mockitotest.model.Person;
import com.wusd.mockitotest.service.AccountService;
import com.wusd.mockitotest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wusd
 * @date 2020/1/14 10:33
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    private Map<Integer, Object[]> accountDatabase;

    @Autowired
    private PersonService personService;

    @PostConstruct
    public void init() {
        accountDatabase = new HashMap<Integer, Object[]>();
        //字段：账号,余额
        accountDatabase.put(100, new Object[]{"6225100", 68861});
        accountDatabase.put(101, new Object[]{"6225101", 1851});
        accountDatabase.put(102, new Object[]{"6225102", 845});
        accountDatabase.put(103, new Object[]{"6225103", 16598});
    }

    @Override
    public int queryBalanceOfDefaultAccount(int personId) {
        Person person = personService.getPerson(personId);
        Account defaultAccount = person.getDefaultAccount();
        return (Integer) accountDatabase.get(defaultAccount.getId())[1];
    }

}

package com.wusd.mockitotest.service;

import com.wusd.mockitotest.MockitoTestApplicationTest;
import com.wusd.mockitotest.model.Account;
import com.wusd.mockitotest.model.Person;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * @author wusd
 * @date 2020/1/14 10:38
 */
public class AccountServiceTest extends MockitoTestApplicationTest {
    //    @Autowired
    @Autowired
    private AccountService accountService;

    @MockBean
    private PersonService personService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    /**
     * 查询人员默认账户余额
     */
    @Test
    public void queryBalanceOfDefaultAccount() {
        int id = 0;
        Account account = new Account();
        account.setId(100);
        Person alex = new Person(id, "Alex", account);
        when(personService.getPerson(0)).thenReturn(alex);

        int balanceOfDefaultAccount = accountService.queryBalanceOfDefaultAccount(0);
        assertEquals(68861, balanceOfDefaultAccount);
    }

}

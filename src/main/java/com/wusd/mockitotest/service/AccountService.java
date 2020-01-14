package com.wusd.mockitotest.service;

/**
 * @author wusd
 * @date 2020/1/14 10:33
 */
public interface AccountService {
    /**
     * 查询人员默认账户余额
     */
    int queryBalanceOfDefaultAccount(int personId);
}

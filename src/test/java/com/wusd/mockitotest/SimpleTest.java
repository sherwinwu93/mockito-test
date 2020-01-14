package com.wusd.mockitotest;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * @author wusd
 * @date 2020/1/14 10:51
 */
public class SimpleTest {
    @Test
    public void simpleTest() {
        //创建mock对象,参数可以是类,也可以是接口
        List<String> list = mock(List.class);

        //设置方法的预期返回值
        when(list.get(0)).thenReturn("helloworld");
        //设置方法返回异常
        when(list.get(1)).thenThrow(new RuntimeException("test excpetion"));

        //没有返回值的void方法与其设定(支持迭代风格，第一次调用donothing,第二次dothrow抛出runtime异常)
        doNothing().doThrow(new RuntimeException("void exception")).when(list).clear();
        list.clear();
        list.clear();
        verify(list, times(2)).clear();

        String result = list.get(0);

        //验证方法调用
        verify(list).get(0);

        Assert.assertEquals("helloworld", result);
    }

    /**
     * Matchers类内加你有很多参数匹配器 anyInt、anyString、anyMap.....Mockito类继承于Matchers,Stubbing时使用内建参数匹配器
     */
    @Test
    public void argumentMatcherTest() {
        List<String> list = mock(List.class);

        when(list.get(anyInt())).thenReturn("hello", "world");

        String result = list.get(0) + list.get(1);

        verify(list, times(2)).get(anyInt());

        Assert.assertEquals("helloworld", result);
    }
}

package com.zking.test;

import com.zking.test.p1.*;
import com.zking.test.p3.Demo3;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Method;
import java.util.Arrays;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class Demo3Test {

    @Autowired
    private Demo3 demo3;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test1() throws Exception {
        System.out.println(demo3);


        System.out.println("ok....");
    }


}

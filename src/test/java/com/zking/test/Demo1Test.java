package com.zking.test;

import com.zking.test.p1.*;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Demo1Test {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test1() throws Exception {
        MyAnnotation1 annotation = Demo1.class.getAnnotation(MyAnnotation1.class);
        System.out.println(annotation.name());

        annotation = Demo1.class.getDeclaredField("age").getAnnotation(MyAnnotation1.class);
        System.out.println(annotation.name());
    }

    @Test
    public void test2() throws Exception {
        Method method = Demo1.class.getMethod("list");
        System.out.println(method);
        MyAnnotation2 annotation2 = method.getAnnotation(MyAnnotation2.class);
        TranscationModel model = annotation2.model();
        System.out.println(model);
    }

    @Test
    public void test3() throws Exception {
        Method method = Demo1.class.getMethod("edit");
        System.out.println(method);
        MyAnnotation3 annotation3 = method.getAnnotation(MyAnnotation3.class);
        TranscationModel[] models = annotation3.models();
        System.out.println(Arrays.toString(models));
    }
}

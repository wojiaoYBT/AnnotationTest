package com.zking.test.p3;

import org.springframework.stereotype.Component;

@Component
public class Demo3 {

    public void hello(@IsNotNull(true) String name) {
        System.out.println("hello:" + name);
    }
}

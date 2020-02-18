package com.zking.test.p1;

import java.lang.annotation.*;


@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation1 {
    String name();
}

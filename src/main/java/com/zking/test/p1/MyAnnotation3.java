package com.zking.test.p1;

import java.lang.annotation.*;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation3 {
    TranscationModel[] models() default TranscationModel.ReadWrite;
}

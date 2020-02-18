package com.zking.test.p1;

import java.lang.annotation.*;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAnnotation2 {
    TranscationModel model() default TranscationModel.ReadWrite;
}

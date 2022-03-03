package com.twobitjay.common;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
public @interface LeetAnnotations {
    int id();

    String name() default "";

    String url() default "https://leetcode.com/problemset/all/";

    boolean premium() default false;
}

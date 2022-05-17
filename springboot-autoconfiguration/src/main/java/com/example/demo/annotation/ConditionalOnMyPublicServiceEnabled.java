package com.example.demo.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@Documented
@Retention(RUNTIME)
@Target(METHOD)
@ConditionalOnProperty(prefix="enable",value = "public", havingValue = "true")
public @interface ConditionalOnMyPublicServiceEnabled {

}

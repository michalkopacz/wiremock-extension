package com.jens_piegsa.junit;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author Jens Piegsa
 */
@Documented
@Target(FIELD)
@Retention(RUNTIME)
public @interface InjectServer {
}

package org.springframework.samples.petclinic.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) //이 어노테이션을 언제까지 유지할꺼냐라는 의미
public @interface LogExecutionTime { //어노테이션으로 생성
}

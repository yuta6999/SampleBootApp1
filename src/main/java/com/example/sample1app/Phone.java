//▼リスト4-21
package com.example.sample1app;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.ReportAsSingleViolation;

@Documented
@Constraint(validatedBy = PhoneValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
//▼リスト4-24
public @interface Phone {

  String message() default "please input a phone number.";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

  boolean onlyNumber() default false;
  
}
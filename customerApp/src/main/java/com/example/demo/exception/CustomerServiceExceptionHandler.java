package com.example.demo.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice


  public   class CustomerServiceExceptionHandler extends ResponseEntityExceptionHandler {
        CustomerServiceExceptionHandler() {
        }

    }

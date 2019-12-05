package com.osl.testcuba;

import com.haulmont.cuba.core.global.SupportedByClient;

public class MyCustomValidationException extends RuntimeException {
    public String message;
    public MyCustomValidationException(String message){
        super(message);
    }
}

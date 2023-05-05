package com.smarttalent.exceptions;

public class GeneralExcepcion extends AssertionError{
    private static final long serialVersionUID =1L;
    public GeneralExcepcion (String message, Throwable cause){
        super(message, cause);
    }
    public GeneralExcepcion (String message){
        super(message);
    }

}

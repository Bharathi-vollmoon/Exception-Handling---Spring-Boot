package com.example.Office.exception;

public class EmployeeAlreadyExistsException extends RuntimeException{

    public EmployeeAlreadyExistsException(String message){
        super(message);


    }
}

package com.example.Office.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
   // @ResponseStatus(HttpStatus.NOT_FOUND)
        public ResponseEntity<ErrorResponse> handleEmployeeNotFoundException(EmployeeNotFoundException e){
            ErrorResponse error = new ErrorResponse(
                    404,e.getMessage()
            );
            return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(EmployeeAlreadyExistsException.class)
  //@ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<ErrorResponse> handleEmployeeAlreadyExistsException(EmployeeAlreadyExistsException e){
        ErrorResponse error =  new ErrorResponse(
                409,e.getMessage()
        );
        return new ResponseEntity<>(error,HttpStatus.CONFLICT);
    }
}

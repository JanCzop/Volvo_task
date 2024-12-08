package com.example.volvotask.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.net.BindException;

@ControllerAdvice
public class Exceptions_handler {
    @ExceptionHandler(Exc_not_found.class)
    public ResponseEntity<String> handle_entity_not_found_exception(Exc_not_found e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}

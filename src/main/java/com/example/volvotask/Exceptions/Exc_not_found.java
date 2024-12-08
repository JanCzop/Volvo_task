package com.example.volvotask.Exceptions;

public class Exc_not_found extends RuntimeException{
    public Exc_not_found(String code){
        super("Country with code " + code + " not found");
    }
}

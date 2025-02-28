package com.mpkiller.mpback.exceptions;

public class UserExistedException extends RuntimeException{
    public UserExistedException(){
        super("User Already Existed");
    }
}

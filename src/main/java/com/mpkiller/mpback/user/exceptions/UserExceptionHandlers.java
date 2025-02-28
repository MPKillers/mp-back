package com.mpkiller.mpback.user.exceptions;

import com.mpkiller.mpback.exceptions.UserExistedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class UserExceptionHandlers {

    @ExceptionHandler(UserExistedException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public Map<String, String> handleAlreadyExistsException(UserExistedException ex) throws Exception {
        //TODO: finish this
        throw new Exception("Not implemented");
    }
}

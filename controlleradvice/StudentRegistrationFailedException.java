package com.evorra.backend.exceptions;

import org.springframework.http.HttpStatus;

import javassist.runtime.Cflow;

public class StudentRegistrationFailedException extends RuntimeException {

    public StudentRegistrationFailedException(String message) {
        super(message);
    }

    public HttpStatus getStatus() {
        return HttpStatus.BAD_REQUEST;
    }
}
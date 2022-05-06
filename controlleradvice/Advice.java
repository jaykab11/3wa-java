package com.evorra.backend.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.evorra.backend.exceptions.StudentRegistrationFailedException;
import com.evorra.backend.model.dao.companyUser.ErrorDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class Advice {

        @ResponseStatus(HttpStatus.BAD_REQUEST)
        @ExceptionHandler(StudentRegistrationFailedException.class)
        public ResponseEntity<ErrorDTO> generateNotFoundException(StudentRegistrationFailedException ex) {
            ErrorDTO errorDTO = new ErrorDTO();
            errorDTO.setMessage(ex.getMessage());
            errorDTO.setStatus( HttpStatus.BAD_REQUEST.name() );
            errorDTO.setTime(new Date().toString());

            return new ResponseEntity<>(errorDTO,HttpStatus.BAD_REQUEST);
        }


}


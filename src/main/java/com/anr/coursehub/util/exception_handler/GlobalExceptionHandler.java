package com.anr.coursehub.util.exception_handler;

import com.anr.openapi.model.Error;
import jakarta.servlet.http.HttpServletRequest;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({IllegalStateException.class, IllegalArgumentException.class})
    public ResponseEntity<Error> handleIllegalStateException(RuntimeException ex, HttpServletRequest request) {
        ex.printStackTrace();
        Error errorResponse = new Error();
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Error> handleDataNoSuchElementException(DataIntegrityViolationException ex, HttpServletRequest request) {
        ex.printStackTrace();
        Error errorResponse = new Error();
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<Error> handleDataIntegrityViolationException(DataIntegrityViolationException ex, HttpServletRequest request) {
        ex.printStackTrace();
        Error errorResponse = new Error();
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Error> handleConstraintViolationException(ConstraintViolationException ex, HttpServletRequest request) {
        ex.printStackTrace();
        Error errorResponse = new Error();
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> handleGenericException(Exception ex, HttpServletRequest request) {
        ex.printStackTrace();
        Error errorResponse = new Error();
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
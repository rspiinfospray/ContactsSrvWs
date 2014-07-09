package org.infospray.controller;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice 
public class ExceptionController extends ResponseEntityExceptionHandler { 


    @ExceptionHandler(value = { EmptyResultDataAccessException.class }) 
    protected ResponseEntity<Object> EmptyResultException(Exception ex, 
            WebRequest request) { 
        ex.printStackTrace(); 
        return handleExceptionInternal( 
                ex, 
                "Element non trouvé", 
                new HttpHeaders(), HttpStatus.NOT_FOUND, request); 
    }
    
    @ExceptionHandler(value = { Exception.class }) 
    protected ResponseEntity<Object> genericException(Exception ex, WebRequest request) { 
        ex.printStackTrace(); 
        return handleExceptionInternal( 
                ex, 
                "Erreur interne du server", 
                new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request); 
    }
    
    
}
package com.backend.backend.exception;

import com.backend.backend.dto.ExceptionDTO;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GeneralExceptionHandler {

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ExceptionDTO missingRequestParamExceptionHandler(MissingServletRequestParameterException ex){
        return new ExceptionDTO(ex.getParameterName() + " parameter is required");
    }

}

package com.backend.backend.exception;

import com.backend.backend.dto.ExceptionDTO;
import org.springframework.data.mapping.PropertyReferenceException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GeneralExceptionHandler {
    @ResponseStatus(code= HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ExceptionDTO missingRequestParamExceptionHandler(MissingServletRequestParameterException ex){
        return new ExceptionDTO(ex.getParameterName() + " parameter is required");
    }

    @ResponseStatus(code= HttpStatus.BAD_REQUEST)
    @ExceptionHandler(PropertyReferenceException.class)
    public ExceptionDTO invalidSortByRequestParamExceptionHandler(PropertyReferenceException ex){
        return new ExceptionDTO("sortBy parameter '" + ex.getPropertyName() + "' is invalid");
    }

}

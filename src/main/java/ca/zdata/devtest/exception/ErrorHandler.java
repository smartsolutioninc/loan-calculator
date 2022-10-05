package ca.zdata.devtest.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import ca.zdata.devtest.domain.calculator.ErrorResponse;

@RestControllerAdvice
public class ErrorHandler {

   

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(
        Exception e
    ) {
        HttpStatus status = HttpStatus.BAD_REQUEST; // 404

    ValidationException v = (ValidationException)e;
    
    return new ResponseEntity<ErrorResponse>(new ErrorResponse(Integer.parseInt(v.getCode()), status.name(), v.getMessage()), status);
    
    }
}

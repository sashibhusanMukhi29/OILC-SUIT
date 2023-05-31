package com.oilc_suit.exceptions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(UserNotFound.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public ResponseEntity<Map<String,String>> exceptionHandler(UserNotFound userNotFound)
{
		Map<String,String>error= new LinkedHashMap<>();
		return new ResponseEntity<Map<String ,String>>(error,HttpStatus.BAD_REQUEST);
	
}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>>methodArgumentNotValidException(MethodArgumentNotValidException exception)
	{
		Map<String,String>error=new HashMap<>();
		exception.getBindingResult().getAllErrors().forEach(errors->{
			String field=((FieldError)errors).getField();
			String msg=errors.getDefaultMessage();
			error.put(field, msg);
		});
		
		
		 
		return new  ResponseEntity<Map<String,String>>(error,HttpStatus.BAD_REQUEST);
	}
	
}

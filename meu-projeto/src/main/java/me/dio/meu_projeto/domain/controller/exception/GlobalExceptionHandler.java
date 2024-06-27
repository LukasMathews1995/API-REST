package me.dio.meu_projeto.domain.controller.exception;

import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import me.dio.meu_projeto.domain.model.Game;

@RestControllerAdvice
public class GlobalExceptionHandler {
	private final Logger logger =LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handle(IllegalArgumentException businessException ){
	
		return new ResponseEntity<>(businessException.getMessage(),HttpStatus.UNPROCESSABLE_ENTITY);
		}

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNotFoundException(NoSuchElementException notFoundException ){
	
		return new ResponseEntity<>("Resource ID not found",HttpStatus.NOT_FOUND);
		}
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<String> handleUnexpectedException(Throwable unexpectedException ){
		var message = "UnexpectedException server Error, see the logs";
			logger.error(message, unexpectedException);
		return new ResponseEntity<>("UnexpectedException server Error, see the logs",HttpStatus.INTERNAL_SERVER_ERROR);
		}



}

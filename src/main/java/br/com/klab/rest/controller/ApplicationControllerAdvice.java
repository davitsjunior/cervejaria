package br.com.klab.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.klab.exception.RegraNegocioException;
import br.com.klab.rest.ApiErrros;

@RestControllerAdvice
public class ApplicationControllerAdvice {
	

	@ExceptionHandler(RegraNegocioException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ApiErrros handleRegraNegocioException(RegraNegocioException ex) {
		
		String mensagemErro = ex.getMessage();
		
		return new ApiErrros(mensagemErro);
	}
}

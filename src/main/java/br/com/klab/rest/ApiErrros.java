package br.com.klab.rest;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;


public class ApiErrros {

	@Getter
	private List<String> errors;
	
	public ApiErrros(String mensageErro) {
		this.errors = Arrays.asList(mensageErro);
	}
}

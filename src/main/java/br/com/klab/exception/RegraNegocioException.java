package br.com.klab.exception;

public class RegraNegocioException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public RegraNegocioException(String message) {
		super(message);
	}
}

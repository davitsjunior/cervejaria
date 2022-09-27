package br.com.klab.exception;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import feign.Response;
import feign.codec.ErrorDecoder;

@Component
public class FeignErrorDecoder implements ErrorDecoder {
	@Override
	public Exception decode(String methodKey, Response response) {


		switch (response.status()){
		case 400:		
			return new ResponseStatusException(HttpStatus.valueOf(response.status()), "Retornou 400");
		case 404:
			return new RegraNegocioException("Erro 404 - PROBLEMAS AO CONSUMIR API EXTERNA");
		default:
			return new Exception(response.reason());
		} 
	}
}

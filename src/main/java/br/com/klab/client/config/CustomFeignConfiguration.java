package br.com.klab.client.config;

import org.springframework.context.annotation.Bean;

import br.com.klab.exception.FeignErrorDecoder;

public class CustomFeignConfiguration {

	@Bean
	public FeignErrorDecoder errorDecoder() {
		return new FeignErrorDecoder();
	}
}

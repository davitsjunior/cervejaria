package br.com.klab.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.klab.client.config.CustomFeignConfiguration;
import br.com.klab.client.response.BeerResponse;

@FeignClient(name = "BeerClient", url = "https://api.punkapi.com/v2/beers", configuration = CustomFeignConfiguration.class)
public interface BeerClient {

	@GetMapping(value = "/random")
	List<BeerResponse> getRandomBeer();
}

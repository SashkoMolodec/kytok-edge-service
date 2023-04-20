package com.kytokvinily.edgeservice.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class RateLimiterConfig {

	@Bean
	public KeyResolver keyResolver() {
		return exchange -> Mono.just("anonymous");
	}
	
}

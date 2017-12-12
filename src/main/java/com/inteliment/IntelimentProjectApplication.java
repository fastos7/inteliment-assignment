package com.inteliment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Inteliment Test assignment main application class, with Caching enabled.
 *
 */
@SpringBootApplication
@EnableCaching
public class IntelimentProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntelimentProjectApplication.class, args);
	}
}

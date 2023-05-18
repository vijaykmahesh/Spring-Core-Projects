package com.seleniumexpress.fistspringapp;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

	@Bean
	Film film(Actor actor) {

		return new Film(actor);
	}

	@Bean(autowireCandidate = false)
	public SRK srk() {

		return new SRK();
	}

	@Bean
	public MaheshBabu MaheshBabu() {

		return new MaheshBabu();
	}

	@Bean
	public ModelMapper modelMapper() {

		return new ModelMapper();
	}

}

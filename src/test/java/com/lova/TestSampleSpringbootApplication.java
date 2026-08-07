package com.lova;

import org.springframework.boot.SpringApplication;

public class TestSampleSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.from(SampleSpringbootApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

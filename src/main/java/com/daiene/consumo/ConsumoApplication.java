package com.daiene.consumo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoApplication.class, args);
	}

}

package com.project.viacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ViaCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViaCepApplication.class, args);
		//ServiceCep serviceCep = new ServiceCep();
		//RecordAddress addrs = serviceCep.searchAddress("88106535");
		//System.out.println(addrs);
	}
}

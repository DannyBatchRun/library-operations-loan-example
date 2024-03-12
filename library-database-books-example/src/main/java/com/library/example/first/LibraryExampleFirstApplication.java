package com.library.example.first;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class LibraryExampleFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryExampleFirstApplication.class, args);
	}

}

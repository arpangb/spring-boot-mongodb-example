package com.arpan.mongodb.springbootmongodbexample;

import com.arpan.mongodb.springbootmongodbexample.model.User;
import com.arpan.mongodb.springbootmongodbexample.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootMongodbExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongodbExampleApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository){
		return sys -> {
			userRepository.insert(new User(1, "arpan","monte alban 173"));
			userRepository.insert(new User(2, "poulomi", "zempoala 275"));};

	}

}

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
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				userRepository.insert(new User(3, "abhishek","amsterdam"));
				userRepository.insert(new User(4, "pradip", "kolkata"));
			}
		};

	}

}

package com.welisonjoras.course.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.welisonjoras.course.entities.User;
import com.welisonjoras.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Welison", "wjoras1@gmail.com", "51999999", "12356");
		User u2 = new User(null, "Weli", "wjoras1@gmail.com", "51999999", "12356");
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
}

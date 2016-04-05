package com.tikal.fleettracker.gpsFirehose;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(Application.class);

	
	
	@Autowired
	private GpsSender gpsSender;
	

	public static void main(final String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}
	
	
	
}



package com.lt.ss.garbageScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class GarbageSchedulerApplication {
	public static void main(String[] args) {
		SpringApplication.run(GarbageSchedulerApplication.class, args);
	}
}

package com.lt.ss.garbageScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GarbageSchedulerApplication {
	public static void main(String[] args) {
		SpringApplication.run(Scheduler.class, args);
	}
}

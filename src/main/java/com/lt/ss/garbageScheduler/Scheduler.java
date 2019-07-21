package com.lt.ss.garbageScheduler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@EnableScheduling
public class Scheduler {
    private String url="http://localhost:8080/oldTestCase/delete";
    private Logger logger =  LoggerFactory.getLogger(Scheduler.class);
    private RestTemplate restTemplate = new RestTemplate();
    @Scheduled(cron = "0 0 0 */3 * *")
    public void deleteTestCases() {
        Date date=new Date();
        logger.info("Date:"+date);
        try {
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
            logger.info("Status code:"+response.getStatusCode());
            logger.info("Message:"+response.getBody());
        } catch (RestClientException e) {
            logger.error("No response from server.");
            logger.error(e.getMessage());
        }
    }
}

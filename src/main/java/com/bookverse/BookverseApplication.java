package com.bookverse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
public class BookverseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookverseApplication.class, args);
        log.info("[APP] Application started on port 8000");
    }

}

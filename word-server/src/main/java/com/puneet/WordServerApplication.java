/*
 * @author psachdev
 */
package com.puneet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * The Class WordServerApplication.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class WordServerApplication {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(WordServerApplication.class, args);
    }
}

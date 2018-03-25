package com.puneet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author psachdev
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

  /**
   * @param args
   */
  public static void main(String[] args) {
    SpringApplication.run(EurekaServerApplication.class, args);
  }
}
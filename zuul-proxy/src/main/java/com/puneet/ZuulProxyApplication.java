/*
 * @author psachdev
 */
package com.puneet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;

/**
 * The Class ZuulProxyApplication.
 */
@SpringBootApplication
@EnableZuulProxy
@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
public class ZuulProxyApplication {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ZuulProxyApplication.class, args);
    }
}

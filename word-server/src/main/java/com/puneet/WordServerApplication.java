/*
 * @author psachdev
 */
package com.puneet;

import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.PublicMetrics;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import io.prometheus.client.exporter.MetricsServlet;
import io.prometheus.client.hotspot.DefaultExports;
import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import io.prometheus.client.spring.boot.SpringBootMetricsCollector;

/**
 * The Class WordServerApplication.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
public class WordServerApplication {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(WordServerApplication.class, args);
    }
    
    @Bean
    public SpringBootMetricsCollector springBootMetricsCollector(Collection<PublicMetrics> publicMetrics) {
        SpringBootMetricsCollector springBootMetricsCollector = new SpringBootMetricsCollector(publicMetrics);
        springBootMetricsCollector.register();
        return springBootMetricsCollector;
    }
    
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        DefaultExports.initialize();
        return new ServletRegistrationBean(new MetricsServlet(), "/prometheus");
    }
    
}

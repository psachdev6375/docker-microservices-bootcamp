package com.puneet;

import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.endpoint.PublicMetrics;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import io.prometheus.client.exporter.MetricsServlet;
import io.prometheus.client.hotspot.DefaultExports;
import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import io.prometheus.client.spring.boot.SpringBootMetricsCollector;

/**
 * @author psachdev
 *
 */
@SpringBootApplication
@EnableEurekaServer
@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
public class EurekaServerApplication {

  /**
   * @param args
   */
  public static void main(String[] args) {
    SpringApplication.run(EurekaServerApplication.class, args);
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

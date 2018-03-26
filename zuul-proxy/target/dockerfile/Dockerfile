FROM openjdk

VOLUME /tmp
ADD maven/zuul-proxy-1.0.jar zuul-proxy-1.0.jar
RUN sh -c 'touch /zuul-proxy-1.0'
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-DCONFIG_HOST=${CONFIG_PORT_8001_TCP_ADDR}", "-DCONFIG_PORT=${CONFIG_PORT_8001_TCP_PORT}", "-DEUREKA_HOST=${EUREKA_PORT_8010_TCP_ADDR}", "-DEUREKA_PORT=${EUREKA_PORT_8010_TCP_PORT}", "-jar", "/zuul-proxy-1.0.jar"]
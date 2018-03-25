docker run -p 8001:8001 --name config -d com.puneet/configserver
echo 'Started Configserver'
docker run -p 8010:8010 --name eureka -d com.puneet/eurekaserver
echo 'Started Eureka server'
sleep 10
docker run --name zuul  --link config:config --link eureka:eureka -itd com.puneet/zuulserver
echo 'Started Zuul Proxy'
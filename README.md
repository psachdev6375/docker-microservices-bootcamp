<B> Docker Microservices Bootcamp </B>

Consists of 5 projects which showcase a complete dockerized microservices application with the following capabilities: 
<ul>
<li>1. Service Discovery using Eureka </li>
<li>2. Circuit Breakers using Hysterix</li>
<li>3. Client Side loadbalancing using Ribbon</li> 
<li>4. Spring Cloud Netflix and Spring Profiles </li>
<li>5. Zuul for proxy </li>
<li>6. Monitoring using Prometheus and Grifana </li>
<li>7. Docker Compose for setting the whole thing up </li>
</ul>
Application: The application consists of the following projects: 
<ul>
<li>1. eureka-server: Eureka Server for service discovery</li>
<li>2. word-server: A microservice which can be run with 5 different profiles, namely article, noun, verb, subject and adjective. Based on the profile it exposes one operation which returns one word based on the profiles. The set of words are picked up from configuration. </li>
<li>3. sentence-server-solution: A microservice which builds  complete sentence by calling the word-server 5 times. The solution leverages Hysterix and ribbon </li>
<li>4. zuul-proxy: Zuul server acting as a service proxy. </li>
</ul>

Prerequisites: 
<ul>
  <li>1. Docker engine 18+</li>
  <li>2. Docker compose 1.20+</li>
</ul>
Docker Base Images Leveraged: 
<ul>
  <li>1. Base Java image for services: openjdk</li>
  <li>2. Base image for Grafana Server: grafana/grafana</li>
  <li>3. Base image for Prometheus server: prom/prometheus</li>
</ul>
How to set this up?
<ul>
  <li>1. <b>mvn clean install docker:build</b> for eureka-server, word-server, sentence-server and zuul-proxy. This will create the following images in your local docker repo: <br>
    - com.puneet/eurekaserver <br>
    - com.puneet/wordserver <br>
    - com.puneet/sentenceserver <br>
    - com.puneet/zuulserver <br>
  </li>
  <li>2. docker-compose up in compose directory</li>
  <li>3. Test sentence composition at http://localhost:8105/sentence </li>
  <li>4. Test Prometheus at http://localhost:9090/targets. </li>
  <li>5. Test Grifana at http://localhost:3000/login. Username: admin, password: monitoring</li>
</ul>


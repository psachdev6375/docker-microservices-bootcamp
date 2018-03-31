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
Application: The application consists of: 
<ul>
<li>1. eureka-server: Eureka Server for service discovery</li>
<li>2. word-server: A microservice which can be run with 5 different profiles, namely article, noun, verb, subject and adjective. Based on the profile it exposes one operation which returns one word based on the profiles. The set of words are picked up from configuration. </li>
<li>3. sentence-server-solution: A microservice which builds  complete sentence by calling the word-server 5 times. The solution leverages Hysterix and ribbon </li>
<li>4. zuul-proxy: Zuul server acting as a service proxy. </li>
</ul>

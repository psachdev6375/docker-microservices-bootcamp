<B> Microservices Bootcamp </B>

Consists of 5 projects which showcase a complete microservices application with the following capabilities: 
<ul>
<li>1. Service Discovery using Eureka </li>
<li>2. Circuit Breakers using Hysterix</li>
<li>3. Client Side loadbalancing using Ribbon</li> 
<li>4. Spring Cloud Netflix, Spring Configuration and Spring Profiles </li>
<li>5. Zuul for proxy </li>
</ul>
Application: The application consists of: 
<ul>
<li>1. eureka-server: Eureka Server for service discovery</li>
<li>2. config-server: Spring configuration server containing configuration for various profiles </li>
<li>3. word-server: A microservice which can be run with 5 different profiles, namely article, noun, verb, subject and adjective. Based on the profile it exposes one operation which returns one word based on the profiles. The set of words are picked up from configuration. </li>
<li>4. sentence-server-solution: A microservice which builds  complete sentence by calling the word-server 5 times. The solution leverages Hysterix and ribbon </li>
<li>5. zuul-proxy: Zuul server acting as a service proxy. </li>
<li>6. configuration: Configuration folder which contains yml file for each profile and zuul. Spring config server connects to this directory and retrieves appropriate configuration as and when requested. </li>
</ul>

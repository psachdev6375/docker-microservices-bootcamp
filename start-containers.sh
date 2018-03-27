docker start config
echo 'Started Configserver in Docker Container'
docker start eureka
echo 'Started Eureka server in Docker Container'
sleep 20
docker start zuul 
echo 'Started Zuul Proxy in Docker Container'
if [ "$1" = "verb" ] || [ "$#" == 0 ]
then
   docker start verb 
   echo 'Started Verb Server'
fi
if [ "$1" = "adjective" ] || [ "$#" == 0 ]
then
   docker start adjective 
   echo 'Started Adjective Server'
fi
if [ "$1" = "noun" ] || [ "$#" == 0 ]
then
   docker start noun
   echo 'Started Noun Server'
fi
if [ "$1" = "subject" ] || [ "$#" == 0 ]
then
   docker start subject
   echo 'Started Subject Server'
fi
if [ "$1" = "article" ] || [ "$#" == 0 ]
then
   docker start article 
   echo 'Started Article Server'
fi
if [ "$1" = "sentence" ] || [ "$#" == 0 ]
then
   docker start sentence 
   echo 'Started Sentence Server'
fi


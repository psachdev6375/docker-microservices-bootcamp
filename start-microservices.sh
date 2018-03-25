if [ "$1" = "verb" ] || [ "$#" == 0 ]
then 
   docker run -p 8100:8100 --name verb  -e PROFILE_VALUE=verb -e SERVER_PORT=8100 --link config:config --link eureka:eureka -itd com.puneet/wordserver
   echo 'Started Verb Server'
fi
if [ "$1" = "adjective" ] || [ "$#" == 0 ]
then
   docker run -p 8102:8102 --name adjective  -e PROFILE_VALUE=adjective -e SERVER_PORT=8102 --link config:config --link eureka:eureka -itd com.puneet/wordserver
   echo 'Started Adjective Server'
fi 
if [ "$1" = "noun" ] || [ "$#" == 0 ]
then
   docker run -p 8101:8101 --name noun  -e PROFILE_VALUE=noun -e SERVER_PORT=8101 --link config:config --link eureka:eureka -itd com.puneet/wordserver
   echo 'Started Noun Server'
fi 
if [ "$1" = "subject" ] || [ "$#" == 0 ]
then
   docker run -p 8104:8104 --name subject  -e PROFILE_VALUE=subject -e SERVER_PORT=8104 --link config:config --link eureka:eureka -itd com.puneet/wordserver
   echo 'Started Subject Server'
fi 
if [ "$1" = "article" ] || [ "$#" == 0 ]
then
   docker run -p 8103:8103 --name article  -e PROFILE_VALUE=article -e SERVER_PORT=8103 --link config:config --link eureka:eureka -itd com.puneet/wordserver
   echo 'Started Article Server'
fi 
if [ "$1" = "sentence" ] || [ "$#" == 0 ]
then
   docker run -p 8105:8105 --name sentence  -e PROFILE_VALUE=sentence -e SERVER_PORT=8105 --link config:config --link eureka:eureka -itd com.puneet/sentenceserver
   echo 'Started Sentence Server'
fi

#docker run -p 8010:8010 --name eureka -d com.puneet/eurekaserver
#docker run -p 8001:8001 --name config -d com.puneet/configserver
#docker run -p 8100:8100 --name verb  -e PROFILE_VALUE=verb -e SERVER_PORT=8100 --link config:config --link eureka:eureka -itd com.puneet/wordserver
#docker run -p 8101:8101 --name noun  -e PROFILE_VALUE=noun -e SERVER_PORT=8101 --link config:config --link eureka:eureka -itd com.puneet/wordserver
#docker run -p 8102:8102 --name adjective  -e PROFILE_VALUE=adjective -e SERVER_PORT=8102 --link config:config --link eureka:eureka -itd com.puneet/wordserver
#docker run -p 8103:8103 --name article  -e PROFILE_VALUE=article -e SERVER_PORT=8103 --link config:config --link eureka:eureka -itd com.puneet/wordserver
#docker run -p 8104:8104 --name subject  -e PROFILE_VALUE=subject -e SERVER_PORT=8104 --link config:config --link eureka:eureka -itd com.puneet/wordserver
#docker run -p 8105:8105 --name sentence  -e PROFILE_VALUE=sentence -e SERVER_PORT=8105 --link config:config --link eureka:eureka -itd com.puneet/sentenceserver
#docker run --name zuul  --link config:config --link eureka:eureka -itd com.puneet/zuulserver



if [ "$1" = "zuul" ] || [ "$#" == 0 ]
then
   docker stop zuul
   docker rm zuul
fi
if [ "$1" = "eureka" ] || [ "$#" == 0 ]
then
   docker stop eureka
   docker rm eureka 
   echo 'Killed Eureka Server '
fi 
if [ "$1" = "config" ] || [ "$#" == 0 ]
then
   docker stop config
   docker rm config
   echo 'Killed Config Server'
fi 

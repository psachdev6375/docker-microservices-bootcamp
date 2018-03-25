if [ "$1" = "verb" ] || [ "$#" == 0 ]
then
   docker stop verb
   docker rm verb
   echo 'Killed all Verb Servers'
fi
if [ "$1" = "adjective" ] || [ "$#" == 0 ]
then
   docker stop adjective
   docker rm adjective
   echo 'Killed all Adjective Servers'
fi 
if [ "$1" = "noun" ] || [ "$#" == 0 ]
then
   docker stop noun
   docker rm noun
   echo 'Killed all Noun Servers'
fi 
if [ "$1" = "subject" ] || [ "$#" == 0 ]
then
   docker stop subject
   docker rm subject
   echo 'Killed all Subject Servers'
fi 
if [ "$1" = "article" ] || [ "$#" == 0 ]
then
   docker stop article
   docker rm article
   echo 'Killed all Article Servers'
fi 
if [ "$1" = "sentence" ] || [ "$#" == 0 ]
then    
   docker stop sentence
   docker rm sentence
   echo 'Killed all Sentence Servers'
fi

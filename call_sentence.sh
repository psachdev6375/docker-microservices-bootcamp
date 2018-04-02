while : 
do 
	curl --GET http://localhost:8105/sentence 
	curl --GET http://localhost:8080/services/sentence/sentence 
done 

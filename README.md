Banking APP

    This is a springboot application.
    
    This App will support below api calls:
        
        1. GET /users -- to find all users
            https://localhost:8080/users
            curl -X GET "https://localhost:8080/users" -H  "accept: */*"
            
        2. POST /users -- to create a user
            https://localhost:8080/users
            curl -X POST "https://localhost:8080/users" -H  "accept: */*" -H  "Content-Type: application/json" -d "{  \"dob\": \"2021-02-07T18:53:43.475Z\",  \"id\": 0,  \"name\": \"string\"}"
        
        3. GET /users/{id} -- to get a specific user id
            https://localhost:8080/users/1
            curl -X GET "https://localhost:8080/users/1" -H  "accept: */*"
        
        4. DELETE users/{id} -- to delete a specific user
            https://localhost:8080/users/1
            curl -X DELETE "https://localhost:8080/users/1" -H  "accept: */*"
    
    Refer swagger file at for complete details:
    /banking-app/src/main/java/com/example/bankingapp/api/user-api.yaml

    Build:
        mvn clean install

    Run:
        java -jar target/banking-app-0.0.1-SNAPSHOT.jar

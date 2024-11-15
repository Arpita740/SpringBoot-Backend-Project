Swagger Implementation
http://localhost:7080/swagger-ui/index.html
---- to check all the endpoints and it's working demonstration

server port=7080

SonarQube Implementation
localhost:9000

SonarQube Terminal command
1>   mvn clean verify sonar:sonar
2>   sonar-scanner -Dsonar.projectKey=Demo -Dsonar.sources=src -Dsonar.host.url=http://localhost:9000 -Dsonar.login=squ_e668d2591541351628cea73524f377d6d20eb3dc




postman api:
//get endpoints
1. http://localhost:7080/api/reviews/tripid/2 (get review by trip id)
2. http://localhost:7080/api/customers/city/Bangalore (get customer by city)
3. http://localhost:7080/api/reviews/1 (get a review by id)
4. http://localhost:7080/api/reviews/all (search all reviews)
5. http://localhost:7080/api/reviews/customerid/1 (get review by customer id)
//post endpoint

1.http://localhost:7080/api/reviews/add (add a review)
---json body----
{
    "rating": 5,
    "comment": "Great service!",
    "reviewDate": "2024-11-11",
    "customer": {
        "customerId": 123
    },
    "trip": {
        "tripId": 456
    }
}

2.http://localhost:7080/api/trips/2/discounts (add a  discount)
---json body---
{
    "discountCode": "WINTER20",
    "discountPercentage": 10,
    "validUntil": "2023-11-31"
}

//put endpoints
1.http://localhost:7080/api/routes/1 ( update a data in route table)
---json body---
{
  "fromCity": "New York",
  "toCity": "Boston",
  "breakPoints": 3,
  "duration": 5
}
2.http://localhost:7080/api/agencies/offices/3 (update a data in agency_offices table)
---json body---
{
  "officeMail": "newmail@office.com",
  "officeContactPersonName": "John Doe",
  "officeContactNumber": "1234567890",
  "officeAddressId": 2
}


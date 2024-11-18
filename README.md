Project Overview
                This project implements an Online Bus Ticket Booking System with functionalities to manage reviews, routes, discounts, trips, agency offices, and customer data. The system is designed using a                     RESTful API architecture in Spring Boot and integrates tools like Swagger for API documentation and SonarQube for code quality analysis.

Key Features
            API Documentation:
                        Swagger-UI provides a comprehensive interface to test and view all API endpoints.
                        Access it at:
                                        http://localhost:7080/swagger-ui/index.html

Server Configuration:
            Server Port: 7080
            Code Quality Analysis:
            SonarQube is used for static code analysis to ensure maintainable, reliable, and clean code.
            Access SonarQube at:
                                    http://localhost:9000

SonarQube Setup and Commands
            Run the following commands in the terminal to analyze code with SonarQube:

            For Maven Build:
                            mvn clean verify sonar:sonar
                            sonar-scanner -Dsonar.projectKey=Demo -Dsonar.sources=src -Dsonar.host.url=http://localhost:9000 -Dsonar.login=squ_e668d2591541351628cea73524f377d6d20eb3dc

Endpoints Summary
            GET Endpoints
                        Get Review by Trip ID:
                        URL: http://localhost:7080/api/reviews/tripid/{tripId}
                        {try this}  ----->   GET http://localhost:7080/api/reviews/tripid/2
                        Get Customers by City:
                        URL: http://localhost:7080/api/customers/city/{city}
                        {try this}  ----->   GET http://localhost:7080/api/customers/city/Bangalore
                        Get Review by ID:
                        {try this}  ----->  GET http://localhost:7080/api/reviews/1
                        Get All Reviews:
                        URL: http://localhost:7080/api/reviews/all
                        Get Review by Customer ID:
                        URL: http://localhost:7080/api/reviews/customerid/{customerId}
                        {try this}  ----->  GET http://localhost:7080/api/reviews/customerid/1
            POST Endpoints
                        Add a Review:
                        URL: http://localhost:7080/api/reviews/add
                        Request Body:
                        
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
                        Add a Discount:
                        URL: http://localhost:7080/api/trips/{tripId}/discounts
                        {try this}  ----->  POST http://localhost:7080/api/trips/2/discounts
                        Request Body:                      
                            {
                                "discountCode": "WINTER20",
                                "discountPercentage": 10,
                                "validUntil": "2023-11-31"
                            }
             PUT Endpoints
                        Update Route Details:
                        URL: http://localhost:7080/api/routes/{routeId}
                        {try this}  ----->  PUT http://localhost:7080/api/routes/1
                        Request Body:
                        {
                            "fromCity": "New York",
                            "toCity": "Boston",
                            "breakPoints": 3,
                            "duration": 5
                        }
                        Update Agency Office Details:
                        URL: http://localhost:7080/api/agencies/offices/{officeId}
                        {try this}  ----->  PUT http://localhost:7080/api/agencies/offices/3
                        Request Body:
                        {
                            "officeMail": "newmail@office.com",
                            "officeContactPersonName": "John Doe",
                            "officeContactNumber": "1234567890",
                            "officeAddressId": 2
                        }
Tools and Frameworks
        Spring Boot for RESTful API development
        Swagger-UI for API documentation
        SonarQube for static code analysis
        Postman for testing APIs
This documentation ensures a structured and professional overview of the project. Each API endpoint is functional and accessible for demonstration and testing.







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


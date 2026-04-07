API - Appplication Program Interface

An API is a set of rules and protocols that allows different software applications to communicate with each other.

A web service that can handle http requests and return response is called Rest API

REST - REpresentational State Transfer

It is an architectural style for designing networked applications.

It is a way to design the web services.

The main part of request is the URL.All the service we are going to give will be coming under 1 common base URL.

Example : https://www.google.com/search?q=java

HTTP Methods:
    GET - Fetch the data
    POST - Create the data
    PUT - Update the data
    DELETE - Delete the data

POST Request:
    We will be sending the data to the server to create a resource.
Example : 
    POST https://jsonplaceholder.typicode.com/posts
    {
        "title": "foo",
        "body": "bar",
        "userId": 1
    }

The next element is RequestBody will contain any information that the api needs

Rquest Boday will be mostly in JSON format.

Next is Headers - It contains metadata about the request. It is a key-value pair.

HTTP status code - It is a 3 digit number which is returned by the server to indicate the status of the request.
    2xx - Success - Request was successful
    200 - OK
    201 - Created
    204 - No Content
    4xx - Client Error - Something went wrong with your request
    400 - Bad Request
    401 - Unauthorized
    403 - Forbidden
    404 - Not Found
    5xx - Server Error - Something went wrong with api server not your request
    500 - Internal Server Error

Response Body - It contains the data that is returned by the server.

Response Headers - It contains metadata about the response. It is a key-value pair.

    HttpRequest request = HttpRequest.newBuilder()
				.uri(new java.net.URI("https://api.assemblyai.com/v2/transcript"))
				.header("Authorization","API_KEY")
				.POST(BodyPublishers.ofString(jsonRequest))
				.build();
		
		HttpClient client = HttpClient.newHttpClient();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		System.out.println(response.body());

HttpRequest is used to build the request 

HttpClient is used to send the request 

BodyPublishers is used to create the request body 

BodyHandlers is used to create the response body 

HttpResponse is used to get the response from the server 




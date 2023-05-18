<center>
<h1> Todo Application </h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>
The Todo Application System is a web-based application built using Java and Spring Boot. It allows users to manage their tasks and todos effectively. This README provides an overview of the application and instructions for setting up and running the system.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

# Dependencies Used
* Spring Boot Dev Tools
* Spring Web
* Lombok

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the proper controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

### API Endpoints :-
* GetMapping(value = "/todoPackage/getAllTodos")
* GetMapping(value = "/todoPackage/getTodosByStatus")
* PostMapping(value = "/todoPackage/addTodo")
* DeleteMapping(value = "/todoPackage/deleteTodoById/{id}")
* PutMapping(value = "/todoPackage/updateTodoById/{id}/{status}")

## Data structure Used
* ArrayList
```
We have used ArrayList data structure as a database to implement CRUD Operations 
```

# Project Summary
The Todo you up can easily set and run the system on your local machine.

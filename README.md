# Todo REST API

Pembelajaran AJMC - Altera, spring boot membuat applikasi todo REST API [Spring Boot Framework](https://spring.io/projects/spring-boot). 
Fitur API add item to a todo list, update, select and remove.

### Usage
* Membuat database dengan nama : dbtodo, pada application.properties 
* Ubah user dan pass sesuai dengan database lokal
* IDE ([IntelliJ](https://www.jetbrains.com/idea/), [STS](https://spring.io/tools))

##  Application Demo with [Postman](https://www.postman.com/):

| Methods  | Urls                          | Actions               |
|:---------|:------------------------------|:----------------------|
| GET 	    | /api/v1/todo/todolist 		| todo list             |
| POST 	| /api/v1/todo/additem		    | create new todo       |
| PUT 	    | /api/v1/todo/updateitem/:id 	| update a todo by :id  |
| DELETE 	| /api/v1/todo/deleteitem/:id	| delete a todo by :id  | 



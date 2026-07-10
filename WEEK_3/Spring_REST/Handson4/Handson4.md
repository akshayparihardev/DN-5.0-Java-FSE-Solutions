# 🌍 Hands-on 4: REST - Country Web Service

## 📖 Scenario

An airline application needs to expose a RESTful Web Service that returns the details of **India**. The country information is already configured as a Spring Bean in `country.xml`. The REST service should load the bean from the Spring IoC Container and return it as a JSON response.

---

# 🎯 Objective

Develop a RESTful Web Service that:

- Returns the details of India.
- Loads the India bean from `country.xml`.
- Uses Spring Boot REST API.
- Demonstrates the use of `@RestController` and `@RequestMapping`.
- Automatically converts a Java object into JSON.

---

# 📂 Project Structure

```text
spring-learn/
│
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── cognizant
│       │           └── springlearn
│       │               ├── controller
│       │               │      CountryController.java
│       │               │
│       │               ├── model
│       │               │      Country.java
│       │               │
│       │               └── SpringLearnApplication.java
│       │
│       └── resources
│              application.properties
│              country.xml
│
└── pom.xml
```

---

# 🛠 Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Core
- Maven
- REST API
- XML Bean Configuration

---

# 💻 Implementation Overview

## CountryController.java

Responsibilities:

- Handles REST requests.
- Loads the India bean from `country.xml`.
- Returns the bean as JSON.

Implemented Method:

```java
@RequestMapping("/country")
public Country getCountryIndia()
```

---

## country.xml

Contains individual Country beans:

- India
- United States
- Germany
- Japan

The India bean is loaded using:

```java
Country country = (Country) context.getBean("in");
```

---

# 🌐 REST Endpoint

### Method

```
GET
```

### URL

```
/country
```

Example:

```
http://localhost:8083/country
```

---

# 📸 Sample Response

```json
{
    "code": "IN",
    "name": "India"
}
```

---

# 🧪 Testing

Tested using:

- Browser
- Postman

Request:

```
GET http://localhost:8083/country
```

Response:

```json
{
    "code": "IN",
    "name": "India"
}
```

---

# 📊 Working Flow

```
Client
   │
   ▼
GET /country
   │
   ▼
CountryController
   │
   ▼
Load country.xml
   │
   ▼
Get Bean "in"
   │
   ▼
Return Country Object
   │
   ▼
Spring Boot
   │
   ▼
Automatic JSON Response
```

---

# ❓ What happens inside the controller?

The controller:

- Creates the Spring Application Context.
- Loads `country.xml`.
- Retrieves the bean with id **in**.
- Returns the Country object.

Spring Boot automatically serializes the Java object into JSON before sending it to the client.

---

# ❓ What is @RestController?

`@RestController` marks the class as a REST Controller. Every method returns data directly as the HTTP response instead of rendering a web page.

---

# ❓ What is @RequestMapping?

`@RequestMapping` maps an HTTP request to a controller method.

Example:

```java
@RequestMapping("/country")
```

Whenever the client accesses:

```
/country
```

Spring invokes the mapped method.

---

# ❓ How is Java Object converted into JSON?

Spring Boot uses the **Jackson** library internally.

When a controller returns a Java object:

```java
return country;
```

Jackson automatically converts it into:

```json
{
    "code":"IN",
    "name":"India"
}
```

No manual JSON conversion is required.

---

# 📚 Concepts Learned

- Spring Boot REST API
- REST Controller
- @RequestMapping
- Spring IoC Container
- XML Bean Configuration
- Java Object to JSON Conversion
- Jackson JSON Serialization
- REST Endpoint Testing
- Postman

---

# ✅ Conclusion

A RESTful Web Service was successfully developed to return the details of India by loading the Country bean from the Spring XML configuration. Spring Boot automatically converted the Java object into a JSON response, demonstrating REST API development, Spring IoC, XML Bean configuration, and object serialization.
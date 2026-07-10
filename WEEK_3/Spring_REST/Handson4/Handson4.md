# 🌍 Hands-on 4: REST - Get Country Based on Country Code

## 📖 Scenario

An airline application needs to retrieve the details of a country based on the country code entered by the user. A RESTful Web Service is developed using Spring Boot to return the corresponding country details. The country code matching should be **case-insensitive**, ensuring that requests such as `IN`, `in`, `In`, or `iN` all return the same result.

---

# 🎯 Objective

Develop a RESTful Web Service that:

- Accepts a country code as a path variable.
- Retrieves the corresponding country from the list defined in `country.xml`.
- Performs a case-insensitive search.
- Returns the country object as a JSON response.
- Demonstrates the use of `@RestController`, `@GetMapping`, `@PathVariable`, and Service Layer.

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
│       │               ├── service
│       │               │      CountryService.java
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

- Handles HTTP GET requests.
- Accepts country code using `@PathVariable`.
- Invokes `CountryService`.
- Returns a `Country` object as JSON.

Implemented Method:

```java
@GetMapping("/countries/{code}")
public Country getCountry(@PathVariable String code)
```

---

## CountryService.java

Responsibilities:

- Loads `country.xml`.
- Reads the `countryList` bean.
- Searches the list using case-insensitive comparison.
- Returns the matching `Country` object.

Implemented Method:

```java
public Country getCountry(String code)
```

Uses:

```java
equalsIgnoreCase()
```

to perform case-insensitive matching.

---

## country.xml

Contains:

- Country Beans
    - India
    - United States
    - Germany
    - Japan

Also defines:

```xml
<bean id="countryList" class="java.util.ArrayList">
```

which stores all Country objects.

---

# 🌐 REST Endpoint

### Method

```
GET
```

### URL

```
/countries/{code}
```

Example:

```
http://localhost:8083/countries/in
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

- Postman
- Browser

Test URLs:

```
http://localhost:8083/countries/in
```

```
http://localhost:8083/countries/IN
```

```
http://localhost:8083/countries/In
```

```
http://localhost:8083/countries/iN
```

All requests returned:

```json
{
    "code": "IN",
    "name": "India"
}
```

verifying that the search is **case-insensitive**.

---

# 📊 Working Flow

```
Client
   │
   ▼
GET /countries/{code}
   │
   ▼
CountryController
   │
   ▼
CountryService
   │
   ▼
Load country.xml
   │
   ▼
Read countryList Bean
   │
   ▼
Search Country
   │
   ▼
Return Country Object
   │
   ▼
JSON Response
```

---

# ❓ What is @RestController?

`@RestController` is a specialized Spring annotation that combines:

- `@Controller`
- `@ResponseBody`

It indicates that every method returns data directly as the HTTP response instead of returning a view.

---

# ❓ What is @GetMapping?

`@GetMapping` maps HTTP GET requests to a controller method.

Example:

```java
@GetMapping("/countries/{code}")
```

Whenever the client accesses:

```
/countries/in
```

Spring automatically invokes the mapped method.

---

# ❓ What is @PathVariable?

`@PathVariable` extracts values directly from the URL.

Example:

```
/countries/in
```

Here,

```
code = "in"
```

is automatically passed to the controller method.

---

# ❓ Why equalsIgnoreCase()?

`equalsIgnoreCase()` compares two strings without considering uppercase or lowercase characters.

Example:

```
IN
in
In
iN
```

All are treated as equal.

This allows users to enter country codes in any letter case.

---

# 📚 Concepts Learned

- Spring Boot REST API
- REST Controller
- Service Layer
- @GetMapping
- @PathVariable
- XML Bean Configuration
- Spring IoC Container
- JSON Response
- Case-Insensitive Search
- Layered Architecture

---

# ✅ Conclusion

A RESTful Web Service was successfully developed to retrieve a country based on its country code. The application reads the list of countries from the Spring XML configuration, performs a case-insensitive search, and returns the matching country as a JSON response. This hands-on demonstrated the implementation of REST endpoints, service layer interaction, Spring bean configuration, and path variable handling using Spring Boot.
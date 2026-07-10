# 🔐 Hands-on 5: JWT Authentication using Spring Boot

## 📖 Scenario

A RESTful Web Service currently uses HTTP Basic Authentication, where the username and password must be sent with every request. Although functional, this approach is not secure because the credentials are merely Base64 encoded and transmitted repeatedly.

To improve security, JWT (JSON Web Token) authentication is introduced. An authentication service validates the user credentials once, generates a JWT token, and returns it to the client. The client can then use this token to access secured REST APIs without sending credentials again.

---

# 🎯 Objective

Implement JWT Authentication in a Spring Boot REST application by:

- Securing REST APIs using Spring Security
- Creating in-memory users and roles
- Implementing an authentication service
- Reading and decoding the Authorization header
- Generating a JWT token
- Configuring Spring Security for authentication
- Understanding JWT authentication workflow

---

# 📂 Project Structure

```text
spring-learn/
│
├── src
│   └── main
│       ├── java
│       │    └── com
│       │         └── cognizant
│       │              └── springlearn
│       │
│       │                  SpringLearnApplication.java
│       │
│       │                  controller
│       │                  └── AuthenticationController.java
│       │
│       │                  security
│       │                  ├── SecurityConfig.java
│       │                  └── JwtAuthorizationFilter.java
│       │
│       └── resources
│             application.properties
│
├── pom.xml
└── mvnw.cmd
```

---

# 🛠 Technologies Used

- Java 17
- Spring Boot 3
- Spring Security 6
- Maven
- Spring Web
- JJWT 0.11.5
- Embedded Tomcat

---

# 📦 Maven Dependencies

The following dependencies were added.

### Spring Security

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```

Provides:

- Authentication
- Authorization
- Security Filter Chain
- Password Encryption

---

### JWT

```xml
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-api</artifactId>
    <version>0.11.5</version>
</dependency>

<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-impl</artifactId>
    <version>0.11.5</version>
    <scope>runtime</scope>
</dependency>

<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-jackson</artifactId>
    <version>0.11.5</version>
    <scope>runtime</scope>
</dependency>
```

Provides:

- JWT Creation
- JWT Parsing
- JWT Validation

---

# 🔐 Security Configuration

A custom `SecurityConfig` class was created.

Features:

- CSRF Disabled
- HTTP Basic Authentication Enabled
- Password Encryption using BCrypt
- In-memory User Authentication
- JWT Authorization Filter Registered

Users configured:

| Username | Password | Role |
|----------|----------|------|
| admin | pwd | ADMIN |
| user | pwd | USER |

---

# 👤 Authentication Controller

A new REST Controller named

```
AuthenticationController
```

was created.

Endpoint:

```
GET /authenticate
```

Responsibilities:

- Read Authorization Header
- Decode Basic Authentication credentials
- Extract Username
- Generate JWT Token
- Return Token as JSON response

---

# 🔑 JWT Generation

The JWT contains:

- Subject (Username)
- Issue Time
- Expiration Time (20 Minutes)

Algorithm used:

```
HS256
```

A secret key is used to digitally sign the token.

---

# 🔓 Authentication Flow

```
Client
   │
   │ Username + Password
   ▼
/authenticate
   │
   ▼
AuthenticationController
   │
   ▼
Decode Basic Authentication
   │
   ▼
Generate JWT
   │
   ▼
Return Token
```

---

# 🛡 JWT Authorization Filter

A custom filter

```
JwtAuthorizationFilter
```

was implemented using

```
OncePerRequestFilter
```

Responsibilities:

- Read Authorization Header
- Verify Bearer Token
- Parse JWT
- Extract Username
- Create Authentication Object
- Store Authentication in SecurityContext

This enables future requests to be authenticated using JWT.

---

# ▶ Running the Application

The project was executed using Maven Wrapper.

```bash
.\mvnw.cmd spring-boot:run
```

Application started successfully.

Example log:

```
Tomcat started on port(s): 8083 (http)

Started SpringLearnApplication
```

---

# 🔨 Generate JWT Token

The authentication endpoint was tested using HTTP Basic Authentication.

```bash
curl.exe -u user:pwd http://localhost:8083/authenticate
```

Sample Response:

```json
{
    "token":"eyJhbGciOiJIUzI1NiJ9..."
}
```

This confirms:

- User Authentication Successful
- JWT Token Generated Successfully

---

# 📊 JWT Authentication Workflow

```
User
   │
   │ Username + Password
   ▼
Authentication Service
   │
   ▼
Spring Security
   │
   ▼
AuthenticationController
   │
   ▼
Generate JWT
   │
   ▼
Return JWT Token
   │
   ▼
Client Stores Token
   │
   ▼
Future Requests
Authorization: Bearer <JWT>
```

---

# 📁 Important Classes

## SecurityConfig.java

Responsible for:

- Configuring Spring Security
- Registering Password Encoder
- Creating In-memory Users
- Configuring Authorization Rules
- Registering JWT Filter

---

## AuthenticationController.java

Responsible for:

- Reading Authorization Header
- Decoding Basic Authentication
- Extracting Username
- Creating JWT
- Returning JWT Token

---

## JwtAuthorizationFilter.java

Responsible for:

- Reading Bearer Token
- Validating JWT
- Extracting User Information
- Creating Authentication Object
- Setting Security Context

---

# 📸 Sample Output

Generate Token

```text
curl.exe -u user:pwd http://localhost:8083/authenticate
```

Response

```json
{
    "token":"eyJhbGciOiJIUzI1NiJ9..."
}
```

---

# 📚 Concepts Learned

- Spring Security
- HTTP Basic Authentication
- BCrypt Password Encoder
- In-memory Authentication
- SecurityFilterChain
- JWT (JSON Web Token)
- JWT Structure
- Authorization Header
- Bearer Token
- JWT Generation
- JWT Validation
- OncePerRequestFilter
- REST API Security

---

# ✅ Conclusion

A Spring Boot REST application was successfully secured using Spring Security and JWT. In-memory users were configured with role-based authentication, an authentication endpoint was implemented to generate JWT tokens, and a custom JWT authorization filter was created to validate tokens for secured requests. This hands-on demonstrated the complete authentication workflow using JSON Web Tokens in a Spring Boot application.
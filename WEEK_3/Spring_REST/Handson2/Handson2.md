# 🌍 Hands-on 2: Spring Core – Load List of Countries from Spring Configuration XML

## 📖 Scenario

An airline booking application needs to maintain a predefined list of supported countries. Instead of hardcoding the data inside Java classes, Spring XML configuration is used to define Country beans and manage them through the Spring IoC Container.

---

# 🎯 Objective

Develop a Spring application that:

- Creates Country beans using XML configuration
- Stores multiple Country objects in a Spring-managed ArrayList
- Retrieves the list using the Spring IoC Container
- Displays the list using debug logs
- Understands the use of `<bean>`, `<list>`, and `<ref>` elements

---

# 📂 Files Added / Modified

```
Country.java
country.xml
SpringLearnApplication.java
```

---

# 🛠 Technologies Used

- Java
- Spring Boot
- Spring Core
- Spring Context
- XML Bean Configuration
- Maven

---

# 📖 Implementation Overview

## Country.java

Represents the Country model.

Fields:

- code
- name

Methods:

- Getters
- Setters
- Constructors
- toString()

---

## country.xml

Defines:

- Four Country beans
- One ArrayList bean (`countryList`)

Countries configured:

- India
- United States
- Germany
- Japan

---

## SpringLearnApplication.java

Added:

```java
displayCountries();
```

The method:

- Loads `country.xml`
- Retrieves `countryList`
- Prints all Country objects using logger

---

# 📖 Spring XML Elements

## `<bean>`

Defines a Spring-managed object.

Example:

```xml
<bean id="in"
      class="com.cognizant.springlearn.model.Country"/>
```

---

## `<list>`

Creates a collection of Spring beans.

Example:

```xml
<list>
```

---

## `<ref>`

References another bean defined in the Spring configuration.

Example:

```xml
<ref bean="in"/>
```

---

# 📊 Working Flow

```
SpringLearnApplication
            │
            ▼
displayCountries()
            │
            ▼
country.xml
            │
            ▼
Spring IoC Container
            │
            ▼
countryList Bean
            │
            ▼
List<Country>
            │
            ▼
Logger Output
```

---

# 📸 Sample Output

```
Inside main

Start

Countries =

Country [code=IN, name=India]

Country [code=US, name=United States]

Country [code=DE, name=Germany]

Country [code=JP, name=Japan]

End
```

---

# 📚 Concepts Learned

- Spring IoC Container
- XML Bean Configuration
- Bean References
- Collections in Spring
- ApplicationContext
- ClassPathXmlApplicationContext
- `<bean>`
- `<list>`
- `<ref>`

---

# ✅ Conclusion

The application successfully demonstrated XML-based bean configuration using Spring Core. Multiple Country objects were managed by the Spring IoC Container, grouped into a Spring-managed list, and retrieved within the application using `ApplicationContext`.
# Library Application	
library app based on Spring Boot
### Features
 - [x] Yazar Tanımı yapılabilmeli ( Yazar Adı, Açıklama )
 - [x] Yayın Evi Tanımı yapılabilmeli ( Yayın Evi Adı, Açıklama )
 - [x] Kitap tanıtımı yapılabilmeli ( kitap adı, kitap alt adı, kitap seri  
adı, yazar, yayın evi, isbn numarası, açıklama )
 - [ ] Bir Yazar için n tane kitap tanımlanabilmeli
 - [ ] Bir Yayın evi için n tane kitap tanımlanabilmeli  
 - [x] Kitap adı, Seri adı, Yazar ya da ISBN ile arama yapılabilmeli !!
 - [x] Var olan bir kayıt üzerinde değişiklik yapılabilmeli
 - [x] Var olan kayıtlar incelebilmeli
 - [x] Var olan bir kayıt silinebilmeli

### Running the application with Maven
Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:
```bash
	git clone https://github.com/isakulaksiz/library.git
	cd library
	mvn spring-boot:run
```
 ### Maven
    		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>


##### Display
![home](https://user-images.githubusercontent.com/26628508/99963559-03b45080-2da3-11eb-9e96-399fe44e6618.png)

![author1](https://user-images.githubusercontent.com/26628508/99963549-01ea8d00-2da3-11eb-9f7b-3672f695c846.png)

![author detail](https://user-images.githubusercontent.com/26628508/99960247-7cb0a980-2d9d-11eb-8510-0d2848100f02.png)

## Project Structure

#### Server - Backend

-   [JDK](https://www.oracle.com/java/technologies/javase-downloads.html#JDK15)  - Java™ Platform, Standard Edition Development Kit (15.0.1)
-   [Spring Boot](https://spring.io/projects/spring-boot)  - Framework to ease the bootstrapping and development of new Spring Applications
-   [Maven](https://maven.apache.org/)  - Dependency Management (3.6.3)


#### Client - Frontend/UI

-   [Bootstrap](https://getbootstrap.com/)  - Bootstrap is a free and open-source CSS framework directed at responsive, mobile-first front-end web development.
-   [Thymeleaf](https://www.thymeleaf.org/)  - Modern server-side Java template engine for both web and standalone environments.

#### Data
-   [MySQL](https://www.mysql.com/)  - Open-Source Relational Database Management System
-   [H2 Database Engine](https://www.h2database.com/html/main.html)  - Java SQL database. Embedded and server modes; in-memory databases

### Prerequisites
After creating the database/schema, you need to add your  **MySQL**  `username`  and  `password`  in the  `application-dev.properties`  file on  `src/main/resource`. The lines that must be modified are as follows:
```bash
	server.port=8081
	spring.datasource.url=jdbc:mysql://localhost:3306/library?useSSL=false&serverTimezone=UTC
	spring.datasource.username=root
	spring.datasource.password=admin
	spring.jpa.show-sql=true
	spring.jpa.properties.hibernate.format_sql=true
```
### EER Diagram

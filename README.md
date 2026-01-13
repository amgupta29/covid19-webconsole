# COVID-19 Web Console

A web application for tracking and visualizing COVID-19 symptoms and diagnoses with geographic mapping capabilities.

## 🚀 Recent Major Upgrade

### **Spring Boot & Java Upgrade Summary**
- ✅ **Spring Boot**: 1.5.1 → 3.2.1 (latest stable)
- ✅ **Java**: 8 → 17 (LTS version)
- ✅ **Tomcat**: 8.5.11 → 10.1.17
- ✅ **Dependencies**: Updated to Jakarta EE (javax.servlet → jakarta.servlet)
- ✅ **HttpClient**: Apache HttpClient 4.x → 5.x
- ✅ **Code**: Updated for Spring Boot 3.x compatibility
- ✅ **Application**: Running successfully on port 8080

### **Key Changes Made:**
- Updated `pom.xml` with latest Spring Boot 3.2.1 and Java 17
- Migrated from `javax.servlet` to `jakarta.servlet` packages
- Updated Apache HttpClient from 4.x to 5.x API
- Fixed Spring MVC configuration for Spring Boot 3.x compatibility
- Updated import statements and method signatures

### **Benefits:**
- **Security**: Latest security patches and fixes
- **Performance**: Significant performance improvements
- **Support**: Long-term support for Java 17 and Spring Boot 3.x
- **Modern APIs**: Updated to use Jakarta EE standards

## 🏗️ Technology Stack

- **Framework**: Spring Boot 3.2.1
- **Language**: Java 17
- **Build Tool**: Maven
- **Web Server**: Embedded Tomcat 10.1.17
- **Frontend**: JSP with JSTL
- **HTTP Client**: Apache HttpClient 5.x
- **API Integration**: AWS Lambda (COVID-19 heatmap data)

## 🏃‍♂️ Running the Application

### Prerequisites
- Java 17 or higher
- Maven 3.6+

### Local Development
```bash
# Navigate to the project directory
cd covid19-webconsole/covid19

# Run with Maven wrapper
./mvnw spring-boot:run

# Or with Maven directly
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## 📁 Project Structure

```
covid19-webconsole/
├── covid19/                    # Main Spring Boot application
│   ├── src/main/java/com/
│   │   ├── SpringBootWebApplication.java
│   │   └── controller/
│   │       ├── IndexController.java
│   │       └── MvcConfiguration.java
│   ├── src/main/resources/
│   │   └── application.properties
│   ├── src/main/webapp/WEB-INF/view/
│   │   └── index.jsp
│   └── pom.xml
├── docs/                       # Static documentation and data
│   ├── covid19_map_data.js
│   ├── index.html
│   └── map_data.json
└── README.md
```

## 🔧 Configuration

### Application Properties
The application uses standard Spring Boot configuration. Key settings in `application.properties`:

```properties
# Server configuration
server.port=8080

# View resolver configuration
spring.mvc.view.prefix=/WEB-INF/view/
spring.mvc.view.suffix=.jsp
```

## 🌟 Features

- **COVID-19 Symptom Tracking**: Collect and store symptom reports
- **Geographic Mapping**: Visualize data on interactive maps
- **AWS Integration**: Fetch heatmap data from AWS Lambda
- **Web Interface**: JSP-based user interface
- **REST API**: HTTP endpoints for data submission

## 📊 Data Structure

### Symptom Data
```javascript
{
  "value": {
    "longitude": 11.9817633,
    "latitude": 57.6958466,
    "symptoms": ["Moderate-to-severe-cough", "Sore-throat", "High-fever"],
    "diagnoses": ["Flu-Symptoms"]
  },
  "submitter": {
    "identifier": "anonymous-user-id"
  }
}
```

## 🔒 Security & Privacy

- Anonymous user submissions
- No personal data collection
- Secure HTTPS communication with AWS APIs
- Input validation and sanitization

## 🚀 Deployment

### Local Deployment
```bash
# Build the application
./mvnw clean package

# Run the JAR file
java -jar target/covid19-0.0.1-SNAPSHOT.war
```

### Production Deployment
The application can be deployed to any servlet container or run as a standalone JAR.

## 📈 API Endpoints

- `GET /` - Main application page
- `POST /api/heatmap` - COVID-19 data submission (via AWS Lambda)

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Test thoroughly
5. Submit a pull request

## 📄 License

This project is open source. Please check the license file for details.

## 📞 Support

For issues or questions, please create an issue in the GitHub repository.

---

**Last Updated**: January 2026  
**Spring Boot Version**: 3.2.1  
**Java Version**: 17
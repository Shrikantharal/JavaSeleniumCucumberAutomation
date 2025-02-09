# 🚀 Java selenium cucumber automation test
## 📌 Overview
Welcome to the **Java selenium cucumber automation test**! This framework is built using **Java, Selenium WebDriver, Cucumber, and Junit** to provide an efficient and scalable solution for automating web applications with BDD principles.

---

## 🎯 Key Features
✅ **Behavior-Driven Development (BDD)** using Cucumber for clear and structured test cases.  
✅ **Page Object Model (POM)** for maintainable and reusable code.  
✅ **Cross-browser compatibility** to test in multiple environments.  
✅ **Parallel execution support** with Junit.  
✅ **Maven integration** for seamless dependency management.  
✅ **Detailed Cucumber reports** for better analysis.  
✅ **CI/CD ready** with GitHub Actions.

---

## 🏗 Project Structure

```
JavaSeleniumCucumber
│── src
│   ├── main
│   │   ├── java/com/example
│   │   │   ├── actions        # Page Actions (User interactions)
│   │   │   ├── locators       # Element locators (POM)
│   │   │   ├── utils          # Common utility functions
│   │   ├── resources          # Configuration files
│   │       ├── config.properties
│   │       ├── uBlockOrigin.crx # adv blocker chrome extension
│   ├── test
│   │   ├── java/com/example
│   │   │   ├── definitions    # Cucumber Step Definitions
│   │   │   ├── runner         # Cucumber Test Runner
│   ├── test/resources         # Feature files (BDD scenarios)
│── pom.xml                    # Maven dependencies
│── cucumber.yml                # Cucumber configuration
│── README.md                   # Project documentation
```

---

## 🛠️ Tech Stack
🔹 **Java** - Core programming language  
🔹 **Selenium WebDriver** - Browser automation  
🔹 **Cucumber** - BDD framework  
🔹 **Junit** - Test execution  
🔹 **Maven** - Build and dependency management  
🔹 **GitHub Actions** - CI/CD integration  

---

## 🔧 Setup & Installation
### Prerequisites
✔ **Java (JDK 11+)**  
✔ **Maven**  
✔ **IntelliJ IDEA / Eclipse**  
✔ **Google Chrome & ChromeDriver**  

### Clone the Repository
```sh
git clone <repository_url>
cd JavaSeleniumCucumber
```

### Install Dependencies
```sh
mvn clean install
```

---

## 🚀 Running Tests
### Run All Tests
```sh
mvn test
```

### Run Specific Feature File
```sh
mvn test -Dcucumber.features=src/test/resources/features/ProductPage.feature
```

### Generate Cucumber Reports
```sh
mvn verify
```
📊 Reports will be generated in `target/cucumber-reports/`.

---

## 📌 Contribution Guidelines
👥 **Want to contribute?** Feel free to fork the repository and create pull requests!  

---

## 📩 Contact
📧 Have questions or suggestions? Reach out at **shrikantharal@gmail.com**.  

🌟 **If you find this framework useful, give it a star!** ⭐


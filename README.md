<div align="center">

# **ORDER PIZZA — UI TEST AUTOMATION FRAMEWORK**

*A clean & structured end-to-end test architecture.*

---

## **Context**

This project validates the core user journeys of an online pizza
ordering application using **BDD-driven UI automation**.

Each scenario reflects a **real customer interaction**,
from product selection to cart validation.

---

## **Objectives**

Validate add-to-cart flow
Verify quantity management
Test custom pizza configuration
Ensure cart behavior consistency
Generate readable test reports

---

## **Test Scenarios Covered**

Add pizza to cart
Increase product quantity
Remove product from cart
Verify empty cart message
Create your own pizza with random toppings
Verify cart quantity

---

## **Framework Design**

Page Object Model (POM)
Cucumber BDD (Gherkin)
Reusable utility methods
Centralized driver & config management
Hooks for lifecycle control

---

## **Tech Stack**

### **Core**

Java 17
Selenium WebDriver
Cucumber BDD
TestNG
Maven

### **Reporting**

Allure Report

---

## **Project Structure**

```
hooks          → scenario lifecycle management  
pages          → UI elements & page actions  
stepDefinitions→ Gherkin step implementations  
utilities      → driver, config & reusable helpers  
features       → business-readable test scenarios  
```

---

## **Execution**

Run all tests:

```
mvn clean test
```

---

## **Reporting**

Generate report:

```
allure generate target/allure-results --clean -o target/allure-report
```

Open report:

```
allure open target/allure-report
```

Quick serve:

```
allure serve target/allure-results
```

---

## **Key Takeaways**

Readable & maintainable test design
Strong separation of concerns
Realistic user-focused scenarios
Clean and visual reporting


📁 *This framework is part of a growing QA portfolio and is designed
to demonstrate real-world automation practices.*

![done](https://media3.giphy.com/media/v1.Y2lkPTc5MGI3NjExcTZjNzZ6N2ZrcTIyN2NrdmR6end5c3o3cW9lbW9nYXV1bnRsZ2RxNiZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/DaEjBX6gkJyR9nFtL7/giphy.gif)

</div>

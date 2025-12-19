<div align="center">

# **ORDER PIZZA — QA AUTOMATION CASE STUDY**

*A structured and evolving test automation framework.*

---

## 🚧 **Project Status**

**In progress / Actively evolving**
Core end-to-end flows are implemented.
New scenarios, refactors, and framework improvements are continuously added.

---

## **Context**

This project focuses on automating the core user journeys of an online
pizza ordering application.

Each test flow mirrors a **real customer behavior**,
from product selection to cart validation.

---

## **Objectives**

Validate add-to-cart functionality
Verify product quantity management
Test custom pizza configuration flow
Ensure cart consistency and empty-state behavior
Produce clear and readable automation reports

---

## **Covered User Flows**

Add pizza to cart
Increase product quantity
Remove product from cart
Verify empty cart message
Create your own pizza with dynamic toppings
Validate cart quantity

---

## **Methods**

UI Automation Testing
BDD-Driven Scenarios
Functional Validation
Dynamic Element Handling
Page Object Model (POM)
Cucumber + TestNG Integration

---

## **Tools Used**

### **Core Stack**

Java 17
Selenium WebDriver
Cucumber BDD
TestNG
Maven

### **Reporting**

Allure Report

---

## **Framework Structure**

```
hooks           → scenario lifecycle management  
pages           → UI elements & page actions  
stepDefinitions → Gherkin step implementations  
utilities       → driver, config & reusable helpers  
features        → business-readable scenarios  
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

## **Planned Enhancements**

Additional negative scenarios
Reusable method refactoring
Tag-based execution
Parallel test runs
CI/CD pipeline integration

---


📁 *This repository represents an evolving QA automation framework
and is part of an ongoing test-engineering portfolio.*

![done](https://media3.giphy.com/media/v1.Y2lkPTc5MGI3NjExcTZjNzZ6N2ZrcTIyN2NrdmR6end5c3o3cW9lbW9nYXV1bnRsZ2RxNiZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/DaEjBX6gkJyR9nFtL7/giphy.gif)

</div>

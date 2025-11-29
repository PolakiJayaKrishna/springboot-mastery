# 📍 Spring Boot - @RequestParam Demo

This project demonstrates how to use `@RequestParam` in Spring Boot for filtering, searching, and handling optional and required parameters in REST APIs.

---

## 🚀 Features

- Usage of **required request parameters**
- Usage of **default values**
- Handling **missing parameters**
- Filtering and searching products

---

## 🛠 Technology Stack

| Component  | Used              |
|------------|-------------------|
| Language   | Java              |
| Framework  | Spring Boot       |
| Build Tool | Maven             |
| Testing    | Postman / Browser |


---

## 📌 API Endpoints Tested

| Method | Endpoint                   | Description                                   |
|--------|----------------------------|-----------------------------------------------|
| GET    | `/filter?category=value`   | Filters products by category (required param) |
| GET    | `/products`                | Shows all products if no category is provided |
| GET    | `/products?category=value` | Shows filtered products                       |
| GET    | `/search?category=value`   | Searches category                             |
| GET    | `/search`                  | Uses default query param value `"all"`        |

---

## 🖼 Output Screenshots

### ❌ Missing Required Parameter
![Missing param error](./screenshots/1-missing-param-error.png)

    
---

### ✔ Filter Products by Category
![Filter with category](./screenshots/2-filter-with-category.png)

---

### ✔ Products with Explicit Category
![Products filtered](./screenshots/3-products-with-category.png)

---

### ✔ Products Without Parameter (Shows All)
![Products no param](./screenshots/4-products-without-param.png)

---

### ✔ Search Products with Category
![Search category](./screenshots/5-search-with-category.png)

---

### ✔ Search Using Default Param Value (`all`)
![Search default](./screenshots/6-search-default-value.png)

---

## 👨‍💻 Author

**Polaki Jaya Krishna**  
Final-year B.Tech | Java & Spring Boot Developer

---

### ⭐ If you find this useful, consider starring the repository!

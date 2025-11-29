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
## 🖼 Output Screenshots

### 1️⃣ Missing Required Parameter
![Missing param](./screenshots/1-missing-param-error.png)

---

### 2️⃣ Filter Products by Category
![Filter products](./screenshots/2-filter-with-category.png)

---

### 3️⃣ Products with Explicit Category Value
![Products filtered](./screenshots/3-products-with-category.png)

---

### 4️⃣ Products Without Any Parameter
![All products](./screenshots/4-products-without-param.png)

---

### 5️⃣ Search Products by Category
![Search category](./screenshots/5-search-with-category.png)

---

### 6️⃣ Search Using Default Value (`all`)
![Default search](./screenshots/6-search-default-value.png)

---

### 7️⃣ Search With Multiple Query Parameters (`keyword + page + size`)
> Example: `/products/search?keyword=tv&page=1&size=5`
![Multiple params](./screenshots/7-search-with-multiple-params.png)

---

### 8️⃣ Search With Only Pagination Parameters (`page + size`)
> Example: `/products/search?page=0&size=10`
![Pagination only](./screenshots/8-search-only-page-size.png)

---

### 9️⃣ Search With Only Keyword
> Example: `/products/search?keyword=phone`
![Keyword only](./screenshots/9-search-keyword-phone.png)

---

### 🔟 Search With Keyword + Pagination
> Example: `/products/search?keyword=laptop&page=2`
![Keyword + pagination](./screenshots/10-search-keyword-laptop-page.png)


## 👨‍💻 Author

**Polaki Jaya Krishna**  
Final-year B.Tech | Java & Spring Boot Developer

---

### ⭐ If you find this useful, consider starring the repository!

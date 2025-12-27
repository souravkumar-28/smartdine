# 🍽️ SmartDine – Smart Restaurant Ordering & Management System

## 📖 Summary
SmartDine is a full-stack restaurant ordering and management system built with **Java Spring Boot** and **MySQL**.  
Customers can browse the digital menu and place orders, while admins manage menu and orders through a secure dashboard.  
The project demonstrates REST APIs, database integration, Docker, and cloud deployment.

---

## ✨ Key Features
- 📋 Digital menu system
- 🛒 Online food ordering & cart
- 🔐 Secure admin login
- 🧑‍💼 Admin dashboard
- 🗄️ MySQL database persistence
- 🛠️ RESTful APIs
- 🐳 Dockerized app
- ☁️ Cloud deployed (Render + Railway)

---

## 🛠️ Tech Stack
- **Backend:** Java 17, Spring Boot, Spring Data JPA, Hibernate  
- **Frontend:** HTML, CSS, JavaScript, Bootstrap 5  
- **Database:** MySQL (Railway)  
- **Tools:** Maven, Docker, Git, GitHub  
- **Hosting:** Render

---

## 👥 User Roles
**Customer**
- View menu
- Add to cart
- Place order  

**Admin**
- Login securely
- Add/update/delete menu items
- Manage availability
- View orders  

---

## 🚀 Functionalities
- 📋 **Menu Management:** Dynamic CRUD of food items with price, category, image, availability  
- 🛒 **Cart System:** Add/remove items, quantity update, auto total  
- 📦 **Order System:** Place orders and store in DB  
- 🧑‍💼 **Admin Dashboard:** Manage menu & view orders  
- 🔐 **Authentication:** Admin login with DB validation  
- 🔁 **REST APIs:** `/api/menu`, `/api/orders`, `/api/admin/login`  
- 🗄️ **Persistence:** Tables – admin, menu_item, orders, order_items  
- 🐳 **Docker:** Containerized build & run  
- ☁️ **Deployment:** Spring Boot on Render, MySQL on Railway  

---

## 🏗️ Architecture
Frontend → Spring Boot REST API → MySQL Database  

Layers:
- Controller
- Service
- Repository
- Entity

---

## 🔁 Flow
1. Customer opens menu  
2. Frontend calls `/api/menu`  
3. Backend fetches from MySQL  
4. User adds to cart  
5. Order placed via `/api/orders`  
6. Admin views in dashboard  

---

🌐 Live Demo

Admin-  https://smartdine-s9py.onrender.com/admin-dashboard.html
Customer- https://smartdine-s9py.onrender.com/menu.html
Kitchen- https://smartdine-s9py.onrender.com/kitchen.html


👨‍💻 Author

Sourav Kumar
🎓 B.Tech Student
🔗 GitHub: https://github.com/souravkumar-28

🔗 LinkedIn: www.linkedin.com/in/souravkumar28


www.linkedin.com/in/souravkumar28

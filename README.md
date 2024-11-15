# 🏥 Hospital Management System

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java Badge" />
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL Badge" />
  <img src="https://img.shields.io/badge/Apache-CA2136?style=for-the-badge&logo=apache&logoColor=white" alt="Apache Badge" />
  <img src="https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white" alt="Eclipse Badge" />
</p>

The **Hospital Management System** is a Java-based application designed to streamline and automate various processes within a medical facility. Leveraging the **Model-View-Controller (MVC)** architecture, this project ensures a modular and organized approach to efficient system management.

---

## 🌟 Features

### 1️⃣ Authentication and Logging
<p align="center">
  <img src="https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/b4b6e9d3-9a9d-402b-b7a5-b26534a48f09" alt="Authentication" width="400"/>
</p>

- **Secure Login**: Role-based access for patients, doctors, pharmacists, and admins.
- **Action Logging**: Records all user actions for auditing purposes.
- **Role-Based Access**: Permissions tailored to user roles.

---

### 2️⃣ Appointment Management

#### Patient Appointments
<p align="center">
  <img src="https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/afd0c81e-0347-498e-a2e5-a7244d95b859" alt="Patient Appointment" width="400"/>
</p>
- Schedule, update, or cancel appointments.

#### Doctor Appointments
<p align="center">
  <img src="https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/6d89c14a-88e5-4b3e-b22e-0281cb117343" alt="Doctor Appointment" width="400"/>
</p>
- View scheduled appointments.
- Create and update prescriptions.

---

### 3️⃣ Medicine Inventory Management
<p align="center">
  <img src="https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/96289884-a3d8-4b58-8a99-b4d7a32056ea" alt="Medicine Inventory" width="400"/>
</p>

- Pharmacists can add, update, and delete medicines in the inventory.

---

### 4️⃣ User Management (Admin)
<p align="center">
  <img src="https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/7919a252-fb20-4187-80cd-2926ab055b5f" alt="Admin Management" width="400"/>
</p>

- Create, update, delete user accounts.
- Search and view user details.

---

## 🛠️ Technologies Used

### Backend
- **Java**: Core programming language.
- **Apache Server**: Backend server for handling requests.
- **MySQL**: Database for managing system data.

### Frontend
- **JSP (Java Server Pages)**: For rendering dynamic web pages.

### Development Tools
- **Eclipse IDE**: For coding and project management.

---

## 🗂️ Project Structure

### **MVC Architecture**
- **Model**: Manages data and business logic (e.g., authentication, appointments).
- **View**: Represents user interfaces (JSP files).
- **Controller**: Handles user inputs and updates Models and Views.

### Additional Directories
- **`web/WEB-INF`**: Configuration and JSP files.
- **`sql/`**: SQL scripts for database setup.

---

## ⚙️ Installation

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/dilrukshax/hospital-management-system.git
```

### 2️⃣ Import Project into Eclipse
- Open Eclipse and import the project as an existing Maven project.

### 3️⃣ Configure Apache Server
- Configure Apache to serve the application locally.

### 4️⃣ Set Up the Database
- Import SQL scripts into MySQL.
- Update database credentials in the application.

### 5️⃣ Run the Application
- Launch the application from Eclipse and access it via:
  [http://localhost:8080](http://localhost:8080)

---

## 🤝 Contribution

We welcome contributions to improve the project! Follow these steps:

1. **Fork the Repository**.
2. **Create a New Branch**:
   ```bash
   git checkout -b feature-name
   ```
3. **Commit Your Changes**:
   ```bash
   git commit -m "Added a new feature"
   ```
4. **Push Your Branch**:
   ```bash
   git push origin feature-name
   ```
5. Submit a **Pull Request** for review.

---

**Revolutionize healthcare management with the Hospital Management System!** 🏥

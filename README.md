# Hospital Management System

The Hospital Management System is a Java-based application designed to streamline and automate various processes within a medical facility. Leveraging the Model-View-Controller (MVC) architecture, this project ensures a modular and organized approach to system development.

## MVC Architecture

The Hospital Management System follows the MVC design pattern, which separates the application into three interconnected components:

- **Model**: Manages the data and business logic of the system. Includes functionalities for handling user authentication, appointment management, prescription creation, and medicine inventory.

- **View**: Represents the user interface for different actors in the system, such as patients, doctors, pharmacists, and administrators.

- **Controller**: Acts as an intermediary, handling user inputs, processing requests, and updating both the Model and View accordingly.

This separation of concerns enhances code organization, maintainability, and scalability, facilitating independent development and testing of each component.

## Technologies and Tools

- **Programming Language**: Java
- **Web Server**: Apache
- **Integrated Development Environment (IDE)**: Eclipse
- **Database Management System**: MySQL

## Features

### 1. Authentication and Logging

- **Secure Login**: Users are required to authenticate using secure login credentials.
- **Role-based Access Control**: Access to different features is based on user roles (patient, doctor, pharmacist, admin).
- **Logging**: All user actions and system events are logged for audit purposes.

### 2. Appointment Management

- **Patient Appointments**:
  - *Add Appointments*: Patients can schedule appointments with doctors.
  - *Update and Delete*: Patients can modify or cancel their appointments.

- **Doctor Appointments**:
  - *View and Delete*: Doctors can view scheduled appointments and cancel them if necessary.
  - *Prescription Creation*: Doctors can create prescriptions for appointments.
  - *Prescription Updates*: Doctors can update existing prescriptions.

### 3. Medicine Inventory Management

- **Pharmacist Responsibilities**:
  - *Update Medicines*: Pharmacists can update details of medicines in the inventory.
  - *Delete Medicines*: Pharmacists can remove medicines from the inventory.

### 4. User Management (Admin)

- **Admin Privileges**:
  - *Create Users*: Admins can create new user accounts.
  - *View Users*: Admins can see a list of all users in the system.
  - *Find Users*: Admins can search for specific users based on criteria.
  - *Update Users*: Admins can modify user details.
  - *Delete Users*: Admins can remove user accounts.

## Technologies Used

- **Cookies and Session Management**: Implemented for a seamless user experience and secure session handling.

## Development Environment

- **IDE**: Eclipse is used as the primary Integrated Development Environment for coding and project management.

- **Web Server**: Apache is utilized to serve the application, ensuring efficient communication between the client and server components.

- **Database**: MySQL serves as the backend database to store and manage the application's data.

## Project Structure

The project follows a modular structure for each MVC component:

- **`src/main/java`**: Contains the Java source code.
  - **`com.example.model`**: Classes representing data and business logic.
  - **`com.example.view`**: Classes responsible for user interface components.
  - **`com.example.controller`**: Classes handling user inputs and coordinating interactions between Model and View.

- **`web`**: Houses web-related files.
  - **`WEB-INF`**: Configuration files, JSP files for views.

- **`sql`**: SQL scripts for database setup and initialization.

## Installation

Follow these steps to set up the Hospital Management System on your local environment:

1. Clone the repository:

   ```bash
   git clone https://github.com/dilrukshax/hospital-management-system.git
   ```

2. Import the project into Eclipse.

3. Configure Apache to serve the application.

4. Set up the MySQL database and update the database configuration in the application.

5. Run the application and navigate to `http://localhost:your-port` in your web browser.

For detailed installation instructions and troubleshooting, refer to the [Installation Guide](link-to-installation-guide).

## Contribution

We welcome contributions from the community! If you'd like to contribute to the Hospital Management System project, please follow our [Contribution Guidelines](link-to-contribution-guidelines).

## License

This project is licensed under the [MIT License](link-to-license).


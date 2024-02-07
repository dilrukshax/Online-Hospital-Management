# Hospital Management System

![Web capture_7-2-2024_8281_localhost](https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/8814eb11-7876-46fd-8e42-ed5e574e3bbf)


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

![Web capture_7-2-2024_83110_localhost](https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/b4b6e9d3-9a9d-402b-b7a5-b26534a48f09)

- **Secure Login**: Users are required to authenticate using secure login credentials.
- **Role-based Access Control**: Access to different features is based on user roles (patient, doctor, pharmacist, admin).
- **Logging**: All user actions and system events are logged for audit purposes.
![Web capture_7-2-2024_82920_localhost](https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/0692cae5-7aa3-4bbe-b912-6e6f21462410)

### 2. Appointment Management

- **Patient Appointments**:
  - *Add Appointments*: Patients can schedule appointments with doctors.
  ![Web capture_7-2-2024_83310_localhost](https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/afd0c81e-0347-498e-a2e5-a7244d95b859)
  ![Web capture_7-2-2024_83418_localhost](https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/eef483b5-8029-40a3-a778-091957896ae5)
  - *Update and Delete*: Patients can modify or cancel their appointments.
  ![Web capture_7-2-2024_83335_localhost](https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/cabbe926-6fd4-45e2-b1a6-07dcf2350062)

- **Doctor Appointments**:
  - *View and Delete*: Doctors can view scheduled appointments and cancel them if necessary.
  ![Web capture_7-2-2024_83649_localhost](https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/8222f577-ba29-4339-aabc-f0bd44804499)
  - *Prescription Creation*: Doctors can create prescriptions for appointments.
  - *Prescription Updates*: Doctors can update existing prescriptions.
  ![Web capture_7-2-2024_83723_localhost](https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/c458968e-4850-45e5-a0a5-267973279ddf)
  ![Web capture_7-2-2024_8411_localhost](https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/6d89c14a-88e5-4b3e-b22e-0281cb117343)


### 3. Medicine Inventory Management

- **Pharmacist Responsibilities**:
  - *Add Medicines*: Pharmacists can Add details of medicines in the inventory.
  ![Web capture_7-2-2024_84015_localhost](https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/96289884-a3d8-4b58-8a99-b4d7a32056ea)
  - *Update Medicines*: Pharmacists can update details of medicines in the inventory.
  - *Delete Medicines*: Pharmacists can remove medicines from the inventory.

### 4. User Management (Admin)

- **Admin Privileges**:
  - *Create Users*: Admins can create new user accounts.
  ![Web capture_7-2-2024_8353_localhost](https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/1af1050b-c412-4bf9-ad3c-a1c2ae00d45a)

  - *View Users*: Admins can see a list of all users in the system.
  - *Find Users*: Admins can search for specific users based on criteria.
  - *Update Users*: Admins can modify user details.
  - *Delete Users*: Admins can remove user accounts.
  ![Web capture_7-2-2024_83549_localhost](https://github.com/dilrukshax/Online-Hospital-Management/assets/100220079/7919a252-fb20-4187-80cd-2926ab055b5f)

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


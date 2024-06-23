# Employee Management System

This project is a Java Swing GUI application developed using Maven and MySQL Workbench. It provides functionalities for managing employee data efficiently. You can view employees, add new employees, update employee details, and remove employees in real-time through a user-friendly interface.

## Demo Video

Watch the demo of the project on YouTube: [Employee Management System Demo](#insert_youtube_link_here)

## Prerequisites

Before running this project, ensure you have the following installed:

- IntelliJ IDEA 
- MySQL Workbench
- JDK 8 or higher

## Getting Started

Follow these steps to set up and run the project locally:

1. **Clone the Repository:**
  ```java
git clone https://github.com/mustafa-dohad/employee-management-system.git
```
2. **Open Project in IntelliJ IDEA:**

- Open IntelliJ IDEA.
- Navigate to `File` -> `Open` and select the cloned repository.
- Locate the `src` folder which contains all the source code files.

3. **Setup MySQL Database:**

- Open MySQL Workbench.
- Import the SQL file named `employee-management-system.sql`.
- This SQL file contains all the necessary queries to create the database structure. Run the file to create the `employeemanagement` database on your local MySQL server.

4. **Configure Database Connection:**

- Open the `conn.java` file located in `src/employee/management/system/` folder.
- Locate the following line of code:
  ```java
  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement", "root", "Smd2002@");
  ```
- Replace `"localhost"` with your MySQL server hostname or IP address, `"root"` with your MySQL username, and `"Smd2002@"` with your MySQL password.

5. **Run the Application:**

- Once the database connection is configured, you're ready to run the application.
- Run the main class `Splash.java` to start the Employee Management System.

## Features

- **View Employees:** See a list of all employees with details.
- **Add Employees:** Add new employees to the database.
- **Update Employee Details:** Modify existing employee information.
- **Remove Employee:** Delete employees from the database.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or a pull request.

## License

This project is licensed under the [Mustafa Dohad License](LICENSE).

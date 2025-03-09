# Task 2: Login and Signup System using PHP and MySQL

## Overview
This project is a user authentication system that allows users to register and log in securely. It is built using PHP and MySQL, with a focus on security and usability.

## Features
- Secure user registration and login
- Password hashing for security
- Error handling and form validation
- Session management for user authentication
- Responsive design for different devices

## Technologies Used
- **PHP**: Server-side scripting language for backend processing
- **MySQL**: Database for storing user credentials
- **HTML5 & CSS3**: Frontend structure and styling
- **XAMPP**: Local development environment

## Installation & Setup
1. **Clone the repository:**
   ```sh
   git clone https://github.com/your-username/Main-Flow-Services-And-Technologies-Internship-Tasks.git
   ```
2. **Navigate to the project folder:**
   ```sh
   cd Main-Flow-Services-And-Technologies-Internship-Tasks/Task 2
   ```
3. **Start XAMPP and enable Apache & MySQL.**
4. **Create the database:**
   - Open `phpMyAdmin` and create a new database named `user_auth`.
   - Import the `database.sql` file provided in the project.
5. **Run the project:**
   - Place the project folder inside the `htdocs` directory of XAMPP.
   - Open `http://localhost/Task2` in your browser.

## File Structure
```
Task 2/
│── index.php          # Homepage
│── register.php       # User registration page
│── login.php          # User login page
│── logout.php         # Logout script
│── config.php         # Database configuration
│── dashboard.php      # User dashboard after login
│── styles.css         # CSS for styling
│── database.sql       # SQL file to set up the database
│── README.md          # Project documentation
```

## Live Demo
Check out the live version of the login and signup system here: **Live Site**

## Future Improvements
- Implement email verification
- Add password reset functionality
- Improve UI with animations
- Use prepared statements for enhanced security

## Author
Harshika Bansal

## License
This project is open-source and available under the MIT License.

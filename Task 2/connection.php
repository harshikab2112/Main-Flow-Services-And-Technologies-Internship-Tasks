<?php
$servername = "localhost"; // Change if using a remote server
$username = "root"; // Change if your database has a different username
$password = ""; // Change if you have set a database password
$database = "db"; // Ensure this matches your actual database name

// Create connection
$conn = new mysqli($servername, $username, $password, $database);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
?>

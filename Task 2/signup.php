<?php
session_start();
if (isset($_SESSION['username'])) {
    header("Location: welcome.php");
    exit();
}

include("connection.php");

if (isset($_POST['submit'])) {
    $username = mysqli_real_escape_string($conn, $_POST['user']);
    $email = mysqli_real_escape_string($conn, $_POST['email']);
    $password = mysqli_real_escape_string($conn, $_POST['pass']);
    $cpassword = mysqli_real_escape_string($conn, $_POST['cpass']);

    // Check if username or email already exists
    $sql_user = "SELECT * FROM signup WHERE username='$username'";
    $sql_email = "SELECT * FROM signup WHERE email='$email'";

    $result_user = mysqli_query($conn, $sql_user);
    $result_email = mysqli_query($conn, $sql_email);

    $count_user = mysqli_num_rows($result_user);
    $count_email = mysqli_num_rows($result_email);

    if ($count_user == 0 && $count_email == 0) {
        if ($password === $cpassword) {
            $hash = password_hash($password, PASSWORD_DEFAULT);
            $sql = "INSERT INTO signup(username, email, password) VALUES('$username', '$email', '$hash')";
            if (mysqli_query($conn, $sql)) {
                header("Location: login.php");
                exit();
            } else {
                echo '<script>alert("Database error: Unable to register!"); window.location.href="signup.php";</script>';
                exit();
            }
        } else {
            echo '<script>alert("Passwords do not match!"); window.location.href="signup.php";</script>';
            exit();
        }
    } else {
        echo '<script>';
        if ($count_user > 0) echo 'alert("Username already exists!");';
        if ($count_email > 0) echo 'alert("Email already exists!");';
        echo 'window.location.href="signup.php";</script>';
        exit();
    }
}
?>

<?php include("navbar.php"); ?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Fusion Portion - Signup</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <div id="form">
        <h1 id="heading">Sign Up</h1><br>
        <form action="signup.php" method="POST">
            <label>Enter Username:</label>
            <input type="text" name="user" required><br><br>
            <label>Enter Email:</label>
            <input type="email" name="email" required><br><br>
            <label>Create Password:</label>
            <input type="password" name="pass" required><br><br>
            <label>Retype Password:</label>
            <input type="password" name="cpass" required><br><br>
            <input type="submit" id="btn" value="Sign Up" name="submit">
        </form>
    </div>
</body>

</html>
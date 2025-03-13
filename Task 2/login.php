<?php
session_start();
include("connection.php");

if (isset($_SESSION['username'])) {
    header("Location: welcome.php");
    exit();
}

if (isset($_POST['submit'])) {
    $email = mysqli_real_escape_string($conn, $_POST['email']);
    $password = $_POST['pass'];

    $sql = "SELECT * FROM signup WHERE email='$email'";
    $result = mysqli_query($conn, $sql);

    if (!$result) {
        die("Database query failed: " . mysqli_error($conn)); // Debugging line
    }

    $row = mysqli_fetch_assoc($result);

    if ($row) {
        if (password_verify($password, $row['password'])) {
            $_SESSION['loggedin'] = true;
            $_SESSION['username'] = $row['username'];
            header("Location: welcome.php");
            exit();
        } else {
            echo '<script>alert("Incorrect Password!"); window.location.href="login.php";</script>';
        }
    } else {
        echo '<script>alert("Email not registered!"); window.location.href="login.php";</script>';
    }
}
?>

<?php include("navbar.php"); ?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Fusion Portion - Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <div id="form">
        <h1 id="heading">Login Form</h1><br>
        <form action="login.php" method="POST">
            <label>Enter Email:</label>
            <input type="email" name="email" required><br><br>
            <label>Enter Password:</label>
            <input type="password" name="pass" required><br><br>
            <input type="submit" id="btn" value="Login" name="submit">
        </form>
    </div>
</body>

</html>

<?php
session_start();
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Fusion Portion - Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="style.css">
    <style>
        .hero-section {
            background: url('images/perfume-bg.jpg') no-repeat center center/cover;
            height: 100vh;
            display: flex;
            align-items: center;
            justify-content: center;
            text-align: center;
            color: white;
            padding: 20px;
        }

        .info-box {
            background-color: rgba(255, 255, 255, 0.9);
            padding: 40px;
            border-radius: 10px;
            box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.2);
            width: 400px;
        }

        .btn-custom {
            width: 100%;
            margin-top: 10px;
            padding: 10px;
            font-size: 18px;
            font-weight: bold;
            border-radius: 5px;
        }

        .content-section {
            padding: 50px 20px;
            text-align: center;
        }

        .content-section h2 {
            margin-bottom: 20px;
        }

        .content-section p {
            font-size: 18px;
            color: #555;
        }
    </style>
</head>

<body>
    <?php include("navbar.php"); ?>

    <!-- Hero Section -->
    <div class="hero-section">
        <div class="info-box">
            <h1 class="text-dark">Welcome to Fusion Portion</h1>
            <p class="text-muted">Discover the world of enchanting fragrances.</p>
            <?php if (!isset($_SESSION['loggedin'])): ?>
                <a href="signup.php" class="btn btn-success btn-custom">Sign Up</a>
                <a href="login.php" class="btn btn-primary btn-custom">Login</a>
            <?php else: ?>
                <a href="welcome.php" class="btn btn-info btn-custom">Go to Dashboard</a>
                <a href="logout.php" class="btn btn-danger btn-custom">Logout</a>
            <?php endif; ?>
        </div>
    </div>

    <!-- About Section -->
    <div class="content-section">
        <h2>About Fusion Portion</h2>
        <p>
            Fusion Portion is your one-stop destination for luxury perfumes. We bring you an exquisite selection of fragrances
            from around the world. Whether you are looking for a fresh floral scent or a deep musky aroma, we have something
            for every preference.
        </p>
    </div>

    <!-- Collections Section -->
    <div class="content-section bg-light">
        <h2>Our Exclusive Collections</h2>
        <p>
            Explore our hand-picked collections featuring top brands and exclusive blends. Experience the art of perfumery
            with scents that leave a lasting impression.
        </p>
    </div>

    <!-- Contact Section -->
    <div class="content-section">
        <h2>Get in Touch</h2>
        <p>
            Have questions or need recommendations? Contact us and let our fragrance experts assist you in finding the
            perfect scent.
        </p>
    </div>
</body>

</html>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inscription</title>
</head>

<body>
    <form action="" method="post">
        <label for="username">Entrer votre username : </label>
        <input type="text" name="username" required></input>
        <label for="password">Entrer votre mot de passe : </label>
        <input type="password" name="password" required></input>
        <input type="submit" name="SendNude" id="SendNude"></input>
    </form>
    <?php
    include('../php/db.php');
    global $link_sql;
    include('../php/register.php');
    ?>
</body>

</html>
<?php
if (isset($_POST['SendNude'])) {

    extract($_POST);
    $options = [
        'cost' => 12,
    ];
    $password_crypt = password_hash($password, PASSWORD_BCRYPT, $options);

    $connection = $link_sql->prepare("INSERT INTO admin (user, password) VALUES (:user, :password)");

    $connection->execute([
        'user' => $username,
        'password' => $password_crypt
    ]);
}
?>
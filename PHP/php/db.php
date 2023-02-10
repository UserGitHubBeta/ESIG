<?php

define('HOST', 'localhost');
define('DB_NAME', 'myphp');
define('USER', 'root');
define('PASS', '');

try {
    $link_sql = new PDO("mysql:host=" . HOST . ";dbname=" . DB_NAME, USER, PASS);
    $link_sql->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
} catch (PDOException $e) {
    echo $e;
}
?>
<?php
// Livret de 7
// 1 x 7 = 7
// 2 x 7 = 14
// 3 x 7 = 21
// 4 x 7 = 28
// 5 x 7 = 35
// 6 x 7 = 42
// 7 x 7 = 49
// 8 x 7 = 56
// 9 x 7 = 63
// 10 x 7 = 70
// 11 x 7 = 77
// 12 x 7 = 84

$k = 12;
$n = 7;

for ($i = 1; $i < $k; $i++) {
    echo $i . " x " . $n . " = " . $n * $i . '<br>';
}


$symb = "*";

for ($i = 0; $i < 7; $i++) {
    echo str_repeat($symb, $i);
    echo '<br>';
}

$num = 10;
// Changer l'incrémentation pour afficher de 2 en 2
for ($i = 0; $i <= 20; $i += 2) {
    if ($i == 10) {
        echo "<strong> $i </strong> <br>";
    } else {
        echo $i, "<br>";
    }
}

echo "<br>";

$tableau = [
    "Allemagne" => "Berlin",
    "Autriche" => "Vienne",
    "France" => "Paris",
    "Italie" => "Rome",
    "Liechtenstein" => "Vaduz"
];

// echo "Capitale de " . $tableau["Allemagne"] . "<br>";
echo "<ul>";
foreach ($tableau as $key => $value) {
    echo "<li>" . $key . " : " . $value . "</li>";
}
echo "</ul>";

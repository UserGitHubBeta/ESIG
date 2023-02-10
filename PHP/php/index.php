<!-- Début Connection MySQL -->
<?php
include('db.php');
?>
<!-- Fin Connection MySQL -->


<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8" />
    <title>Ma page web</title>
    <link rel="stylesheet" href="index.css">

</head>

<body>
    <h2 style="font-family: 'Poppins', sans-serif; text-align: center; margin-bottom: 50px;">Entrer vos informations de
        connexion</h2>
    <div id="GlobalHeader">
        <div id="FirstHeader">
            <h3 style="text-align: center; font-family: 'Poppins', sans-serif;">Informations de connexions</h3>
            <form action="" method="post">
                <label for="prenom">Entrer votre prénom : </label>
                <input type="text" name="prenom" required></input>
                <br>
                <label for="age">Entre votre age : </label>
                <input type="number" name="age" id="age">
                <br>
                <input class="ButtonForm" type="submit" value="Envoyer"></input>
            </form>
        </div>
        <div id="SecondHeader">
            <h3 style="text-align: center; font-family: 'Poppins', sans-serif;">Mes informations de connexion</h3>
            <fieldset>
                <p>
                    <?php // récupère la variable "prénom" dans le formulaire à partir de la méthode POST
                    echo 'Bonjour ' . $_POST['prenom']; ?>
                </p>
                <p>
                    J'ai actuellement
                    <?php echo $_POST['age']; ?> ans
                </p>
                <p>Aujourd'hui nous sommes le
                    <?php // Récupère la date actuelle avec la variable "echo date"
                    echo date('d/m/Y h:i:s'); ?>.
                </p>
            </fieldset>
            <!-- Exécuter un lien en php -->
            <?php
            // Création de la variable $url
            $url = 'https://eduge.ch';
            $text = "Les cours";
            echo '<a href="' . $url . '">Les cours</a>';
            ?>
        </div>
    </div>
</body>

</html>
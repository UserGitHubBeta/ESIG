# Épreuve du 21.09.2022
# Exercice 2 – Tunnel du Gothard


# Constantes
CATEGORIE_1 = "une voiture"
CATEGORIE_2 = "un camion"
CATEGORIE_3 = "un camion sans remorque"

PRIX_VOITURE = 15

TAXE_LONGEUR = 5
MAX_LONGEUR = 8

PRIX_SUPPLEMENT = 30

# Procédures et fonctions


def afficher_categorie(categorie):
    if categorie == 1:
        return CATEGORIE_1
    elif categorie == 2:
        return CATEGORIE_2
    elif categorie == 3:
        return CATEGORIE_3
    else:
        return print("Entrer une catégorie entre 1 et 3 !")

def calcul_poids(poids):
    if poids < 4:
        return 15
    elif poids < 10:
        return 20
    elif poids >= 10 and poids < 25:
        return 30
    elif poids >= 26 and poids < 38: 
        return 42
    elif poids > 38:
        return 50

def calcul_longeur(longeur):
    if longeur > MAX_LONGEUR:
        return (longeur - MAX_LONGEUR) * TAXE_LONGEUR
    else:
        return 0

def calcul_prix(categorie, poids, longeur):
    if categorie == 1:
        return PRIX_VOITURE
    elif categorie == 2 or categorie == 3:
        prix_poids = calcul_poids(poids)
        prix_longeur = calcul_longeur(longeur)
        prix_longeur_poids = prix_poids + prix_longeur
        if categorie == 3:
            return (PRIX_SUPPLEMENT / 100 * prix_longeur_poids) + prix_longeur_poids
        return prix_longeur_poids

def afficher_resultat(nom_categorie, prix_final):
    print(f"Le véhicule est {nom_categorie}")
    print(f"Le prix totale est de {prix_final} CHF")
# Appel de la procédure main()


def main():
    categorie = int(input(
        "Entrer une catégorie : \n1 - Voiture \n2 - Camion sans remorque\n3 - Camion avec remorque\n\n Saisissez le choix : "))
    longeur = int(input("Entrer une longeur : "))
    poids = int(input("Entrer un poids : "))

    nom_categorie = afficher_categorie(categorie)

    prix_final = calcul_prix(categorie, poids, longeur)

    afficher_resultat(nom_categorie, prix_final)


if __name__ == "__main__":
    main()

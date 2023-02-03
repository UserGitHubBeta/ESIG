# ER ALP 31-10-2022
# AGOSTA LOIC !
# ESIG 1

from math import ceil

# constantes ici si vous en ajoutez


# Constantes fournies -- NE PAS MODIFIER !!
DIST_TOT_TREK = 200

KIRK = [29, 26, 30, 29, 28, 30, 28]
PICARD = [29, 33, 27, 29, 37, 30]
SULU = [21, 22, 16, 18, 28, 0]

# Fonctions fournies -- NE PAS MODIFIER !!


def arrondi_dixieme(x):  # arrondi un nombre au dixième
    return round(x, 1)


def arrondi_superieur(x):
    return ceil(x)

##############################################
# Votre code ici


# Fonction permettant de calculer une somme totale
def la_distance_total(ma_liste):
    somme = 0
    for i in range(len(ma_liste)):  # Pour chaque rangé de la liste, avec somme en valeur
        # Ajout de chaque valeur de la liste dans la "somme"
        somme += ma_liste[i]

        # Somme sauvegardé pour le test
    return somme


def tjrs_en_course_ou_pas(ma_liste):
    # Pour chaque élément de la longeur de la liste
    for i in range(len(ma_liste)):
        # Si le dernier élément de la liste est égale à 0
        # ou
        # Ou la distance totale est supérieur ou égale à 200
        if la_distance_total(ma_liste) >= DIST_TOT_TREK or ma_liste[-1] == 0:
            return False  # > Indiquer que cet élément est faux cf. Recap
    return True  # > Indiquer c'est vrai -> cf. Recap


def moyenne_globale(ma_liste):
    # Si le dernier élément de la liste (en négatif) est 0
    if ma_liste[-1] == 0:
        # Moyenne en enlevant l'élément de la liste
        return arrondi_dixieme((la_distance_total(ma_liste) / len(ma_liste) - 1))
    else:
        return arrondi_dixieme(la_distance_total(ma_liste) / len(ma_liste))


def parcours_restant(ma_liste):
    # 200 - la distance totale de chaque liste
    return DIST_TOT_TREK - la_distance_total(ma_liste)


def demi_parcours(ma_liste):
    liste_distance = 0
    for i in range(len(ma_liste)):
        # Inclusion des éléments dans la liste pour l'addition
        liste_distance += ma_liste[i]
        # Si la valeur de chaque élément a atteinds 100 ou plus grand
        if liste_distance >= 100:

            # Stocker le jour indiqué
            return i+1


def meill_performance(ma_liste):
    # Valeur du jour de la performance
    liste_distance = 0
    # Jour / Position de la performance
    jour = 0
    for i in range(len(ma_liste)):
        if ma_liste[i] > liste_distance:
            liste_distance = ma_liste[i]  # -> valeur de la liste
            jour = i  # i -> position de la liste
    return jour
        # procédure recap à compléter


def evolu_moyenne(ma_liste):
    liste_distance = 0
    jour = 0
    print("Voici l'évolution du parcours par jour :")
    for i in range(len(ma_liste)):
        liste_distance += ma_liste[i]
        jour += 1
        # Chaque élémenet de la liste est différent de 0
        if ma_liste[i] != 0:
            print(f"au jour de {i} : {liste_distance}")


def nombre_jours_restants(ma_liste):
    # Diviser le parcours restant par la moyenne globale
    return arrondi_superieur((parcours_restant(ma_liste) / moyenne_globale(ma_liste)))


def recap(parcours, nom):
    print("Parcours de", nom)
    if la_distance_total(parcours) == DIST_TOT_TREK:
        print(f"{nom} a atteint l'objectif en {len(parcours)} jours")
    else:
        print(f"{nom} a réalisé la moitié dela distance en {len(parcours)} jours")
    print(f"{nom} est toujours en cours après {la_distance_total(parcours)} km")
    print(f"Il est reste {parcours_restant(parcours)}")

    evolu_moyenne(parcours)

    if tjrs_en_course_ou_pas(parcours):
        print(f"Jusqu'à maintenant sa meilleure performance est de {parcours[meill_performance(parcours)]} km réalisée le jour n°{meill_performance(parcours)}")
    else:
        print(f"Au final sa meilleure performance est de {parcours[meill_performance(parcours)]} km réalisé le jour n°{meill_performance(parcours)}")

# precédure depassement à compléter


def depassement(parcours1, parcours2, nom1, nom2):
    '''A CODER'''
    pass


# Procedure main fournie -- NE PAS MODIFIER !!
def main():
    recap(KIRK, "Kirk")
    print("--------------------------------------------")
    recap(PICARD, "Picard")
    print("--------------------------------------------")
    recap(SULU, "Sulu")
    print("--------------------------------------------")

    print("--------------------------------------------")

    depassement(PICARD, KIRK, "Picard", "Kirk")
    print("--------------------------------------------")
    depassement(SULU, PICARD, "Sulu", "Picard")


# Appel de main -- NE PAS MODIFIER !!
if __name__ == '__main__':
    main()

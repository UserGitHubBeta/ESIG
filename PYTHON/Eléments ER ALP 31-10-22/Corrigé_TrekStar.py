# ER ALP 31-10-2022
# NOM ET PRENOM ici !
###################

from math import ceil

# constantes ici si vous en ajoutez
SANS_ABANDON = 6
AVEC_ABANDON = 5

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


def distance_total(liste):
    total = 0
    for i in range(len(liste)):
        total += liste[i]
    return total


def en_course(liste):
    for i in range(len(liste)):
        if distance_total(liste) >= DIST_TOT_TREK or liste[-1] == 0:
            return False
    return True


def moyenne(liste):
    if liste[-1] == 0:
        return arrondi_dixieme(distance_total(liste) / (len(liste) - 1))
    else:
        return arrondi_dixieme(distance_total(liste) / len(liste))


def distance_restante(distance):
    return DIST_TOT_TREK - distance


def mi_parcours(liste):
    distance = 0
    for i in range(len(liste)):
        distance += liste[i]
        if distance >= 100:
            return i+1


def meilleur_perf(liste):
    distance = 0
    jour = 0
    for i in range(len(liste)):
        if liste[i] > distance:
            distance = liste[i]
            jour = i
    return jour


def evolution_moyenne(liste):
    distance = 0
    jour = 0
    print("Voici l'évolution de sa moyenne au jour le jour (km/jour) :")
    for i in range(len(liste)):
        distance += liste[i]
        jour += 1
        if liste[i] != 0:
            print(f"au jour {i} : {arrondi_dixieme(distance / jour)}")

def nmb_jours_restants(liste):
    return arrondi_superieur(distance_restante(distance_total(liste)) / moyenne(liste))

# procédure recap à compléter


def recap(parcours, nom):
    print("Parcours de", nom)

    if distance_total(parcours) == DIST_TOT_TREK:
        print(f"{nom} a atteint l'objectif en {len(parcours)} jours")
        print(
            f"{nom} a réalisé la moitié de la distance en {mi_parcours(parcours)} jours")
    elif en_course(parcours) == True:
        print(nom, "est toujours en course après 185 km")
        print(f"Il reste {distance_restante(distance_total(parcours))} qui devraient être parcourus en {nmb_jours_restants(parcours)} jour(s) s'il maintient sa moyenne qui est de {moyenne(parcours)} km par jour")
    else:
        print(
            f"{nom} a abandonné au bout de {distance_total(parcours)} km et {len(parcours) - 1} jours")

    if en_course(parcours) == False:
        print(
            f"Ce qui représente une moyenne globale de {moyenne(parcours)} km par jour")

    evolution_moyenne(parcours)

    if en_course(parcours) == True:
        print(
            f"Jusqu'à maintenant sa meilleure performance est de {parcours[meilleur_perf(parcours)]} km réalisée le jour n°{meilleur_perf(parcours)}")
    else:
        print(
            f"Au final sa meilleure performance est de {parcours[meilleur_perf(parcours)]} km réalisé le jour n°{meilleur_perf(parcours)}")
# precédure depassement à compléter


def depassement(parcours1, parcours2, nom1, nom2):
    print(f"Comparaison entre {nom1} et {nom2}")

    if len(parcours1) >= SANS_ABANDON and parcours1[-1] != 0 and len(parcours2) >= SANS_ABANDON and parcours2[-1] != 0:
        repetition_boucle = SANS_ABANDON
    else:
        repetition_boucle = AVEC_ABANDON

    distance1 = 0
    distance2 = 0
    depassement = False
    for i in range(repetition_boucle):
        distance1 += parcours1[i]
        distance2 += parcours2[i]
        if distance1 > distance2:
            print(f"{nom1} a dépassé pour la première fois {nom2} au jour n°{i}")
            depassement = True
            break

    if depassement == False:
        print(f"{nom1} n'a jamais dépassé {nom2}")


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

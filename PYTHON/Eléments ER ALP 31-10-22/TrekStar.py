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


def distance_totale(ma_liste):
    val_somme = 0
    for i in range(len(ma_liste)):
        val_somme += ma_liste[i]
    return val_somme


def en_course(ma_liste):
    for i in range(len(ma_liste)):
        if distance_totale(ma_liste) >= DIST_TOT_TREK or ma_liste[-1] == 0:
            return False
    return True


def moyenne(ma_liste):
    if ma_liste[-1] == 0:
        return distance_totale(ma_liste) / len(ma_liste) - 1
    else:
        return distance_totale(ma_liste) / len(ma_liste)


def distance_restante(ma_liste):
    return DIST_TOT_TREK - distance_totale(ma_liste)

def mi_parcours(ma_liste):
    jour = 0
    distance = 0
    for i in range(len(ma_liste)):
        distance += ma_liste[i]
        if distance >= 100:
            jour += 1
        return jour

def meilleur_performance(ma_liste):
    jour = 0
    distance = 0
    for i in range(len(ma_liste)):
        if ma_liste[i] > distance:
            distance = ma_liste[i]
            jour = i
    return jour

def evolution_moyenne(ma_liste):
    jour = 0
    distance = 0
    
    print("Voici l'évolution de sa moyenne au jour le jour (km/jour) : ")
    for i in range(len(ma_liste)):
        distance += ma_liste[i]
        jour += i
        somme = distance / jour
        if ma_liste[-1] != 0:
            return print(f"au jour {i} : {arrondi_dixieme(somme)}")
        elif ma_liste[-1] == 0:
            return print("Attention aux abandons !")

def nombre_jours_restants(ma_liste):
    jour = 0
    for i in range(len(ma_liste)):
        


def recap(parcours, nom):
    pass

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

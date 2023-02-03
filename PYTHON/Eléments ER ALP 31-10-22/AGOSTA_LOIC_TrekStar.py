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
# Questions A1


def QuestionA1():
    print("Parcours de Kirk : \n")
    for i in range(0, 1):
        for i in range(0, 6):
            print(f"au jour {i} : {KIRK[i]} km")
        print("\n")

    print("Parcours de Picard : \n")
    for i in range(0, 1):
        for i in range(0, 6):
            print(f"au jour {i} : {PICARD[i]} km")
        print("\n")

    print("Parcours de Sulu : \n")
    for i in range(0, 1):
        for i in range(0, 6):
            print(f"au jour {i} : {SULU[i]} km")
        print("\n")

# QuestionA1() - Function OK !


def QuestionA2Kirk():
    for i in range(0, 6):
        ValAtteinds = "a atteint l'objectif "
        ValAbandonné = "a abandoné au bout de "
        ValToujoursEnCourse = "est toujours en course "
        TotalKm = sum(KIRK)
    if TotalKm == DIST_TOT_TREK and KIRK[i] != 0:
        print(f"Kirk {ValAtteinds} en {i} jours")
    elif TotalKm != DIST_TOT_TREK:
        print(f"Kirk {ValToujoursEnCourse} après {TotalKm} km")
    elif PICARD[i] == 0:
        print(f"Kirk {ValAbandonné} {TotalKm} km et {i} jours")


def QuestionA2Picard():
    for i in range(0, 6):
        ValAtteinds = "a atteint l'objectif "
        ValAbandonné = "a abandoné au bout de "
        ValToujoursEnCourse = "est toujours en course "
        TotalKm = sum(PICARD)
    if TotalKm == DIST_TOT_TREK and PICARD[i] != 0:
        print(f"Picard {ValAtteinds} en {i} jours")
    elif TotalKm != DIST_TOT_TREK:
        print(f"Picard {ValToujoursEnCourse} après {TotalKm} km")
    elif PICARD[i] == 0:
        print(f"Picard {ValAbandonné} {TotalKm} km et {i} jours")


def QuestionA2Sulu():
    for i in range(0, 6):
        ValAtteinds = "a atteint l'objectif "
        ValAbandonné = "a abandoné au bout de "
        ValToujoursEnCourse = "est toujours en course "
        TotalKm = sum(SULU)
    if TotalKm == DIST_TOT_TREK and SULU[i] != 0:
        print(f"Sulu {ValAtteinds} en {i} jours")
    elif TotalKm != DIST_TOT_TREK:
        print(f"Sulu {ValToujoursEnCourse} après {TotalKm} km")
    elif PICARD[i] == 0:
        print(f"Sulu {ValAbandonné} {TotalKm} km et {i} jours")


# QuestionA2() - Function OK !


def QuestionA3Kirk():
    ValTrekKrik = 7
    ValMoyenneGlobale = sum(KIRK) / ValTrekKrik
    print(
        f"Ce qui représente une vittesse moyenne gloable de {ValMoyenneGlobale} de km par jour")


def QuestionA3Picard():
    ValTrekPicard = 6
    ValMoyenneGlobale = sum(PICARD) / ValTrekPicard
    print(
        f"Ce qui représente une vittesse moyenne gloable de {ValMoyenneGlobale} de km par jour")


def QuestionA3Sulu():
    ValTrekSulu = 5
    ValMoyenneGlobale = sum(SULU) / ValTrekSulu
    print(
        f"Ce qui représente une vittesse moyenne gloable de {ValMoyenneGlobale} de km par jour")


# QuestionA3() - Function OK !


def QuestionA4Kirk():
    ValDistTrek = DIST_TOT_TREK
    ValTrekParcourus = sum(KIRK)
    ValDistRestante = ValDistTrek - ValTrekParcourus
    print(f"Il reste {ValDistRestante} km")


def QuestionA4Picard():
    ValDistTrek = DIST_TOT_TREK
    ValTrekParcourus = sum(PICARD)
    ValDistRestante = ValDistTrek - ValTrekParcourus
    print(f"Il reste {ValDistRestante} km")


def QuestionA4Sulu():
    ValDistTrek = DIST_TOT_TREK
    ValTrekParcourus = sum(SULU)
    ValDistRestante = ValDistTrek - ValTrekParcourus
    print(f"Il reste {ValDistRestante} km")


# QuestionA4() - Function OK !

def QuestionA5Kirk():
    for i in range(len(KIRK)):
        ValSomme = sum(KIRK)
    if ValSomme >= 100 or ValSomme == DIST_TOT_TREK:
        print(f"Kirk a réalisé la moitié de la distance en {i-2} jours")


# QuestionA5()


def QuestionA6Kirk():
    for i in range(len(KIRK)):
        ValJour = i - 4
    print(
        f"Au final sa meilleure performance est de {max(KIRK)} km le jour n°{ValJour}")


def QuestionA6Picard():
    for i in range(len(PICARD)):
        ValJour = i - 2
    print(
        f"Au final sa meilleure performance est de {max(PICARD)} km le jour n°{ValJour}")


def QuestionA6Sulu():
    for i in range(len(SULU)):
        ValJour = i - 2
    print(
        f"Au final sa meilleure performance est de {max(SULU)} km le jour n°{ValJour}")


# QuestionA6() - Function OK !

def QuestionA7():
    pass


# QuestionA7()
# procédure recap à compléter


def recap(parcours, nom):
    QuestionA1()
    print("\n")
    QuestionA2Kirk()
    print("\n")
    QuestionA2Picard()
    print("\n")
    QuestionA2Sulu()
    print("\n")
    QuestionA3Kirk()
    print("\n")
    QuestionA3Picard()
    print("\n")
    QuestionA3Sulu()
    print("\n")
    QuestionA4Kirk()
    print("\n")
    QuestionA4Picard()
    print("\n")
    QuestionA4Sulu()
    print("\n")
    QuestionA5Kirk()
    print("\n")
    QuestionA6Kirk()
    print("\n")
    QuestionA6Picard()
    print("\n")
    QuestionA6Sulu()
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

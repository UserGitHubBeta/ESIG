MINUSCULES = "abcdeghijklmnopqrstuvwxyAz"
MAJUSCULES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
NUM = "0123456789"


def afficher_carac(liste):
    nb_fois_majusucles = 0
    nb_fois_minuscles = 0
    nb_fois_num = 0
    nb_fois_symb = 0

    liste = "P@#yn26at^&i5ve"

    for i in range(len(liste)):
        if liste[i].islower():
            nb_fois_minuscles += 1
        elif liste[i].isupper():
            nb_fois_majusucles += 1
        elif liste[i].isnumeric():
            nb_fois_num += 1
        else:
            nb_fois_symb += 1

    print(
        f"Nb min {nb_fois_minuscles} / Nb maj {nb_fois_majusucles} / Nb num {nb_fois_num} / Nb symb {nb_fois_symb}")


afficher_carac("P@#yn26at^&i5ve")


def calcul_min(liste_min):
    liste_min = MINUSCULES
    nb_fois_min = 0

    for i in range(len(liste_min)):
        if liste_min[i].islower():
            nb_fois_min += 1
        else:
            print(f"Un élément en Majuscule a été détecté !")
            break

    print(f"Sum min = {nb_fois_min}")


calcul_min(MINUSCULES)

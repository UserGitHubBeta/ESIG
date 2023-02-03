# Clément Vogt


# Constantes
NB_JOUEUSES_MIN = 8
NB_JOUEUSES_POUR_TRIADE = 3


# Procédures et fonctions
def donnees_valides(nb_joueuses):
    if nb_joueuses % 2 == 0 and nb_joueuses >= NB_JOUEUSES_MIN:
        return True
    print("invalide")
    return False


# Procédure main()
def main():
    nb_joueuses = int(input("Entrez un nombre de joueuses"))
    if donnees_valides(nb_joueuses):
        print("Evolution")
        while (nb_joueuses >= 1 and nb_joueuses != NB_JOUEUSES_POUR_TRIADE):
            print(nb_joueuses)
            nb_joueuses //= 2
        if nb_joueuses == NB_JOUEUSES_POUR_TRIADE:
            print(nb_joueuses)
            print("Triade !")


# Appel de la procédure main()
if __name__ == '__main__':
    main()
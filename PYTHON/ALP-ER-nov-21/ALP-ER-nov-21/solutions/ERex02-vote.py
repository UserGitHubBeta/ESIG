# Clément Vogt


# Constantes
VALEUR_POUR_CONTINUER = 50
VALEUR_POUR_ARRETER = 0


# Procédures et fonctions
def jeu_continue(motivations):
    nb_oui = 0
    nb_non = 0
    for element in motivations:
        if element > VALEUR_POUR_CONTINUER:
            nb_oui+= 1
        elif element > VALEUR_POUR_ARRETER:
            nb_non+= 1
    
    nb_total = nb_oui+nb_non
    if nb_oui >= nb_non and nb_total > 0:
        print("Le jeu continue :",nb_oui,"oui sur",nb_total,"votes")
        return True;
    else:
        print("Le jeu se termine :",nb_oui,"oui sur",nb_total,"votes")
        return False;


def input_cas():
    return int(input('Saisir numéro de cas de test: '))


# Procédure main()
def main():
    no_cas = input_cas()
    if no_cas == 1:
        liste_motivations = [-1, -1, -1]
    elif no_cas == 2:
        liste_motivations = [98, 10, 99, 83, 50, 37, 70, 8, 10, 19,
                             61, 100, 32, 46, 50, 10, 24, 98, 71, 59,
                             28, 32, 81, 67, 2, 44, 35, 67, 50]
    elif no_cas == 3:
        liste_motivations = [98, 10, 99, 83, 50, -1, 70, 8, 10, 19,
                             61, 100, 32, 46, 50, 10, -1, 98, 71, 59,
                             28, -1, 81, 67, -1, 44, 35, 67, 51, 50]
    else:
        print('numéro de cas inconnu')
        return
    print('Jeu continue? =>', jeu_continue(liste_motivations))


# Appel de la procédure main()
if __name__ == '__main__':
    main()
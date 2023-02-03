# Clément Vogt


# Imports
from turtle import *


# Constantes
SURFACE_MIN = 100
NB_COULEURS = 3
FACTEUR_AGRANDISSEMENT = 1.5


# Procédures et fonctions
def aller_a_position_initiale():
    penup()
    goto(-200, 200)
    pendown()


def input_limite():
    return int(input('Saisir la surface à ne pas dépasser: '))


def input_couleurs():
    return input('Saisir une liste de 3 couleurs séparées par un espace (p.ex. green red blue): ').split()


def donnees_valides(surface_limite,couleurs):
    est_valide = True 
    if surface_limite < SURFACE_MIN:
        print("La limite saisie [",surface_limite,"] est trop petite. Elle doit être au moins:",SURFACE_MIN)
        est_valide = False
    if len(couleurs) != NB_COULEURS:
        print("Il faut saisir exactement trois couleurs.")
        est_valide = False
    return est_valide
    
    
def dessiner_carre(longueur_cote,couleur):
    color(couleur)
    for _ in range (0,4):
        forward(longueur_cote)
        right(90)


# Procédure main()
def main():
    surface_limite = input_limite()
    couleurs = input_couleurs() 
    if donnees_valides(surface_limite,couleurs):
        aller_a_position_initiale()
        longueur_cote = 10
        cpt = 0
        while (longueur_cote * longueur_cote <= surface_limite):
            couleur = couleurs[cpt%len(couleurs)]
            dessiner_carre(longueur_cote,couleur)
            longueur_cote *= FACTEUR_AGRANDISSEMENT
            cpt += 1


# Appel de la procédure main()
if __name__ == '__main__':
    main()
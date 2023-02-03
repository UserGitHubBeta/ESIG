NOMS = [
    'Londa', 'Lenita', 'Beatrice', 'Kendrick', 'Genny', 'Rolf',
    'Meridith', 'Hilton', 'Phylis', 'Candis', 'Ron', 'Lecia', 'Jacquelyn', 'Gonzalo',
    'Herlinda', 'Morgan', 'Han', 'Sanjuanita', 'Allie', 'Fernande', 'Anna', 'Gracia',
    'Lula', 'Merlyn', 'Tandy', 'Adah', 'Ozella', 'Laureen', 'Ricky', 'Miki']
NB_PLONGEES = [
    20, 120, 15, 150, 5, 20, 30, 60, 100, 8, 20, 15, 30,
    79, 130, 66, 24, 110, 8, 23, 20, 77, 60, 22, 30, 80, 50, 20, 10, 29
]


def main():
    nom = input("Entrer un nom : ")
    check_nom_plongee(nom)
    meilleur_plongee()


# Afficher la valeur d'un nom d'un dictionnaire
def check_nom_plongee(nom):
    for i in range(len(NOMS)):
        if nom == NOMS[i]:
            return print(NB_PLONGEES[i])
        else:
            return print("Non valide !")

# Afficher un élément max avec une position


def meilleur_plongee():
    val_position = 0
    val_num = NB_PLONGEES[0]
    for i in range(len(NOMS)):
        if NB_PLONGEES[i] > val_num:
            val_num = NB_PLONGEES[i]
            val_position = i
    print("Dictionnaire crée :")
    RESULTAT = {'Nom': f'{NOMS[val_position]}', 'Nombre Plongée': val_num}
    print(RESULTAT)


main()

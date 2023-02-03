dico_alpha = {
    'A': 0,
    'B': 0,
    'C': 0,
    'D': 0,
    'E': 0,
    'F': 0,
    'G': 0,
    'H': 0,
    'I': 0,
    'J': 0,
    'K': 0,
    'L': 0,
    'M': 0,
    'N': 0,
    'J': 0,
    'K': 0,
    'L': 0,
    'M': 0,
    'N': 0,
    'O': 0,
    'P': 0,
    'Q': 0,
    'R': 0,
    'S': 0,
    'T': 0,
    'U': 0,
    'V': 0,
    'W': 0,
    'X': 0,
    'Y': 0,
    'Z': 0}


def afficher_alphamaj(chaine):

    # Méthode normale
    for lettre in chaine:
        if lettre.isupper():
            dico_alpha[lettre] += 1
    print(dico_alpha)

    # Méthode avec .items()
    for key, value in dico_alpha.items():
        val_maj = 0
        val_min = 0
        for i in chaine:
            if i.isupper() and i == key:
                val_maj += 1
                value = val_maj
        print(key, "*" * value, "(", value, ")")

    # Méthode avec .keys()
    for i in chaine:  # Pour chaque i = variable alpha dans chaine
        if i in dico_alpha.keys():
            dico_alpha[i] += 1  # -> dico_alpha[key] ; 'A' = 0+1
    for key in dico_alpha:  # Pour chaque key = A,B,C dans dico_alpha
        print(key, "*" * dico_alpha[key], "(", dico_alpha[key], ")")
        # key = Lettre ; dico_alpha[key] = * ; dico_alpha[key] = 0


def main():
    chaine = input("Entrer une chaine de caractère : ")
    afficher_alphamaj(chaine)


main()

def compte_et_affiche_types_de_car(s):
    compte_minuscules = 0
    compte_majuscules = 0
    compte_chiffres = 0
    compte_autres_symboles = 0
    for car in s:
        if car.islower():
            compte_minuscules += 1
        elif car.isupper():
            compte_majuscules += 1
        elif car.isdigit():
            compte_chiffres += 1
        else:
            compte_autres_symboles += 1
    print("Il y a {} minuscules".format(compte_minuscules))
    print("Il y a {} majuscules".format(compte_majuscules))
    print("Il y a {} chiffres".format(compte_chiffres))
    print("Il y a {} autres symboles".format(compte_autres_symboles))


compte_et_affiche_types_de_car("P@#yn26at^&i5ve")

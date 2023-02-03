def premiers(mon_mot):
    if mon_mot.isalpha() == False:
        print("Entrer des caractères !")
    elif len(mon_mot) < 3:
        print("Erreur de longeur pour les premiers !")
    else:
        print(f"Les 3 premiers caractères = {mon_mot[:3]}")
    # print(f"Les 3 premiers caractères = {mon_mot[0:3]}")


def derniers(mon_mot):
    if mon_mot.isalpha() == False:
        print("Entrer des caractères !")
    elif len(mon_mot) < 3:
        print("Erreur de longeur pour les derniers !")
    else:
        print(f"Les 3 derniers caractères = {mon_mot[-3:]}")


def main():
    mon_mot = input("Entrer un mot : ")
    premiers(mon_mot)
    derniers(mon_mot)


main()

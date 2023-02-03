def premiers(mon_mot, taille_mot):
    print(f"Les 3 premiers caractères = {mon_mot[:taille_mot]}")
# print(f"Les 3 premiers caractères = {mon_mot[0:3]}")


def derniers(mon_mot, taille_mot):
    print(f"Les 3 derniers caractères = {mon_mot[-taille_mot:]}")


def main():
    mon_mot = input("Entrer un mot : ")
    taille_mot = int(input("Entrer la taille : "))
    premiers(mon_mot, taille_mot)
    derniers(mon_mot, taille_mot)


main()

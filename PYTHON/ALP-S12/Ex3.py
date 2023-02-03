def mon_mot_check():
    mon_mot = input("Prends ton mot : ")
    if mon_mot[::-1] == mon_mot:
        print(f"{mon_mot} est reversable")
    else:
        print(f"{mon_mot} n'est pas reversable")


mon_mot_check()

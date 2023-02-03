ESPACEMENT = " "


def monescalier(monespacetype, monmot):
    if monespacetype == 0:
        for i in range(len(monmot)):
            print(f"{ESPACEMENT*i}{monmot[i]}")
    elif monespacetype == 1:
        for i in range(len(monmot)):
            print(f"{ESPACEMENT*(len(monmot)-i)}{monmot[i]}")
    else:
        print("Erreur type !")


def main():
    monespace = int(input("Entrer le type : "))
    monmot = input("Entrer le mot : ")

    monescalier(monespace, monmot)


main()

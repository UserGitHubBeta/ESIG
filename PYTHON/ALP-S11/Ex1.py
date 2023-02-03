LISTE = "abracadabra"
malettre = "z"

nb_fois = 0

for i in range(len(LISTE)):
    if LISTE[i] == malettre:
        nb_fois += 1
        print(f"Carac {malettre} est {nb_fois} fois")
        break
    else:
        print(f"Carac {malettre} est introuvable !")
        break

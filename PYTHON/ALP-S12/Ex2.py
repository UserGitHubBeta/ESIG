def ajoute_au_milieu(val1, val2):
    if len(val1) % 2 == 0:
        print(val1[0:len(val1)//2] + val2 + val1[len(val1)//2:len(val1)])
    else:
        print(val1[0:len(val1)//2 + 1] + val2 +
              val1[len(val1)//2 + 1:len(val1)])


ajoute_au_milieu("python", "COUCOU")
ajoute_au_milieu("sandbox", "COUCOU")

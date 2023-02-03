PRIX = {
    "bananes": 4,
    "pommes": 2,
    "oranges": 1.5,
    "poires": 3}

STOCK = {
    "bananes": 100,
    "pommes": 290,
    "oranges": 50,
    "poires": 120}


def main():
    mon_produit = input("Entre ton fruit : ")
    check_mon_produit(mon_produit)
    return mon_produit


def check_mon_produit(mon_produit):
    if mon_produit in STOCK:
        print("Montant des stocks :")
        for key in PRIX:
            print(key, " : ", f"{PRIX[key] * STOCK[key]}")
    else:
        print("Ce produit n'existe pas")


main()

# Remplacer ceci par votre prénom et nom


# Constantes


# Procédures et fonctions
def input_cas():
    return int(input('Saisir numéro de cas de test: '))


# Procédure main()
def main():
    no_cas = input_cas()
    if no_cas == 1:
        motivations = [51]
        gains = [10]
    elif no_cas == 2:
        motivations = [51, 99]
        gains = [10, 20]
    elif no_cas == 3:
        motivations = [80,30, 51]
        gains = [30,10, 20]
    elif no_cas == 4:
        motivations = [92, 66, 50, -1, 6]
        gains = [70, 40, 60, 55, 30]
    elif no_cas == 5:
        motivations = [66,-1, 60, 11, 95]
        gains = [41, 70, 41, 30, 55]
    else:
        print('numéro de cas inconnu')
        return
    
    ''' A CODER '''


# Appel de la procédure main()
if __name__ == '__main__':
    main()
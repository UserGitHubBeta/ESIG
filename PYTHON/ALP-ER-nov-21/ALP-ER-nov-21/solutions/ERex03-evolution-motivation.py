# Clément Vogt


# Constantes
SEUL_MOTIVATION = 50
MOTIVATION_MAX = 100


# Procédures et fonctions
def input_cas():
    return int(input('Saisir numéro de cas de test: '))


def gain_min_motivees(motivations,gains):   
    minimum = gains[0]
    for i in range(1,len(motivations)):
        if motivations[i] > SEUL_MOTIVATION and gains[i] < minimum:
            minimum = gains[i]        
    return minimum


def mettre_a_jour_motivations(gain_min,motivations,gains):
    for i in range(0,len(motivations)):
        if motivations[i] != -1:
            if gains[i] > gain_min:
                motivations[i] += 10
                if motivations[i] > MOTIVATION_MAX:
                    motivations[i] = MOTIVATION_MAX
            elif gains[i] < gain_min:
                motivations[i] -= 10
                if motivations[i] <= 0:
                    motivations[i] = -1 
    print("motivations",motivations)


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
    gain_min = gain_min_motivees(motivations,gains)
    print("gain_min_motivees",gain_min)
    mettre_a_jour_motivations(gain_min,motivations,gains)


# Appel de la procédure main()
if __name__ == '__main__':
    main()
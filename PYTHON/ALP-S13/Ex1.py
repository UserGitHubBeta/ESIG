dict = {'nom': 'Dupuis', 'prenom': 'Jacque', 'age': 30}

# corriger le nom du dictionnaire
dict['prenom'] = 'Jacques'

# # Afficher uniquement les clés
for key in dict:
    print(key)
print("==============================")

# # Afficher uniquement les valeurs
for key in dict:
    print(dict[key])
print("==============================")

# Afficher une phrase avec les valeurs du dictionnaire
print('{prenom} {nom} a {age} ans'.format(**dict))
print("==============================")

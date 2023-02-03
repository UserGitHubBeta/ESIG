d = {'nom': 'Dupuis', 'prenom': 'Jacque', 'age': 30}

# Corriger la valeur d'une clé dans un dictionnaire
d['prenom'] = 'Jacques'
print(d)

print("\n ----------------------------  \n")

# Afficher les clés uniquement dans un dictionnaire
for key in d:
    print(key)

print("\n ----------------------------  \n")

# Afficher les valeurs uniquements par des clés données
for key in d:
    print(d[key])

print("\n ----------------------------  \n")

# Afficher la liste des paires du dictionnaire 
for key in d:
    print(f"{key} : {d[key]}")

print("\n ----------------------------  \n")

# Afficher une phrase comprenant les valeures appartenant a des clées d'un dictionnaire
print('{prenom} {nom} a {age} ans'.format(**d))
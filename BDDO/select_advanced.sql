-- Ex 3.1
-- Afficher l'ID, le nom de la compagnie, la limite de cr�dit mensuelle (la limite actuelle est annuelle)
-- des Clients ayant une limite de cr�dit entre 100'000 et 500'000.
-- Afficher cette limite mensuelle avec deux d�cimales et arrondie � 5 centimes pr�s)
-- NB toujours afficher deux d�cimales !
-- Trier par dans l'ordre d�croissant de la limite de cr�dit.

SELECT CLI_ID, CLI_COMPAGNIE, TO_CHAR(ROUND(ROUND((CLI_LIMITE_CREDIT / 12) / 0.05) * 0.05, 2), '9,999,999.99') AS "CREDIT LIMITE MOIS" 
FROM ESIG_COLLECTION.CP_CLIENT
WHERE CLI_LIMITE_CREDIT BETWEEN 100000 AND 500000
ORDER BY CLI_LIMITE_CREDIT DESC;

-- Ex 3.2
-- Afficher les produits (le code, le nom) et les informations suivantes :
--    Le nombre de caract�res du nom du produit,
--    Les 10 premiers caract�res de la description
--    L'�chelle suivie de '*', jusqu'au maximum 15 caract�res
--    Calculer la valeur du stock par rapport au prix catalogue, et l'afficher en milliers de francs.

SELECT PRO_CODE, PRO_NOM, LENGTH(PRO_NOM) AS "CARAC PROD", SUBSTR(PRO_DESCRIPTION, 1, 10) AS "CARAC DESCRIPTION", rpad(pro_echelle, 15,'*')  FROM ESIG_COLLECTION.CP_PRODUIT;
-- Ex 3.3
-- Afficher les employ�s (ID, Nom, Pr�nom, Fonction et n� du chef) en les triant par n� de bureau.
-- Afficher le bureau en premier.
-- Pour les employ�s n'ayant pas de chef, afficher 0 dans la colonne n� du chef.
-- Trier le tout par bureau, nom et pr�nom.

-- Ex 3.4
-- Afficher les employ�s et leur bureau, sous la forme suivante :
--    1 --> 'Blue'
--    2 --> 'Red'
--    3 --> 'Yellow'
--    4 --> 'Black'
--    5 --> 'Purple'
--    6 --> 'Green'
--    7 --> 'Magenta'
--    autre --> 'Other'


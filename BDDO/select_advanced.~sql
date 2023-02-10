-- Ex 3.1
-- Afficher l'ID, le nom de la compagnie, la limite de crédit mensuelle (la limite actuelle est annuelle)
-- des Clients ayant une limite de crédit entre 100'000 et 500'000.
-- Afficher cette limite mensuelle avec deux décimales et arrondie à 5 centimes près)
-- NB toujours afficher deux décimales !
-- Trier par dans l'ordre décroissant de la limite de crédit.

SELECT CLI_ID, CLI_COMPAGNIE, TO_CHAR(ROUND(ROUND((CLI_LIMITE_CREDIT / 12) / 0.05) * 0.05, 2), '9,999,999.99') AS "CREDIT LIMITE MOIS" 
FROM ESIG_COLLECTION.CP_CLIENT
WHERE CLI_LIMITE_CREDIT BETWEEN 100000 AND 500000
ORDER BY CLI_LIMITE_CREDIT DESC;

-- Ex 3.2
-- Afficher les produits (le code, le nom) et les informations suivantes :
--    Le nombre de caractères du nom du produit,
--    Les 10 premiers caractères de la description
--    L'échelle suivie de '*', jusqu'au maximum 15 caractères
--    Calculer la valeur du stock par rapport au prix catalogue, et l'afficher en milliers de francs.

SELECT PRO_CODE, PRO_NOM, LENGTH(PRO_NOM) AS "CARAC PROD", SUBSTR(PRO_DESCRIPTION, 1, 10) AS "CARAC DESCRIPTION", rpad(pro_echelle, 15,'*')  FROM ESIG_COLLECTION.CP_PRODUIT;
-- Ex 3.3
-- Afficher les employés (ID, Nom, Prénom, Fonction et n° du chef) en les triant par n° de bureau.
-- Afficher le bureau en premier.
-- Pour les employés n'ayant pas de chef, afficher 0 dans la colonne n° du chef.
-- Trier le tout par bureau, nom et prénom.

-- Ex 3.4
-- Afficher les employés et leur bureau, sous la forme suivante :
--    1 --> 'Blue'
--    2 --> 'Red'
--    3 --> 'Yellow'
--    4 --> 'Black'
--    5 --> 'Purple'
--    6 --> 'Green'
--    7 --> 'Magenta'
--    autre --> 'Other'


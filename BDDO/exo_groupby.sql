-- Ex 6.1
-- Afficher le nombre de clients par pays
-- Trier le résultat par pays

SELECT /*count(*), */ CLI_PAYS FROM ESIG_COLLECTION.CP_CLIENT
GROUP BY CLI_PAYS
ORDER BY CLI_PAYS ASC;
/*SELECT * FROM CP_COMMANDE;*/
-- Ex 6.2
-- Compter le nombre de produits différents commandés dans chaque pays en 2020, par ligne de produit.
-- Afficher le pays, le code de la ligne produit, l'année et le nombre de produits.
-- Trier le tout par pays dans l'ordre croissant, puis par nombre de produits dans l'ordre décroissant.

SELECT * FROM ESIG_COLLECTION.CP_PRODUIT
JOIN ESIG_COLLECTION.CP_LIGNECOMMANDE ON ESIG_COLLECTION.CP_LIGNECOMMANDE.LCO_PRO_CODE = ESIG_COLLECTION.CP_PRODUIT.PRO_CODE
JOIN ESIG_COLLECTION.CP_COMMANDE ON ESIG_COLLECTION.CP_LIGNECOMMANDE.LCO_COM_ID = ESIG_COLLECTION.CP_COMMANDE.COM_ID
JOIN ESIG_COLLECTION.CP_CLIENT ON ESIG_COLLECTION.CP_COMMANDE.COM_CLI_ID = ESIG_COLLECTION.CP_CLIENT.CLI_ID
GROUP BY CLI_PAYS, 


-- Ex 6.3
-- Calculer la valeur des ventes, le prix total d'achat et le bénéfice effectif par année de commande.
-- Afficher l'année de la commande, le nombre de commandes, le nombre de lignes de commandes,
-- la somme de la quantité vendue multipliée par le prix de vente,
-- la somme de la quantité vendue multipliée par le prix d'achat,
-- la différence entre les deux (= bénéfice)

-- Ex 5.1
-- Afficher les commandes effectuées par les clients suisses (Switzerland).
-- Montrer le numéro de la commande, sa date, son status, le client qui l'a passée (compagnie, ville, état, pays),
-- l'employé qui s'occupe du client (id, nom, prénom et fonction), ainsi que le bureau de l'employé (code, ville et pays)
-- et la "couleur" du bureau (cf. ex 3.4).

SELECT * FROM ESIG_COLLECTION.CP_CLIENT;
SELECT * FROM ESIG_COLLECTION.CP_COMMANDE;

SELECT CLI_NOM_CONTACT || '  ' || CLI_PRENOM_CONTACT || ' ' || CLI_TEL || '  ' || CLI_ADRESSE_LIGNE1 || '  ' || CLI_VILLE AS "Contact complet - Table Client", 
COM_ID, COM_DATECOMMANDE, COM_STATUS, COM_CLI_ID, CLI_VILLE || '  ' || CLI_CODE_POSTAL || '  ' || CLI_PAYS || '  ' || CLI_ETAT AS "Contact complet",
EMP_PRENOM || '  ' || EMP_NOM || '  ' || EMP_FONCTION || '  ' ||  EMP_BUR_CODE || '  ' || BUR_VILLE || ' ' || BUR_PAYS AS "Employé(e) complet",
COM_STATUS, COM_CLI_ID, CLI_COMPAGNIE
FROM ESIG_COLLECTION.CP_COMMANDE
JOIN ESIG_COLLECTION.CP_CLIENT ON ESIG_COLLECTION.CP_COMMANDE.COM_CLI_ID = ESIG_COLLECTION.CP_CLIENT.CLI_ID
JOIN ESIG_COLLECTION.CP_EMPLOYE ON ESIG_COLLECTION.CP_CLIENT.CLI_EMP_ID_REPRESENTANT = ESIG_COLLECTION.CP_EMPLOYE.EMP_ID
JOIN ESIG_COLLECTION.CP_BUREAU ON ESIG_COLLECTION.CP_EMPLOYE.EMP_BUR_CODE = ESIG_COLLECTION.CP_BUREAU.BUR_CODE
WHERE CLI_PAYS = 'Switzerland'


-- Ex 5.2
-- Afficher tous les produits qui n'ont jamais été commandés (code, nom, ligne de produit).
-- Calculer leur valeur d'achat totale (qté*prixachat), leur valeur d'inventaire (qté*prixcatalogue)
-- ainsi que le bénéfice anticipé (différence entre les deux). Chaque calcul doit être arrondi à 5 ct près.

-- Ex 5.3
-- Afficher les commandes des clients habitant en France, concernant des produits de la ligne de produit "Trains".
-- Il faut montrer le numéro de la commande, sa date, le nom de la compagnie qui a passé la commande, son pays,
-- Le code du produit commandé, son nom, le code de sa ligne de produit, la quantité commandée, le prix de vente,
-- le total hors taxe (qté * prixvente), le total TTC (total précédent auquel on ajoute 7.7%).
-- Trier le tout par ordre décroissant de prix total TTC.

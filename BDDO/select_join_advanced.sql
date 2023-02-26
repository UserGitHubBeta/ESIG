-- Ex 4.1
-- Pour toutes les commandes dont le status est "In Process",
-- afficher le numéro, la date de la commande, le status ainsi que le nom de la compagnie cliente

SELECT COM_ID, COM_DATECOMMANDE, COM_STATUS, CLI_COMPAGNIE 
FROM ESIG_COLLECTION.CP_COMMANDE 
JOIN ESIG_COLLECTION.CP_CLIENT ON ESIG_COLLECTION.CP_COMMANDE.COM_CLI_ID = ESIG_COLLECTION.CP_CLIENT.CLI_ID 
WHERE COM_STATUS = 'In Process' ;


-- Ex 4.2
-- Trouver la liste des produits faisant partie des lignes de produits "Planes" (avions) et "Ships" (navires).
-- Il faut afficher le code du produit et son nom, le code de sa ligne de produit ainsi que la description de celle-ci.

SELECT PRO_CODE, PRO_NOM, PRO_LPR_CODE, LPR_DESCRIPTION 
FROM ESIG_COLLECTION.CP_PRODUIT 
JOIN ESIG_COLLECTION.CP_LIGNEPRODUIT ON ESIG_COLLECTION.CP_PRODUIT.PRO_LPR_CODE = ESIG_COLLECTION.CP_LIGNEPRODUIT.LPR_CODE 
WHERE PRO_LPR_CODE = 'Planes' OR PRO_LPR_CODE = 'Ships';

-- Ex 4.3
-- Afficher l'ID, le nom et le prénom des employés, ainsi que le code du bureau pour lequel ils travaillent, avec sa ville et son pays
-- Trier le tout par pays, par ville et enfin par nom et prénom des employés travaillant dans ces bureaux.

SELECT EMP_ID, EMP_NOM, EMP_PRENOM, EMP_BUR_CODE, BUR_PAYS, BUR_VILLE 
FROM ESIG_COLLECTION.CP_EMPLOYE 
JOIN ESIG_COLLECTION.CP_BUREAU ON ESIG_COLLECTION.CP_EMPLOYE.EMP_BUR_CODE = ESIG_COLLECTION.CP_BUREAU.BUR_CODE 
ORDER BY BUR_PAYS, BUR_VILLE, EMP_PRENOM, EMP_NOM;

-- Ex 4.4
-- À l'aide d'une seule requête, afficher le détail des commandes passées par tous les clients:
--    Afficher le numéro et la date de la commande
--    Afficher le code du produit, le nom du produit, la description du produit ainsi que la quantité commandée
--    Afficher également le nom de la compagnie ayant acheté ainsi que le nom et le prénom du contact du client
-- Trier le résultat par numéro de commande.

SELECT LCO_COM_ID, COM_DATECOMMANDE, PRO_CODE, PRO_NOM, PRO_DESCRIPTION, CLI_COMPAGNIE, CLI_NOM_CONTACT, CLI_PRENOM_CONTACT
FROM ESIG_COLLECTION.CP_LIGNECOMMANDE
JOIN ESIG_COLLECTION.CP_PRODUIT ON ESIG_COLLECTION.CP_LIGNECOMMANDE.LCO_PRO_CODE = ESIG_COLLECTION.CP_PRODUIT.PRO_CODE
JOIN ESIG_COLLECTION.CP_COMMANDE ON ESIG_COLLECTION.CP_LIGNECOMMANDE.LCO_COM_ID = ESIG_COLLECTION.CP_COMMANDE.COM_ID
JOIN ESIG_COLLECTION.CP_CLIENT ON ESIG_COLLECTION.CP_COMMANDE.COM_CLI_ID = ESIG_COLLECTION.CP_CLIENT.CLI_ID

-- Ex 4.5
-- ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
-- Exercice d' AUTO-JOINTURE
-- ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
-- Afficher l'id, le nom et prénom de tous les employés avec l'id, le nom et le prénom de leur chef(fe)
-- Trier par nom et prénom de chef



-- Ex 4.5 bis
-- ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
-- Exercice d' AUTO-JOINTURE externe
-- ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
-- Même chose, mais en vous assurant que la big boss apparaît dans le résultat

-- Ex 5.1
-- Afficher les commandes effectu�es par les clients suisses (Switzerland).
-- Montrer le num�ro de la commande, sa date, son status, le client qui l'a pass�e (compagnie, ville, �tat, pays),
-- l'employ� qui s'occupe du client (id, nom, pr�nom et fonction), ainsi que le bureau de l'employ� (code, ville et pays)
-- et la "couleur" du bureau (cf. ex 3.4).

SELECT * FROM ESIG_COLLECTION.CP_CLIENT;
SELECT * FROM ESIG_COLLECTION.CP_COMMANDE;

SELECT CLI_NOM_CONTACT || '  ' || CLI_PRENOM_CONTACT || ' ' || CLI_TEL || '  ' || CLI_ADRESSE_LIGNE1 || '  ' || CLI_VILLE AS "Contact complet - Table Client", 
COM_ID, COM_DATECOMMANDE, COM_STATUS, COM_CLI_ID, CLI_VILLE || '  ' || CLI_CODE_POSTAL || '  ' || CLI_PAYS || '  ' || CLI_ETAT AS "Contact complet",
EMP_PRENOM || '  ' || EMP_NOM || '  ' || EMP_FONCTION || '  ' ||  EMP_BUR_CODE || '  ' || BUR_VILLE || ' ' || BUR_PAYS AS "Employ�(e) complet",
COM_STATUS, COM_CLI_ID, CLI_COMPAGNIE
FROM ESIG_COLLECTION.CP_COMMANDE
JOIN ESIG_COLLECTION.CP_CLIENT ON ESIG_COLLECTION.CP_COMMANDE.COM_CLI_ID = ESIG_COLLECTION.CP_CLIENT.CLI_ID
JOIN ESIG_COLLECTION.CP_EMPLOYE ON ESIG_COLLECTION.CP_CLIENT.CLI_EMP_ID_REPRESENTANT = ESIG_COLLECTION.CP_EMPLOYE.EMP_ID
JOIN ESIG_COLLECTION.CP_BUREAU ON ESIG_COLLECTION.CP_EMPLOYE.EMP_BUR_CODE = ESIG_COLLECTION.CP_BUREAU.BUR_CODE
WHERE CLI_PAYS = 'Switzerland';


-- Ex 5.2
-- Afficher tous les produits qui n'ont jamais �t� command�s (code, nom, ligne de produit).
-- Calculer leur valeur d'achat totale (qt�*prixachat), leur valeur d'inventaire (qt�*prixcatalogue)
-- ainsi que le b�n�fice anticip� (diff�rence entre les deux). Chaque calcul doit �tre arrondi � 5 ct pr�s.

-- Ex 5.3
-- Afficher les commandes des clients habitant en France, concernant des produits de la ligne de produit "Trains".
-- Il faut montrer le num�ro de la commande, sa date, le nom de la compagnie qui a pass� la commande, son pays,
-- Le code du produit command�, son nom, le code de sa ligne de produit, la quantit� command�e, le prix de vente,
-- le total hors taxe (qt� * prixvente), le total TTC (total pr�c�dent auquel on ajoute 7.7%).
-- Trier le tout par ordre d�croissant de prix total TTC.

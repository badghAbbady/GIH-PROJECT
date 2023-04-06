# pds
Monsieur il faut télécharger les images qui se trouve dans gih-frontend/src/main/java/ma/uiass/eia/pds/frontend
puis modifier leur path dans la classe gih-frontend/src/main/java/ma/uiass/eia/pds/frontend/Test/formChefService/TableActionCellRender.java avec le path ou vous avez télécharger les images.
pour Badr il a travaillé sur consulter lits. Il faut accéder à consulter lit et puis séléctionner une chambre pour accéder aux différents lits de cette chambre.
l'état disponible est représenté par un lit vert, et occupé par unt lit rouge.
il a travaillé aussi sur la liason de l'état avec le séjour tel que l'etat se met à jour dés que un lit devient occupé;
le fichier de la base de donnée est celui "pds Base Donnée Badr et Jihad.rar" vous pouvez l'importer.

pour jihad:"affecter lit"
Dans cette interface nous allons pouvoir affecter un lit à une chambre et visualiser les lits qui concerne chaque chambre ;
Dans un premier lieu on peut choisir une chambre dans le <combobox> approprié “Chambres   , et quand on clique sur le <button >« Ok » les lits de cette chambre sont affichés et par conséquent les codes de ces lits sont enregistrer dans un combobox dit “num lit .
Pour l’affectation des lits , on va choisir un lit du<combobox ‘num lit> et ainsi choisir une chambre où nous devons affecter le lit et on clique sur le <button affecter> lit et par suite le lit s’affiche dans le tableau de cette chambre en cliquant sur « Ok » une autre fois


pour le bon fonctionnement il faut d'abord créer une base de données vide et lui donner un nom puit vous pouvez remplir la base de données en important le script qu'on a envoyé sans oublier que ce nom ainsi le mot de passe de la base de données et le username doivent etre changées dans le fichier hibernate.cfg.xml et persistence.xml ,ces fichiers se trouvent dans le package ressources.





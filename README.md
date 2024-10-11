# sorting-algorithms
bubble sort, insertion sort, selection sort - dichotomic search, sequential search

(FR) Exercice:
Vous êtes un enseignant dans un collège et vous devez organiser les notes des étudiants en fonction de
leurs performances aux examens. Pour ce faire, vous utiliserez des algorithmes de tri pour ordonner les 
notes de manière à ce que les étudiants ayant obtenu les meilleures notes soient placés en premier :
1. Créez une classe abstraite Tableau qui contient deux tableaux : tab pour stocker les informations 
des étudiants non triées et tabTrie pour stocker les informations triées. Chaque élément du tableau 
doit représenter un étudiant et contenir un nom, un prénom et un score d'examen.
Ajoutez deux méthodes dans la classe Tableau :
- afficher pour afficher les informations non triées des étudiants (tab).
- afficherTrie pour afficher les informations triées (tabTrie).
NB : (N'oubliez pas de créer un constructeur pour initialiser les tableaux tab et tabTrie)
2. Déclarez trois méthodes abstraites dans la classe Tableau : triBulle, triInsertion, et 
triSelection. Ces méthodes représentent les différents algorithmes de tri que vous utiliserez pour 
trier les informations des étudiants en fonction de leur score d'examen.
3. Créez une nouvelle classe Tableau-Itératif qui hérite de la classe abstraite Tableau. Dans 
cette classe, implémentez les méthodes triBulle, triInsertion, et triSelection en 
utilisant des algorithmes itératifs.
Effectuer une Recherche-séquentielle puis une Recherche-dichotomique pour trouver un étudiant en 
fonction d'un score d'examen fourni (utiliser le tableau trié par la méthode la plus rapide).
6. Affichez les étudiants (nom et prénom) qui ont obtenu un score d'examen supérieur à 15

7. Créez une nouvelle classe TableauRécursif qui hérite de la classe abstraite Tableau. Dans 
cette classe, implémentez les méthodes triBulle, triInsertion, et triSelection en 
utilisant des algorithmes Récursifs.
8. Dans une nouvelle classe de test, créez la méthode main et instanciez la classe 
TableauRécursif et mesurez le temps d’exécution (en ms), pour chaque méthode de tri et 
pour différentes valeurs de N (de 101 à 106
). Enregistrez les résultats dans un tableau Excel. 
Analysez ensuite les résultats

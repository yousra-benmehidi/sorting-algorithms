package packpack;

public abstract class tableau {
public etudiant[] tab, tabTrie;
public tableau(etudiant[] tab)
{
	this.tab = tab;
}
public abstract void afficher();
public abstract void afficherTrie();
public abstract void triBulle();
public abstract void triInsertion();
public abstract void triSelection();
}

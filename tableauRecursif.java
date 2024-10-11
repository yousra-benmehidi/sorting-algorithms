package packpack;

public class tableauRecursif {
	etudiant[] tab,tabTrie;
	public tableauRecursif(etudiant[] tab) {
		this.tab=tab;
		tabTrie = tab;
	}
	public void afficher() {
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i].nom+" "+tab[i].prenom+" "+tab[i].score);
		}
	}
	public void afficherTrie() {
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i].nom+" "+tab[i].prenom+" "+tab[i].score);
		}
	}
	//tri bulle
	public void triBulleR(int f) {
		if(f>0) {
			for(int i=0;i<f-1;i++) {
				if(tabTrie[i].score<tabTrie[i+1].score) {
					etudiant p = tabTrie[i];
					tabTrie[i]=tabTrie[i+1];
					tabTrie[i+1]=p;
				}
			}
			triBulleR(f-1);
		}
	}
	//trie par insertion
	public void triInsertionR(int pos) {
		if(pos<tabTrie.length) {
			etudiant min=tabTrie[pos];
			int imin=pos;
			int iact=pos-1;
			while(iact>-1) {
				for(int i=0;i<=iact;i++) {
					if(tabTrie[iact].score<min.score) {
						//permutation
						min=tabTrie[iact];
						imin=iact;
					}
					tabTrie[imin]=tabTrie[pos];
					tabTrie[pos]=min;
				}
				iact--;
			}
			triInsertionR(pos+1);
		}
		
	}
	//trie selection
	public void triSelectionR(int ideb) {
		if(ideb<tabTrie.length-1) {
			//chercher le max
			etudiant max=tabTrie[ideb];
			int imax=ideb;
			for(int i=ideb+1;i<tabTrie.length;i++) {
				if(tabTrie[i].score>max.score) {
					max=tabTrie[i];
					imax=i;
				}
			}
			//permutation
			tabTrie[imax]=tabTrie[ideb];
			tabTrie[ideb]=max;
			//appel rec
			triSelectionR(ideb+1);
		}
	}
}

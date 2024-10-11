package packpack;

public class tableauRec extends tableau {
	public tableauRec(etudiant[] tab) {
		super(tab);
		tabTrie = tab;
	}

	@Override
	public void afficher() {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i].nom + " " + tab[i].prenom + " " + tab[i].score);
		}
	}

	@Override
	public void afficherTrie() {
		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i].nom + " " + tab[i].prenom + " " + tab[i].score);
		}
	}

	// tri bulle
	@Override
	public void triBulle() {
		triBulleR(tabTrie.length);
	}

	public void triBulleR(int f) {
		if (f > 0) {
			for (int i = 0; i < f - 1; i++) {
				if (tabTrie[i].score < tabTrie[i + 1].score) {
					etudiant p = tabTrie[i];
					tabTrie[i] = tabTrie[i + 1];
					tabTrie[i + 1] = p;
				}
			}
			triBulleR(f - 1);
		}
	}

	@Override
	public void triInsertion() {
		triInsertionR(1);
	}

	public void triInsertionR(int pos) {
//		if(pos<tabTrie.length) {
//			etudiant min=tabTrie[pos];
//			int imin=pos;
//			int iact=pos-1;
//			while(iact>-1) {
//				for(int i=0;i<=iact;i++) {
//					if(tabTrie[iact].score<min.score) {
//						//permutation
//						min=tabTrie[iact];
//						imin=iact;
//					}
//					tabTrie[imin]=tabTrie[pos];
//					tabTrie[pos]=min;
//				}
//				iact--;
//			}
//			triInsertionR(pos+1);
//		}
		if (pos < tabTrie.length) {
			etudiant min = tabTrie[pos];
			int imin = pos;
			for (int i = 0; i <= pos - 1; i++) {
				if (tabTrie[i].score < min.score) {
					// permutation
					min = tabTrie[i];
					imin = i;
				}
			}
			tabTrie[imin] = tabTrie[pos];
			tabTrie[pos] = min;

			triInsertionR(pos + 1);
		}
	}

	// tri selec
	@Override
	public void triSelection() {
		triSelectionR(0);
	}

	public void triSelectionR(int ideb) {
		if (ideb < tabTrie.length - 1) {
			// chercher le max
			etudiant max = tabTrie[ideb];
			int imax = ideb;
			for (int i = ideb + 1; i < tabTrie.length; i++) {
				if (tabTrie[i].score > max.score) {
					max = tabTrie[i];
					imax = i;
				}
			}
			// permutation
			tabTrie[imax] = tabTrie[ideb];
			tabTrie[ideb] = max;
			// appel rec
			triSelectionR(ideb + 1);
		}
	}
}

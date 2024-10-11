package packpack;

public class tableauITERATIVE extends tableau {
	public tableauITERATIVE(etudiant[] tab) {
		super(tab);
	}
	@Override
	public void afficher() {
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i].nom+" "+tab[i].prenom+" "+tab[i].score);
		}
	}

	@Override
	public void afficherTrie() {
		for(int i=0;i<tab.length;i++) {
			System.out.println(tabTrie[i].nom+" "+tabTrie[i].prenom+" "+tabTrie[i].score);
		}
	}

	@Override
	public void triBulle() {
		tabTrie = tab;
		boolean tri ;
		int iteration = 1;
		do {
			tri=false;
			for(int i=0;i<tabTrie.length-iteration;i++)
			{
				if(tabTrie[i].score<tabTrie[i+1].score)
				{
					etudiant e = tabTrie[i];
					tabTrie[i] = tabTrie[i+1];
					tabTrie[i+1] = e;
					tri=true;
				}
			}
			iteration++;
		}while(tri==true);
	}

	@Override
	public void triInsertion() {
		tabTrie = tab;
		etudiant act;
		for(int iact=1;iact<=tabTrie.length-1;iact++) {
			act=tabTrie[iact];
			int i=iact-1;
			while(i>=0 && tabTrie[i].score<act.score) {
				tabTrie[i+1]=tabTrie[i];
				i=i-1;
			}
			tabTrie[i+1]=act;
		}
	}

	@Override
	public void triSelection() {
		tabTrie= tab;
		for(int iact=0;iact<tabTrie.length-1;iact++) {
			etudiant max = tabTrie[iact];
			int imax=iact;
			for(int i=iact+1;i<tabTrie.length;i++) {
				if(tabTrie[i].score>max.score) {
					max=tabTrie[i];
					imax=i;
				}
			}
			tabTrie[imax]=tabTrie[iact];
			tabTrie[iact]=max;
		}
	}
	public void rechS(float n) {
		boolean v=false;
		int i=0;
		while(i<tabTrie.length&&v==false) {
			if(tabTrie[i].score==n) {
				v=true;
				System.out.println("l'etudiant ayant la note "+n+" est "+tabTrie[i]);
			}
			i++;
			}
		if(v==false)
			System.out.println("il n y a pas d'etudiant ayant la note "+n+" dans la liste");
	}
	public void rechD(float n) {
		int d=0,f=tabTrie.length-1;
		boolean v=false;
		while(v==false && d<=f) {
			int m=(d+f)/2;
			if(tabTrie[m].score==n) {
				System.out.println("l'etudiant ayant la note "+n+" est "+tabTrie[m]);
				v=true;
			}
			else {
				if(tabTrie[m].score>n)
					f=m-1;
				else
					d=m+1;
			}
			if(d>f)
				System.out.println("il n y a pas d'etudiant ayant la note "+n+" dans la liste");
		}
	}
	public void noteSup() {
		int i=0;
		int pos=-1;
		boolean v=false;
		while(i<tabTrie.length&&v==false) {
			if(tabTrie[i].score<=15) {
				pos=i;
				v=true;
			}
			i++;
		}
		if(pos==-1)
			System.out.println("tout les etudiants ont eu moins de 15");
		else {
			System.out.println("l'etudiant/les etudiants ayant plus de 15 sont:");
			for(int j=0;j<pos;j++) {
				System.out.println(tabTrie[j]);
			}
		}
	}
}

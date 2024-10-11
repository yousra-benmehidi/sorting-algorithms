package packpack;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		etudiant[] TAB = new etudiant[5];
		Random r = new Random();
		//TAB[0]=new etudiant("nom","prenom",0);
		for(int i=0;i<TAB.length;i++)
		{
			TAB[i] = new etudiant("nom"+i,"prenom"+i,r.nextFloat(0, 20));
		}
		tableauITERATIVE listEtudiant = new tableauITERATIVE(TAB);
		System.out.println("la liste des etudiants est ");
		listEtudiant.afficher();
		System.out.println("\nla liste des etudiants triée est:");
		//temp
		
		//tri a bulle
		/*
		long deb =  System.currentTimeMillis();
		listEtudiant.triBulle();
		long fin=  System.currentTimeMillis();
		listEtudiant.afficherTrie();
		long t=fin-deb;
		System.out.println("temp d'ex: "+t);
		
		
		//tri insertion
		/*
		listEtudiant.triInsertion();
		listEtudiant.afficherTrie();
		
		//tri par selection
		/*listEtudiant.triSelection();
		listEtudiant.afficherTrie();*/
		
		//recherche sequentielle
		//listEtudiant.rechD(10);
		
		//listEtudiant.noteSup();
		
		//tri recursif
		tableauRec studentList = new tableauRec(TAB);
		//tri bulle
		/*studentList.triBulle();
		studentList.afficherTrie();*/
		
		//tri selection
		/*
		long deb =  System.currentTimeMillis();
		listEtudiant.triSelection();
		long fin=  System.currentTimeMillis();
		listEtudiant.afficherTrie();
		long t=fin-deb;
		System.out.println("temp d'ex: "+t);*/
		
		//tri insertion
		listEtudiant.triInsertion();
		listEtudiant.afficherTrie();
		}
		
		//tri insertion
}

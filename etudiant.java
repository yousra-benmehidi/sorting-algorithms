package packpack;

public class etudiant {
String nom,prenom;
float score;
public etudiant(String nom,String prenom, float score)
{
	this.nom = nom;
	this.prenom = prenom;
	this.score = score;
}
	public String toString(){
		return nom+" "+prenom;
	}
}

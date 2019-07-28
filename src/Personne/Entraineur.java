package Personne;
import Sport.Equipe;

public class Entraineur extends Personne {
private Equipe equipe;

public Entraineur(String nom,int age){
    super(nom,age);
}

	public void Afficher() {
		System.out.println("Nom Entraineur : " + nom);
		System.out.println("Age Entraineur : " + age);	
		System.out.println("Equipe entrainé :"+ equipe.nom);
	}
	
	
	// Un entraineur peut changer l'equipe qu'il l'entraine
	public void setEquipe(Equipe e) {
		equipe = e;
	}
	
	
	public String getNom() {
		return nom;
	}
	
}

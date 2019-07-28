package Personne;
import Sport.Equipe;

public class Joueur extends Personne{
private int numMaillot;
private String poste;
private Equipe equipe;

public Joueur(String nom,int age,Equipe equipe,int numMaillot,String poste) {
	super(nom,age);
	this.equipe=equipe;
	this.numMaillot = numMaillot;
    this.poste = poste;
}


public void Afficher() {
	System.out.println("Nom Joueur : " + nom);
	System.out.println("Equipe actuel : "+ equipe.nom);
	System.out.println("Numero Maillot : " + numMaillot);	
	System.out.println("Poste : " + poste);	
	}
	

// Un joueur peut changer son numero de maillot
public void setNumMaillot(int x ) {
	numMaillot = x;
}

// un joueur peut changer sa poste de jeu
public void setPoste(String p) {
	poste = p;
}

// Un joueur peut changer d'equipe
public void setEquipe(Equipe E) {
	equipe = E;
}

public int getNumMaillot() {
	return numMaillot;
}

public Equipe getEquipe() {
	return equipe;
}

public String getNom() {
	return nom;
}

}
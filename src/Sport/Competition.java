package Sport;
import java.util.*;

import Personne.*;

public class Competition{
	
	public String nom;
	private ArrayList <Equipe> equipes;
	private ArrayList <Match> matchs;
	private ArrayList <Arbitre> arbitres;
	private ArrayList <Entraineur> entraineurs;
	
	
	// Constructeur
	public Competition(String nom) {
		this.nom = nom;
		this.equipes = new ArrayList<>();
		this.matchs = new ArrayList<>();
		this.arbitres = new ArrayList<>();
		this.entraineurs = new ArrayList<>();
	}
	
	
	public void addEquipe(Equipe E) {
		equipes.add(E);
	}
	
	
	public void addMatch(Match M) {
		matchs.add(M);
	}
	
	
	public void addArbitre(Arbitre A) {
		arbitres.add(A);
	}
	
	
	public void addEntraineur(Entraineur E) {
		entraineurs.add(E);
	}
	
	
	public ArrayList <Equipe> getEquipes() {
		return equipes;
	}
	
	
	public ArrayList <Arbitre> getArbitres(){
		return arbitres;
	}
	
	
	public ArrayList <Match> getMatchs(){
		return matchs;
	}
	
	
	public ArrayList <Entraineur> getEntraineurs(){
		return entraineurs;
	}
	
	
	public void rechercheRencontre(Equipe e1,Equipe e2){
		System.out.println("** Historique de rencontres entre "+ e1.nom + " Vs " + e2.nom);
		for(int i=0;i<matchs.size();i++) {
			if(e1.equals(matchs.get(i).getEquipe1()) && e2.equals(matchs.get(i).getEquipe2()))
				matchs.get(i).afficheMatch();;
		}
		
	}
	
	// Necessaire pour le MAJ d'un Arbitre et pour éviter la redondance lors de saisie 
	public Arbitre getArbitreByName(String name) {
		for(int i=0;i<arbitres.size();i++) {
			if(arbitres.get(i).getNom().equals(name))
				return arbitres.get(i);
		}
		return null;
			
	}
	
	// Necessaire pour le MAJ d'un équipe, l'affichage et pour éviter la redondance lors de saisie 
	public Equipe getEquipeByName(String name) {
		for(int i=0;i<equipes.size();i++) {
			if (equipes.get(i).nom.equals(name))
				return equipes.get(i);
		}
		return null;
	}
	
	// Necessaire pour le MAJ d'un Entraineur et pour éviter la redondance lors de saisie 
	public Entraineur getEntraineurByName(String name) {
		for (int i=0;i<entraineurs.size();i++) {
			if(entraineurs.get(i).getNom().equals(name))
				return entraineurs.get(i);
		}
		return null;
	}
	
	
	// On avait un problème lors du classement des équipes selon le nombre de points en utilisant l'ArrayList
	// La problème est résolu en utilisant une ArrayList auxiliare pour le classement dernier
	// Cette méthode est dedié pour vérifier si un équipe est déjà classé (existe) dans l'ArrayList auxiliare contenant les équipes classés
	
	private boolean verif(String nom, ArrayList <Equipe> aux) {
		for(int i=0;i<aux.size();i++) {
			if (aux.get(i).nom.equals(nom))
				return true;
		}
		return false ;
	}
	
	public void Classement() {
		ArrayList <Equipe> aux = new ArrayList<>();
		int min=0;
		Equipe temp = null;
		for(int j=0;j<equipes.size();j++) {
			min = 0;
			temp = null;
		for(int i=0;i<equipes.size();i++){
		if((equipes.get(i).getPoints() >= min) && (! verif(equipes.get(i).nom,aux))) {
		temp = equipes.get(i);
		min = equipes.get(i).getPoints();
		}
	}
		aux.add(temp);
		}
		for(int i=0;i<aux.size();i++) {
			System.out.println((i+1) + "   " + aux.get(i).nom + "   " + aux.get(i).getPoints());
		}
		aux = null;
	}
	
}
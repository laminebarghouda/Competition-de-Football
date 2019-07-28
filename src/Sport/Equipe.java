package Sport;
import Personne.*;
import java.util.ArrayList;

public class Equipe {

	// Chaque Equipe est composee par un ensemble de joueurs titulaires, d'autres rempla�ants et Entraineur.

        public String nom;
	    private ArrayList <Joueur> titulaires;
	    private ArrayList <Joueur> remplacants;
	    private Entraineur entraineur;
	    private int victoires;
	    private int defaites;
	    private int nulles;
	    private int points;
	    
	    
	   public Equipe(String nom,Entraineur entraineur){
		    this.nom= nom;
		    this.entraineur=entraineur;
		    titulaires = new ArrayList <>();
	        remplacants = new ArrayList<>();
	    	victoires=0;
	    	defaites=0;
	    	nulles=0;
	    	points=0;
	       
	    }
	    
	    public void addTitulaire(Joueur J) {
	    	titulaires.add(J);
	    }
	    
	    public void addRemplacant(Joueur J) {
	     remplacants.add(J);
	    }
	    
	    
	    // Une �quipe peut changer son entraineur
	    public void setEntraineur(Entraineur E) {
	    	entraineur=E;
	    }
	    
	    // Calculer le nombre de points de l'�quipe
	    public void setPoints() {
	    	points = 3*victoires + nulles;
	    }
	    
	    //Un joueur peut changer d'�quipe sera donc supprimer de son �quipe actuel 
	    public void deleteJoueur(Joueur j) {
	    	for(int i=0;i<titulaires.size();i++) {
	    		if(titulaires.get(i).equals(j))
	    	 titulaires.remove(j);
	       }
	    
	    for(int i=0;i<remplacants.size();i++) {
    		if(remplacants.get(i).equals(j))
    	 remplacants.remove(j);
    		}
        }
	    
	    // Afficher la liste de joueurs d'une �quipe donn�e
	    public void Affiche() {
	    	System.out.println("********* " + nom + "*********");
	    	System.out.println("** Liste des Joueurs Titulaires **");
	    	System.out.println();
	    	for (int i=0;i<titulaires.size();i++) {
	    		System.out.println();
	    		titulaires.get(i).Afficher();
	    		System.out.println();
	    }
	    	System.out.println("** Liste des Joueurs Remplacants **");
	    	System.out.println();
	    	for(int i=0;i<remplacants.size();i++) {
	    		System.out.println();
	    		remplacants.get(i).Afficher();
	    		System.out.println();
	    	}
	    }
	    
	    
	    public void afficherStatistiques() {
	    	System.out.println("    **** " + nom + " ****");
	    	System.out.println("Nombre de matchs gagn�s = " + victoires);
	    	System.out.println("Nombre de matchs nulles = " + nulles);
	    	System.out.println("Nombre de matchs perdus  = " + defaites);
	    	System.out.println("Nombre de points = " + points);
	    	
	    }
	    
	    
	    public void incrementVictoires() {
	    	victoires++;
	    	points+=3;
	    }
	    
	    
	    public void incrementDefaites() {
	    	defaites++;
	    }
	    
	    
	    public void incrementNulles() {
	    	nulles++;
	    	points+=1;
	    }
	    
	    // V�rifie l'existence d'une joueur � une �quipe gra�e � son nom pour eviter la redondance de donn�e
		public boolean existeJoueur(String name) {
		   	for(int i=0;i<titulaires.size();i++) {
		       if(titulaires.get(i).getNom().equals(name))
		    		return true;
		    	}
		    for(int i=0;i<remplacants.size();i++) {
		    	if(remplacants.get(i).getNom().equals(name))
		    		return true;
		    }
		     return false;
		  }
		 
		
		// V�rifie si un num de maillot appratient d�j� � un joueur d'une �quipe donn�e car deux joueurs ne peuvent pas porter le meme num�ro
		 public boolean existeNumMaillot(int num) {
		   for(int i=0;i<titulaires.size();i++) {
		    	if(titulaires.get(i).getNumMaillot() == num)
		    		return true;
		    	}
		   for(int i=0;i<remplacants.size();i++) {
		    	if(remplacants.get(i).getNumMaillot() == num)
		    		return true;
		    	}
		    return false;
		   }
		 
		// Necessaire pour le MAJ d'un joueur donn�e et pour �viter la redondance lors de saisie
	 public Joueur getJoueurByName(String name) {
		  for(int i=0;i<titulaires.size();i++) {
		    if (titulaires.get(i).getNom().equals(name))
			   return titulaires.get(i);
		 }
		  for(int i=0;i<remplacants.size();i++) {
		   if (remplacants.get(i).getNom().equals(name))
			   return remplacants.get(i);
	    }
			   return null;	   
    }		 
	    
	    
	    public ArrayList<Joueur> getTitulaires() {
	    	return titulaires;
	    }
	    
	    public ArrayList<Joueur> getRemplacants() {
	    	return remplacants;
	    }
	   
	   
	  public  Entraineur getEntraineur() {
		   return entraineur;
	   }
	  
	  
	  public int getPoints() {
		  return points;
	  }
	    
  
	}
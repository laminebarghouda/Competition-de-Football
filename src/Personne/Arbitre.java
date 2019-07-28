package Personne;

public class Arbitre extends Personne{
private int nbMatches;

public Arbitre(String nom,int age,int NbMathches){
     super(nom,age);
     this.nbMatches= NbMathches; // Contient le nombré de matchs déjà deroulé par un arbitre avant qu'il est ajouté aux base de donnés
}

	public void Afficher() {
		System.out.println("Nom Arbitre : " + nom);	
		System.out.println("Age Arbitre : " + age);	
		System.out.println("Nombre de Matches :"+ nbMatches);
		}
	
    // Le nombre de matches s'incrémente automatiquement si un arbitre vient de se charger de la déroulement d'un match
   public void IncrementNbMatches() {
	   nbMatches++;
   }
   
    // on en besoin à l'affichage d'un match
    public String getNom() {
    	return nom;
    }
    
    }
package Sport;
import Personne.Arbitre;
import java.util.concurrent.ThreadLocalRandom;

public class Match {

    private Equipe equipe1 ;
    private Equipe equipe2 ;
    private int nombreButEquipe1;
    private int nombreButEquipe2;
    private Arbitre arbitre ;
    private String tour ; // "Aller" ou "Retour"
    
    // Constructeur 
    public Match(Equipe equipe1,Equipe equipe2,Arbitre arbitre,String tour) {
    this.equipe1 = equipe1;
    this.equipe2 = equipe2;
    // Le nombre de buts de chaque équipes est calculé arbitrerement mais sans depasser 10 
    nombreButEquipe1 = ThreadLocalRandom.current().nextInt(0, 10 + 1);
    nombreButEquipe2 = ThreadLocalRandom.current().nextInt(0, 10 + 1);
    this.arbitre = arbitre;
    this.tour = tour;
	   if(nombreButEquipe1>nombreButEquipe2) {
			equipe1.incrementVictoires();
			equipe2.incrementDefaites();
		}
		else if (nombreButEquipe1<nombreButEquipe2) {
		    equipe1.incrementDefaites();
			equipe2.incrementVictoires();
			}	
		else {
			equipe1.incrementNulles();
			equipe2.incrementNulles();
		}
	   equipe1.setPoints();
	   equipe2.setPoints();
    }
    
    
    // Constructeur surchargé si on veut saisir le nombre de buts par le clavier
    public Match(Equipe equipe1,Equipe equipe2,int e1b,int e2b, Arbitre arbitre,String tour) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
        nombreButEquipe1 = e1b;
        nombreButEquipe2 = e2b;
        this.arbitre = arbitre;
        this.tour = tour;
          // mettre à jour les statistique ( victoire, defaite, match nulle et nombre total des points) de chaque équipe
    	   if(nombreButEquipe1>nombreButEquipe2) {
    			equipe1.incrementVictoires();
    			equipe2.incrementDefaites();
    		}
    		else if (nombreButEquipe1<nombreButEquipe2) {
    		    equipe1.incrementDefaites();
    			equipe2.incrementVictoires();
    			}	
    		else {
    			equipe1.incrementNulles();
    			equipe2.incrementNulles();
    		}
    	   equipe1.setPoints();
    	   equipe2.setPoints();
        }
    
    
    // Necessaire pour afficher l'historique des matches ( cad tous les details du match)
    public void afficheMatch() {
    	System.out.println();
    	System.out.println("Tour :" + tour);
    	System.out.println(equipe1.nom +" " + nombreButEquipe1 + "-"+ nombreButEquipe2 + " "+ equipe2.nom);
    	System.out.println("Arbitre :" + arbitre.getNom());
    	System.out.println();
    	}
    
    
   public void afficheResultat() {
        System.out.println("Tour :" + tour + " : " + equipe1.nom +" " + nombreButEquipe1 + "-"+ nombreButEquipe2 + " "+ equipe2.nom);
    }
    
   
   public Equipe getEquipe1(){
	   return(equipe1);
   }
   
   
   public Equipe getEquipe2(){
	   return(equipe2);
   }
   
   
   public String getTour() {
	   return tour;
   }

   
}
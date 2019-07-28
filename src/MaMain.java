import Sport.*;
import Personne.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/*                                              Binôme :
                                        BARGHOUDA Mohamed Lamine
                                            SNOUSSI Anis
                                                  GL2                                                      */

/*   Veuillez se soutenir de notre rapport pour mettre en evidence l'ensemble de contrainte appliquées à la Compétition 
                              et l'explication générale de l'application                                   */

public class MaMain {


	public static void main(String[] args)  throws IOException,InterruptedException,FileNotFoundException {
		
		Scanner Sc = new Scanner(System.in);
		// La Compétition doit etre définit par défault avant de pouvoir manipuler notre application 
		System.out.println("Saisir le nom de votre competition ");
		String competitionName = Sc.nextLine();
		Competition MaCompetition = new Competition(competitionName);
		int action = 1;
		// Liste de fonctionnalités de l'application selon l'énonce du projet
		while(action > 0) {
    	System.out.println("\nChoisir une action :");
    	System.out.println("1. Effectuer le Test Complet de la Compétition"); // données déja préts pour un simple test sans passer par saisie au clavier qui est tout à fait possible dans les choix suivants
		System.out.println("2. Ajout ou Mise a jour Joueur");
		System.out.println("3. Ajout d'une equipe");
		System.out.println("4. Ajout ou Mise a jour Entraineur");
		System.out.println("5. Ajout Arbitre");
		System.out.println("6. Saisie d'un Match");
		System.out.println("7. Affichage des resultats des matches");
		System.out.println("8. Afficher une equipe");
		System.out.println("9. Afficher l'historique d'une rencontre entre deux equipes");
		System.out.println("10. Statistique d'une equipe");
		System.out.println("11. Classement de la competition");
		System.out.println("12. Importer les donnees");
		System.out.println("0. Exit !");
		action = Sc.nextInt();
		Sc.nextLine();
		switch (action) {
		case 1: Entraineur entraineur1 = new Entraineur("Solare",42);
		        MaCompetition.addEntraineur(entraineur1);
		        Entraineur entraineur2 = new Entraineur("Valverde",50);
		        MaCompetition.addEntraineur(entraineur2);
		        Entraineur entraineur3 = new Entraineur("Allegri",55);
		        MaCompetition.addEntraineur(entraineur3);
			    Equipe equipe1 = new Equipe("Real Madrid",entraineur1);
			    MaCompetition.addEquipe(equipe1);
			    entraineur1.setEquipe(equipe1);
		        Equipe equipe2 = new Equipe("Barcelona",entraineur2);
		        MaCompetition.addEquipe(equipe2);
		        entraineur2.setEquipe(equipe2);
		        Equipe equipe3 = new Equipe("Juventus",entraineur3);
		        MaCompetition.addEquipe(equipe3);
		        entraineur3.setEquipe(equipe3);
		        System.out.println("******************************************************************************************************");
		        System.out.println(equipe1.nom + ", " + equipe2.nom + " et " + equipe3.nom + " sont bien enregistrés dans " + MaCompetition.nom);
		        System.out.println("A vous de saisir l'equipe 4");
		        System.out.println("******************************************************************************************************");
		        String nom4 = "";
		        Equipe equipe4 = null;
		        do {
		        	equipe4 = null;
		        	System.out.println("Saisir le nom de la nouvelle equipe");
			        nom4 = Sc.nextLine();
		        	equipe4 = MaCompetition.getEquipeByName(nom4);
		        	if(equipe4 != null)
		        		System.out.println(nom4 + " est déjà enregistré dans la liste des equipes de " + competitionName);
		        	
		        } while(equipe4 != null);
		        System.out.println("Saisir le nom d'entraineur de " + nom4);
	        	String ent4 = Sc.nextLine();
	        		System.out.println("Saisir l'age de  " + ent4);
	        		int age4 = Sc.nextInt();
	        		Sc.nextLine();
	        		Entraineur entraineur4 = new Entraineur(ent4,age4);
	        		MaCompetition.addEntraineur(entraineur4);
	        	equipe4 = new Equipe(nom4,entraineur4);
	        	MaCompetition.addEquipe(equipe4);
	        	entraineur4.setEquipe(equipe4);
		        Joueur joueur11 = new Joueur("Sergio Ramos", 32, equipe1, 4,"Defence");
		        equipe1.addTitulaire(joueur11);
		        Joueur joueur12 = new Joueur("Gareth Bale", 28, equipe1, 11,"attack");
		        equipe1.addTitulaire(joueur12);
		        Joueur joueur13 = new Joueur("Marcelo Da Silva", 31, equipe1, 12,"Defence");
		        equipe1.addTitulaire(joueur13);
		        Joueur joueur14 = new Joueur("Isco Alarcon",29,equipe1,22,"Midfielder");
		        equipe1.addRemplacant(joueur14);
		        Joueur joueur21 = new Joueur("Lionel Messi", 31, equipe2, 10,"Attack");
		        equipe2.addTitulaire(joueur21);
		        Joueur joueur22 = new Joueur("Luis Suarez", 32, equipe2, 9,"Attack");
		        equipe2.addTitulaire(joueur22);
		        Joueur joueur23 = new Joueur("Sergio Roberto", 27, equipe2, 4,"Defence");
		        equipe2.addRemplacant(joueur23);
		        Joueur joueur31 = new Joueur("Cristiano Ronaldo", 33, equipe3, 7,"Defence");
		        equipe3.addTitulaire(joueur31);
		        Joueur joueur32 = new Joueur("Paulo Dybala", 26, equipe3, 4,"Defence");
		        equipe3.addTitulaire(joueur32);
		        Joueur joueur33 = new Joueur("Federico Bernardeschi",24, equipe3,33,"Midfielder");
		        equipe3.addRemplacant(joueur33);
		        Arbitre arbitre1 = new Arbitre("Felix Brych",43,113);
		        MaCompetition.addArbitre(arbitre1);
		        Arbitre arbitre2 = new Arbitre("Cuneyt Cakir", 42,157);
		        MaCompetition.addArbitre(arbitre2);
		        Arbitre arbitre3 = new Arbitre("Clement Turpin",36,85);
		        MaCompetition.addArbitre(arbitre3);
		        Match match1 = new Match(equipe1, equipe2,arbitre1,"Aller");
		        MaCompetition.addMatch(match1);
		        Match match2 = new Match(equipe3, equipe4,arbitre3,"Aller");
		        MaCompetition.addMatch(match2);
		        Match match3 = new Match(equipe1, equipe3,arbitre2,"Aller");
		        MaCompetition.addMatch(match3);
		        Match match4 = new Match(equipe2, equipe4,arbitre2,"Aller");
		        MaCompetition.addMatch(match4);
		        Match match5 = new Match(equipe1, equipe4,arbitre3,"Aller");
		        MaCompetition.addMatch(match5);
		        Match match6 = new Match(equipe2, equipe3,arbitre1,"Aller");
		        MaCompetition.addMatch(match6);
		        Match match7 = new Match(equipe1, equipe2,arbitre1,"Retour");
		        MaCompetition.addMatch(match7);
		        Match match8 = new Match(equipe3, equipe4,arbitre3,"Retour");
		        MaCompetition.addMatch(match8);
		        Match match9 = new Match(equipe1, equipe3,arbitre2,"Retour");
		        MaCompetition.addMatch(match9);
		        Match match10 = new Match(equipe2, equipe4,arbitre2,"Retour");
		        MaCompetition.addMatch(match10);
		        Match match11 = new Match(equipe1, equipe4,arbitre3,"Retour");
		        MaCompetition.addMatch(match11);
		        Match match12 = new Match(equipe2, equipe3,arbitre1,"Retour");
		        MaCompetition.addMatch(match12);
		        break;
		
		case 2 : System.out.println("1. Nouveau Joueur");
		       	 System.out.println("2. Mise à jour Maillot Joueur");
			     System.out.println("3. Mise à jour Poste Joueur");
			     System.out.println("4. Mise à jour Equipe Joueur");
			     int action2 = Sc.nextInt();
			     Sc.nextLine(); 
			     switch (action2) {
			     
			       case 1 : 
			    	   
			    	        Joueur J= null; 
			    	        System.out.println("Saisir le Nom du joueur");
			    	        String temp = Sc.nextLine();
			    	        System.out.println("Saisir l'equipe actuel de " + temp);
			    	        String temp3 = Sc.nextLine();
			    	        // Verifier si l'équipe existe ou pas dans notre Compétition
			    	        Equipe E = MaCompetition.getEquipeByName(temp3);
			    	        if(E == null) {
			    	        	System.out.println("\n-- L'équipe " + temp3 + " n'est pas enregistré dans " + competitionName);
			    	        	// Saisie de l'équipe si elle n'est pas enregistré
			    	        	System.out.println("Saisir le nom d'entraineur de " + temp3);
			    	        	String ent = Sc.nextLine();
			    	        	Entraineur entraineur = MaCompetition.getEntraineurByName(ent);
			    	        	if(entraineur == null) {
			    	        		System.out.println("\n-- " + ent + " n'est pas enregistré dans la liste des entraineurs actifs dans " + competitionName);
			    	        		// Saisie de l'entraineur s'il n'est pas déjà enregistré 
			    	        		System.out.println("Saisir l'age de  " + ent);
			    	        		int age = Sc.nextInt();
			    	        		Sc.nextLine();
			    	        		entraineur = new Entraineur(ent,age);
			    	        		MaCompetition.addEntraineur(entraineur);
			    	        		System.out.println("\n++ " + ent + " est bien ajouté à la liste des entraineurs actif dans " + competitionName);
			    	        	}
			    	        	E = new Equipe(temp3,entraineur);
			    	        	MaCompetition.addEquipe(E);
			    	        	System.out.println("\n++ " + temp3 + " est bien ajouté aux équipes  actifs dans " + competitionName );
			    	        	entraineur.setEquipe(E);
			    	        	System.out.println("\n++ " + ent + " est bien affecté entraineur à l'équipe " + temp3 );
			    	         }
			    	        	if(E.existeJoueur(temp)) {
			    	        		System.out.println(temp + " est déjà enregistré dans l'équipe " + temp3);
			    	        	}
			    	        	else {
			    	        		// Ajout de joueur après avoir vérifier qu'il n'est pas déjà enregistré 
			    	        		System.out.println("Saisir l'age de " + temp);
					    	        int temp2 = Sc.nextInt();
					    	        Sc.nextLine();
					    	        System.out.println("Saisir le numero de maillot de " + temp);
					    	        int nm = Sc.nextInt();
					    	        Sc.nextLine();
					    	        // Verfier l'unicité de numero de maillot et qu'il n'appartient pas à un autre joueur
					    	        while (E.existeNumMaillot(nm)) {
				    	        		System.out.println("Le numéro de maillot " + nm + " appratient déja à un autre joueur de " + temp3);
				    	        		System.out.println("Veuillez saisir un autre numero de maillot pour " + temp);
				    	        		nm = Sc.nextInt();
						    	        Sc.nextLine();
					    	        }
					    	        System.out.println("Saisir la poste de jeu de " + temp);
					    	        String poste = Sc.nextLine();
				    	            J= new Joueur(temp,temp2,E,nm,poste);
				                    System.out.println("Choisir nomination :\n1.Titulaire \n2.Remplacants ");
	          		                int type = Sc.nextInt();
	          		                Sc.nextLine();
	          		                if(type == 1)
	 	                			  E.addTitulaire(J);
	 	                		    else
	 	                			  E.addRemplacant(J);
	          		                System.out.println("\n++ " + temp + " est bien ajouté à l'équipe " + temp3 );
			    	        	}
			    	        
			    	        break;
			    	        
			                
			                
			      case 2 : 
			    	  
			    	System.out.println("Saisir le Nom du joueur");
	    	        String temp11 = Sc.nextLine();
	    	        System.out.println("Saisir l'equipe actuel de " + temp11);
	    	        String temp33 = Sc.nextLine();
	    	        Equipe et = MaCompetition.getEquipeByName(temp33);
	    	        Joueur j1 = null;
	    	        // Verfier l'existence de l'équipe donnée
	    	        if(et == null) {
	    	        	System.out.println(temp33 + " n'existe pas dans la liste des équipes actifs dans " + competitionName);
	    	        	break;
	    	        }
	    	        else {
	    	        	// Verifier l'existence du joueur donnée
	    	        	j1 = et.getJoueurByName(temp11);
	    	          if(j1 == null) {
	    	        	System.out.println(temp11 + " n'existe pas dans la liste des joueurs de " + temp33);
	    	          }
	    	          else {
	    	        	  System.out.println("Saisir le nouveau numero de maillot de " + temp33);
		    	        	int tempnouv = Sc.nextInt();
		    	        	Sc.nextLine();
		    	        	if(et.existeNumMaillot(tempnouv)) {
		    	        		// Verfier l'unicité de numero de maillot et qu'il n'appartient pas à un autre joueur
		    	        		System.out.println("Le numéro de maillot " + tempnouv + " appratient déja à un autre joueur de " + temp33);
	    	        	  break;
		    	        	}
		    	        	else
		    	        		j1.setNumMaillot(tempnouv);
	    	          }
	    	        }
			               break; 
			      
		
			      case 3 :
			    	  
			    	    System.out.println("Saisir le Nom du joueur");
		    	        String temp1 = Sc.nextLine();
		    	        System.out.println("Saisir l'equipe actuel de " + temp1);
		    	        String temp13 = Sc.nextLine();
		    	        Equipe et1 = MaCompetition.getEquipeByName(temp13);
		    	        Joueur j2 = null;
		    	     // Verfier l'existence de l'équipe donnée
		    	        if(et1 == null) {
		    	        	System.out.println(temp13 + " n'existe pas dans la liste des équipes actifs dans " + competitionName);
		    	        	break;
		    	        }
		    	        else {
		    	        	j2 = et1.getJoueurByName(temp1);
		    	        	// Verifier l'existence du joueur donnée
		    	          if(j2 == null) {
		    	        	System.out.println(temp1 + " n'existe pas dans la liste des joueurs de " + temp13);
		    	          }
		    	          else {
		    	        	  System.out.println("Saisir le nouveau poste de jeu de " + temp13);
			    	          String posNouv = Sc.nextLine();
			    	          j2.setPoste(posNouv);
			    	        	}
			    	        	
		    	        }
				               break;
			     
			      case 4 : 
			    	
			    	System.out.println("Saisir le Nom du joueur");
	    	        String temp10 = Sc.nextLine();
	    	        System.out.println("Saisir l'equipe actuel de " + temp10);
	    	        String temp30 = Sc.nextLine();
	    	        Equipe et0 = MaCompetition.getEquipeByName(temp30);
	    	        Joueur j0 = null;
	    	     // Verfier l'existence de l'équipe donnée
	    	        if(et0 == null) {
	    	        	System.out.println(temp30 + " n'existe pas dans la liste des équipes actifs dans " + competitionName);
	    	        }
	    	        else {
	    	        	j0 = et0.getJoueurByName(temp10);
	   	    	     // Verifier l'existence du joueur donnée
	    	          if(j0 == null) {
	    	        	System.out.println(temp10 + " n'existe pas dans la liste des joueurs de " + temp30);
	    	          }
	    	          else {
	    	        	  et0.deleteJoueur(j0);
	    	          }
			     }
			     break;
			     }
			     break;
			     
			     
			     
		case 3 : 
        	System.out.println("Saisir le nom de la nouvelle equipe");
			String nomequipe = Sc.nextLine();
	        Equipe equipe  = MaCompetition.getEquipeByName(nomequipe);;

	        	// Verifier l'existence de l'équipe dans la liste des équipes de la compétition
	        	if(equipe != null)
	        		System.out.println(nomequipe + " est déjà enregistré dans la liste des equipes de " + competitionName);
	        	else {
	        System.out.println("Saisir le nom d'entraineur de " + nomequipe);
        	String entr = Sc.nextLine();
        	Entraineur eAux = MaCompetition.getEntraineurByName(entr);
        	 if( eAux == null) {
        		System.out.println("Saisir l'age de  " + entr);
        		int ager = Sc.nextInt();
        		Sc.nextLine();
        		eAux = new Entraineur(entr,ager);
        		MaCompetition.addEntraineur(eAux);
        	 }
        	equipe = new Equipe(nomequipe,eAux);
        	MaCompetition.addEquipe(equipe);
        	eAux.setEquipe(equipe);
		        }
			
			break;
			
			
			
			
	    case 4: System.out.println("1. Nouveau Entraineur");
	            System.out.println("2. Mise à jour Equipe entrainé");
	            int action4 = Sc.nextInt();
	            Sc.nextLine();
	            switch (action4) {
	            case 1 : System.out.println("Saisir le nom d'entraineur");
	                     String ent = Sc.nextLine();
	        	         Entraineur entraineur = MaCompetition.getEntraineurByName(ent);
	        	 // Ajout de l'entraineur après avoir vérifier qu'il n'est pas déjà enregistré
	        	if(entraineur == null) {
	        		System.out.println("Saisir l'age de " + ent);
	        		int age = Sc.nextInt();
	        		Sc.nextLine();
	        		entraineur = new Entraineur(ent,age);
	        		MaCompetition.addEntraineur(entraineur);
	        		System.out.println("\n++ " + ent + " est bien ajouté à la liste des entraineurs actif dans " + competitionName);
	        	}
	        	else {
	        		System.out.println(ent + " est déjà enregistré à la liste des entraineurs actifs dans " + competitionName);
	        	}
	        	break;
	        	
	        	
	            case 2: System.out.println("Saisir le nom de l'entraineur");
				        String entr = Sc.nextLine();
				        Entraineur entraineurr = MaCompetition.getEntraineurByName(entr);
				        // Verifier si l'entraineur existe dans la liste des entraineurs enregistrés
				        if(entraineurr == null) {
			        		System.out.println("\n-- " + entr + " n'est pas enregistré dans la liste des entraineurs actifs dans " + competitionName);
				        }
				        else {
				        	System.out.println("Saisir le nom de l'équipe à entrainer par " + entr);
				        	String eqp = Sc.nextLine();
				        	Equipe ep = MaCompetition.getEquipeByName(eqp);
				        	if(ep == null)
				        		System.out.println(eqp + " n'existe pas dans la liste des équipes actifs dans " + competitionName);
				        	else {
				        		// Mettre à jour l'équipe entrainé et l'objet entraineur dans l'équipe
				        	ep.getEntraineur().setEquipe(null);
				        		entraineurr.setEquipe(ep);
				        	ep.setEntraineur(entraineurr);
				        }
				        }
	            }
	    	            break;
	    	
	    	
	    	
	    case 5:	
	    	
	    System.out.println("Saisir le nom de l'arbitre");
        String a = Sc.nextLine();
        Arbitre A = MaCompetition.getArbitreByName(a);
        // Verifier si l'arbitre existe déjà dans la liste des arbitres enregistrés
        if(A == null) {
		System.out.println("Saisir l'age de  " + a);
		int age = Sc.nextInt();
		Sc.nextLine();
		System.out.println("Saisir le nombre de matchs déjà deroulé par " + a + " s'ils existent");
		int nbMatches = Sc.nextInt();
		Sc.nextLine();
		A = new Arbitre(a,age,nbMatches);
		MaCompetition.addArbitre(A);
		System.out.println("\n++ " + a + " est bien ajouté à la liste des arbitres actif dans " + competitionName);
	} 
        else 
        	System.out.println(a + " est déjà enregistré dans la liste des arbitres actifs dans " + competitionName);
        
	       break;
	     
	    
	     
		case 6:
			
			
			System.out.println("Saisir le nom de l'equipe 1");
			String e1=Sc.nextLine();
			System.out.println("Saisir le nom de l'equipe 2");
			String e2 = Sc.nextLine();
			Equipe p1 = MaCompetition.getEquipeByName(e1);
			Equipe p2 = MaCompetition.getEquipeByName(e2);
			if(p1 == null) {
				// Ajouter l'équipe 1 s'il n'est pas enregistré dans notre base de données
	        	System.out.println("\n-- L'équipe " + e1 + " n'est pas enregistré dans " + competitionName);
	        	System.out.println("Saisir le nom d'entraineur de " + e1);
	        	String ent = Sc.nextLine();
	        	Entraineur entraineur = MaCompetition.getEntraineurByName(ent);
	        	if(entraineur == null) {
	        		System.out.println("\n-- " + ent + " n'est pas enregistré dans la liste des entraineurs actifs dans " + competitionName);
	        		System.out.println("Saisir l'age de  " + ent);
	        		int age = Sc.nextInt();
	        		Sc.nextLine();
	        		entraineur = new Entraineur(ent,age);
	        		MaCompetition.addEntraineur(entraineur);
	        		System.out.println("\n++ " + ent + " est bien ajouté à la liste des entraineurs actif dans " + competitionName);
	        	}
	        	p1 = new Equipe(e1,entraineur);
	        	MaCompetition.addEquipe(p1);
	        	System.out.println("\n++ " + e1 + " est bien ajouté aux équipes  actifs dans " + competitionName );
	        	entraineur.setEquipe(p1);
	        	System.out.println("\n++ " + ent + " est bien affecté entraineur à l'équipe " + e1 );
	         }
			if(p2 == null) {
				// Ajouter l'équipe 2 s'il n'est pas enregistré dans notre base de données
	        	System.out.println("\n-- L'équipe " + e2 + " n'est pas enregistré dans " + competitionName);
	        	System.out.println("Saisir le nom d'entraineur de " + e2);
	        	String ent = Sc.nextLine();
	        	Entraineur entraineur = MaCompetition.getEntraineurByName(ent);
	        	if(entraineur == null) {
	        		System.out.println("\n-- " + ent + " n'est pas enregistré dans la liste des entraineurs actifs dans " + competitionName);
	        		System.out.println("Saisir l'age de  " + ent);
	        		int age = Sc.nextInt();
	        		Sc.nextLine();
	        		entraineur = new Entraineur(ent,age);
	        		MaCompetition.addEntraineur(entraineur);
	        		System.out.println("\n++ " + ent + " est bien ajouté à la liste des entraineurs actif dans " + competitionName);
	        	}
	        	p2 = new Equipe(e2,entraineur);
	        	MaCompetition.addEquipe(p2);
	        	System.out.println("\n++ " + e2 + " est bien ajouté aux équipes  actifs dans " + competitionName );
	        	entraineur.setEquipe(p1);
	        	System.out.println("\n++ " + ent + " est bien affecté entraineur à l'équipe " + e2 );
	         }
			String t = "";
			do {
				System.out.println("Saisir le tour : 'Aller' ou 'Retour' ");
				t = Sc.nextLine();
			} while(!(t.equals("Aller")) && !(t.equals("Retour")));
			
			boolean dejaJoue = false;
			Match M = null;
			// Verifier si deux équipes ont déjà jouer dans le meme tour ce qui n'est pas possible
			for(int i=0;i<MaCompetition.getMatchs().size();i++) {
				 if(((MaCompetition.getMatchs().get(i).getEquipe1().equals(p1) && MaCompetition.getMatchs().get(i).getEquipe2().equals(p2)) || (MaCompetition.getMatchs().get(i).getEquipe1().equals(p2)&&MaCompetition.getMatchs().get(i).getEquipe2().equals(p1))) && (MaCompetition.getMatchs().get(i).getTour().equals(t))) {
					 System.out.println("Les deux equipes " + p1.nom + " et " + p2.nom + " ont déjà jouer en " + t);
					 dejaJoue =true;
					 break;
				 }
			}
			boolean verifAller = true;
			if(t.equals("Retour") && (! dejaJoue)) {
				// Verifier si les deux equipes ont joué le tour Aller si le match en cours de saisie est en tour Retour
				for(int i=0;i<MaCompetition.getMatchs().size();i++) {
					 if(((MaCompetition.getMatchs().get(i).getEquipe1().equals(p1) && MaCompetition.getMatchs().get(i).getEquipe2().equals(p2)) || (MaCompetition.getMatchs().get(i).getEquipe1().equals(p2)&&MaCompetition.getMatchs().get(i).getEquipe2().equals(p1))) ) {
						 verifAller = false;
						 break;
					 }
				}
			}
			if(! dejaJoue && verifAller && t.equals("Retour"))
				System.out.println("Les deux equipes " + p1.nom + " et " + p2.nom + " n'ont pas encore joué en tour Aller ");
			else if (! dejaJoue && ((verifAller && t.equals("Aller")) || (! verifAller && t.equals("Retour")))) {
				System.out.println("Saisir le nom de l'arbitre");
				String a1 = Sc.nextLine();
				Arbitre A1 = MaCompetition.getArbitreByName(a1);
				// Verifier si l'arbitre existe dans notre base de données sinon le défenir
				if(A1 == null) {
		        		System.out.println("\n-- " + a1 + " n'est pas enregistré dans la liste des arbitres actifs dans " + competitionName);
		        		System.out.println("Saisir l'age de  " + a1);
		        		int age = Sc.nextInt();
		        		Sc.nextLine();
		        		System.out.println("Saisir le nombre de matchs déjà deroulé par Mr. " + a1 + "s'ils existent");
		        		int nbMatches = Sc.nextInt();
		        		Sc.nextLine();
		        		A1 = new Arbitre(a1,age,nbMatches);
		        		MaCompetition.addArbitre(A1);
		        		System.out.println("\n++ " + a1 + " est bien ajouté à la liste des arbitres actif dans " + competitionName);
		        	}
				// Incrementer le nombre de matchs deroulés par l'arbitre qui déroule aussi celui dont on saisie
				A1.IncrementNbMatches();
				System.out.println("Saisir le nombre de buts marqués par "+ e1);
				int e1b = Sc.nextInt();
				Sc.nextLine();
				System.out.println("Saisir le nombre de buts marqués par "+ e2);
				int e2b = Sc.nextInt();
				Sc.nextLine();
			M = new Match(p1,p2,e1b,e2b,A1,t);
			MaCompetition.addMatch(M);
			}

			      break;
			
			
		case 7: if(MaCompetition.getMatchs().size()>0)
				for (int i=0;i<MaCompetition.getMatchs().size();i++)
			    MaCompetition.getMatchs().get(i).afficheResultat();
			    else
				System.out.println("Aucun match enregistré dans la competition !");
			    break;
			
			
			
		case 8: System.out.println("Saisir le nom de l'equipe");
		        String nomAux= Sc.nextLine();
		        Equipe eq= MaCompetition.getEquipeByName(nomAux);
		        if(eq != null)
		        		eq.Affiche();
		        else
		        	System.out.println(nomAux + " n'existe pas dans la liste des équipes actifs dans " + competitionName);
		        break;
		        	
		    
		        
		 case 9: System.out.println("Saisir le nom de l'equipe 1");
		         String ep1 = Sc.nextLine();
		         System.out.println("Saisir le nom de l'equipe 2");
		         String ep2 = Sc.nextLine();
		         Equipe eq1 = MaCompetition.getEquipeByName(ep1);
		         Equipe eq2 = MaCompetition.getEquipeByName(ep2);
		         // Verifier l'existence de deux équipes dans la liste de équipes enregistrés
		         if(eq1 == null)
		     	 System.out.println(ep1 + " n'existe pas dans la liste des équipes actifs dans " + competitionName);
		         if(eq2 == null)
		     	 System.out.println(ep2 + " n'existe pas dans la liste des équipes actifs dans " + competitionName);
		         if((eq1 != null) && (eq2 != null)) {
		    	 for(int i=0;i<MaCompetition.getMatchs().size();i++) {
				 if((MaCompetition.getMatchs().get(i).getEquipe1().equals(eq1) && MaCompetition.getMatchs().get(i).getEquipe2().equals(eq2)) || (MaCompetition.getMatchs().get(i).getEquipe1().equals(eq2)&&MaCompetition.getMatchs().get(i).getEquipe2().equals(eq1)))
					 MaCompetition.getMatchs().get(i).afficheMatch();
			          }
		         }
		         
		         break;
		 
		   
		 
		 case 10: System.out.println("Saisir le nom d'equipe");
		          String e = Sc.nextLine();
		          Equipe E = MaCompetition.getEquipeByName(e);
		          if(E != null)
		      	  E.afficherStatistiques();
		          else
		    	  System.out.println(e + " n'existe pas dans " + competitionName);
		          
		          break;
		 
		 
		 
		 case 11: MaCompetition.Classement();
		 
		          break;
		          
		 case 12: 
		 		System.out.println("1. Ajout Arbitres");
	            System.out.println("2. Ajout Entraineurs");
	            System.out.println("3. Ajout Equipe");
				System.out.println("4. Retour");
	            int choix = Sc.nextInt();
	            Sc.nextLine();
	            switch (choix) {

	            	case 1: 
	            		System.out.println("Donner les arbitres (comme suit):");
	            		System.out.println("Nom,Age,nbrMatches");
						System.out.println("Donner le nom du fichier CSV: ");
						String filenameAr = Sc.nextLine();
						Scanner scannerAr = new Scanner(new File(filenameAr));
 				    scannerAr.useDelimiter(",|\\n");
					    while(scannerAr.hasNext()){
       				  String temp1=scannerAr.next();
      				  String temp2=scannerAr.next();
       				  String temp3=scannerAr.next();
						  int ageAux = Integer.parseInt(temp2);
						  int nbrMatchesAux = Integer.parseInt(temp3);
						  Arbitre arbitreAux = new Arbitre(temp1,ageAux,nbrMatchesAux);
						  MaCompetition.addArbitre(arbitreAux);
    					}
						   scannerAr.close();
						  System.out.println("Tout va bien :) Les arbitres sont biens lus et enregistrés dans votre liste d'arbitres !");
	            	break;

	            	case 2:
	            		System.out.println("Donner les entraineurs (comme suit):");
	            		System.out.println("Nom,Age");
						System.out.println("Donner le nom du fichier CSV: ");
						String filenameEnt = Sc.nextLine();
						Scanner scannerEnt = new Scanner(new File(filenameEnt));
 				    scannerEnt.useDelimiter(",|\\n");
					    while(scannerEnt.hasNext()){
       				  String temp1=scannerEnt.next();
      				  String temp2=scannerEnt.next();
						  int ageAux = Integer.parseInt(temp2);
						  Entraineur entraineurAux = new Entraineur(temp1,ageAux);
						  MaCompetition.addEntraineur(entraineurAux);
    					}
						   scannerEnt.close();
						  System.out.println("Tout va bien :) Les entraineurs sont biens lus et enregistrés dans votre liste d'entraineurs ! !");
	            	break;

	            	case 3:
	            		System.out.println("donner le nom de l'equipe (Q pour quitter) :");
						String nomtemp = Sc.nextLine();
						if(nomtemp.equals("Q")) break;
						while(MaCompetition.getEquipeByName(nomtemp) != null){
	            			
							System.out.println("L'equipe existe deja !");
							nomtemp = Sc.nextLine();
	            			if(nomtemp.equals("Q")) break;	
						}
						System.out.println("Donner le nom de l'entraineur:");
						String nomEntrain = Sc.nextLine();
						while(MaCompetition.getEntraineurByName(nomEntrain) != null){
							System.out.println("L'entraineur existe !");
						}
						System.out.println("Donner l'age de l'entraineur: ");
						int ageEntrain = Sc.nextInt();
						Entraineur entrainAux = new Entraineur(nomEntrain,ageEntrain);
						MaCompetition.addEntraineur(entrainAux);
						Equipe equipeAux = new Equipe(nomtemp, entrainAux);
						MaCompetition.addEquipe(equipeAux);
	            		System.out.println("Donner les joueurs de l'equipe(somme suit) :");
	            		System.out.println("Nom,age,numMaillot,Poste,type");
						System.out.println("Donner le nom du fichier CSV: ");
						Sc.nextLine();
						String filenameEq = Sc.nextLine();
						Scanner scannerEq = new Scanner(new File(filenameEq));
 				    scannerEq.useDelimiter(",|\\n");
					    while(scannerEq.hasNext()){
       				  String temp1=scannerEq.next();
						   String temp2=scannerEq.next();
						   String temp3 = scannerEq.next();
						   String temp4 = scannerEq.next();
						   String temp5 = scannerEq.next();
						  int ageAux = Integer.parseInt(temp2);
						  int numAux = Integer.parseInt(temp3);
						  Joueur joueurAux = new Joueur(temp1, ageAux, equipeAux, numAux, temp4);
						  if(temp5.contains("titulaire")){
							equipeAux.addTitulaire(joueurAux);
						  }else{
							  equipeAux.addRemplacant(joueurAux);
						  }
    					}
						   scannerEq.close();
						  System.out.println("Tout va bien :) La nouvelle equipe est bien Enregistré !");
					break;
					
					case 4:
						break;

	            }
		 break;


		 
		                 
		   
		 
		 
		case 0: System.exit(0);
		
		}
		
		}
		
        Sc.close(); // Fermer le Scanner
        System.gc(); // Garbage Collector
        
		}
	
	}
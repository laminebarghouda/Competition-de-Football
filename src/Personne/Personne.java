package Personne;

public abstract class Personne {
protected String nom;
protected int age;

public Personne(String nom,int age) {
	this.nom= nom;
	this.age= age;
}

public abstract void Afficher();

}
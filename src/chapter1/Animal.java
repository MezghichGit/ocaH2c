package chapter1;

import java.util.Date;
import static chapter2.Calcul.*;
public class Animal {
	String nom; // attribut d'instance
	int age;    // attribut d'instance
	static int nb; // attribut de classe
	Date datNaiss;
	
	public void info() { // méthode d'instance
		System.out.println("Nom :"+ this.nom +" Age :"+ this.age);
	}
	public static void callCalcul()
	{
		div(12.5,14.5);
		System.out.println("PI :"+ pi);
	}
	
	public static void getNbAnimal() { // méthode de classe
		System.out.println("NB Animal :"+ nb);
		//this.age = 0;
		Animal a = new Animal();
		a.age = 10;
	}
	
	public Animal() {System.out.println("Constructeur par défaut");}
	public Animal(String nom, int age) {System.out.println("Constructeur avec param");}
	
	{
		System.out.println("Bloc 1 d'initialisation d'instance");
	}
	
	static {
		System.out.println("Bloc d'initialisation de classe");
	}
	
	{
		System.out.println("Bloc 2 d'initialisation d'instance");
	}
}

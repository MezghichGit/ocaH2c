package chapter5.polymorphisme;

public class TestPolymorphism {

	public static void main(String[] args) {
		Animal a = new Animal();
		a = new Oiseau(); // upcasting
		Oiseau o = new Oiseau();
		 //a = o;  // OK c'est upcasting
		 o = (Oiseau)a;    // KO c'est downcasting
	}

}

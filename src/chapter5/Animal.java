package chapter5;

public abstract class Animal {
	int age;
	String espece;
	public void manger() {
		System.out.println("Je veux manger");
	}
	
	public abstract void seDeplacer();
}

package chapter4;

@FunctionalInterface
public interface Voiture {
	
	
	//public abstract void info(); //méthode abstraite
	
	public abstract boolean test(String ch);
	
	public default void info() {}
	
	public static void info2() {}

}

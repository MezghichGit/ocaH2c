package chapter3;

public class MainString {

	public static void main(String[] args) {
		/*
		String ch1 = "oca";
		String ch2 = "oca";
		String ch3 = new String("oca");
		String ch4 = new String("oca");
		System.out.println("ch3==ch4 :"+ (ch3  ==  ch4));
		System.out.println(ch1==ch2);
		System.out.println(ch1==ch3); //false
		System.out.println(ch1.equals(ch2));
		System.out.println(ch1.equals(ch3));
		double moy = 12.5;
		int age = 15;
		Animal a = new Animal();
		
		//La classe String est immutable
		String cours = "Java";
		cours = cours.concat("-JEE");
		System.out.println(cours);
		//La classe StringBuilder est mutable
		StringBuilder sb = new StringBuilder("Java");
		sb.append("-JEE");
		System.out.println(sb);
		*/
		/*
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));*/
		//System.out.println(2+1+"a");
		//System.out.println("a"+2+1);
		//System.out.println(3+6+"a"+2+1);
		/*int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four); 
		String res = 1 + 2 + three + four;*/
		/*String ch = "\t a  b";
		System.out.println(ch);
		System.out.println(ch.trim());
		System.out.println(ch);*/
		
		//Un StringBuilder se trouve dans le package java.lang
		/*
		StringBuilder sb = new StringBuilder(); // par défaut 16 Slot
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("abcabcabcabcabcABabcabcabcabcabcABCTT");
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
		/*
		StringBuilder sb = new StringBuilder(8);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("abcabcabc");
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
		String ch = "oca";
		StringBuilder sb = new StringBuilder(ch);
		sb.append("-ocp");
		ch = sb.toString();
		
	

	}

}

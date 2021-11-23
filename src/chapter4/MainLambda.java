package chapter4;

import java.util.function.Predicate;

public class MainLambda {

	public static void main(String[] args) {
		Predicate<String> pred = (String ch)->{return ch.contains("a");};
		System.out.println(pred.test("abcd"));
		Voiture v1 = s->s.length()==4;
		/*
		Voiture v2 = (String s)->{return s.startsWith("o");};
		
		Voiture v3 = (String s)->{return s.contains("o");};
		//v1 = v2;
		System.out.println(v2.test("oca"));*/
		
		//Calcul c1 = (int a, int b)->{return a+b;};
		
		Calcul c1 = (a,b)-> a+b;
		Calcul c2 = (int a, int b)->{return a*b;};
		
		System.out.println(c1.op(2, 3));
		System.out.println(c2.op(2, 3));
		
		

	}

}

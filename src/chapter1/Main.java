package chapter1;


import chapter2.chap21.*;
import chapter2.chap22.*;
import chapter2.chap22.A;

public class Main {

	public static void somme(int k, int ... t)
	{
		int res = 0;
		for(int i=0; i<t.length;i++)
		{
			res = res + t[i];
		}
		System.out.println("La somme  = "+ res);
	}
	public static void main(String[] args) {
		//int $ = 0;
		//int _ = 10;
		//System.out.println(_);
		//A aa = new A();
		//B b = new B();
		/*C c = new C();
		E e = new E();
		F f = new F();*/
		//chapter2.chap22.A  a = new chapter2.chap22.A();
		A  a1 = new A();
		a1.x = 20;
		A  a2 = new A();
		A  a3 = new A();
		a3=null;
		
		a1=a2;
		System.gc();
		for(int i=0; i<1000;i++) {System.out.println(i);}
		//System.out.println(a1.x);
		System.out.println("Suite du programme");
		//int x;
		//System.out.println(x);
		/*somme(1);
		somme(10);
		somme(10,2, 1,10);*/
		//Animal a1 = new Animal();
		//Animal a2 = new Animal();
		/*System.out.println(a1.nom);
		System.out.println(a1.age);
		System.out.println(Animal.nb);
		System.out.println(a1.nb);
		Animal.getNbAnimal();*/
	}

}

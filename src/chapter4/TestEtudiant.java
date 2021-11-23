package chapter4;

public class TestEtudiant {
	
	public static void permut(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void modifSB(StringBuilder sb)
	{
		sb.append("-oca");
		System.out.println("sb = "+ sb);
	}

	public static void modiString(String sb)
	{
		sb = sb.concat("-oca");
		System.out.println("sb = "+ sb);
	}
	public static void main(String[] args) {
		
		//StringBuilder s = new StringBuilder("Java");
		//modifSB(s);
		//System.out.println("s = "+ s);
		String ch = new String("OCA");
		modiString(ch);
		System.out.println("ch = "+ ch);
		/*
		int x = 10;
		int y = 20;
		permut(x,y);
		System.out.println("x= "+x);
		System.out.println("y= "+y);*/
		/*
		Etudiant e = new Etudiant(10);
		e.age = 22;
		e.num = 10;
		e.nom="Amine";
		final int x = 10;
		//x = 12;
		
		try {
			e.info();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			//e1.printStackTrace();
			System.out.println("Probleme");
		}*/

	}

}

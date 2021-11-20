package chapter2.statements;

enum Jour {Lundi, Mardi};
public class Main {
	public static void main(String[] args) {
	     /*
		Jour day = Jour.Lundi;
	     switch(day) {
	     case Lundi:System.out.println("Lundi"); break;
	     }
		int x = 15;
		switch(x) {
		
		case 10 : System.out.println("10"); break;
		case 20 : System.out.println("20"); break;
		case 30 : System.out.println("30"); break;
		//default : System.out.println("Je sais pas");

		}
		*/
		
		outer : for(int i=0; i<10; i++)
		{
			for(int j=0; j<10;j++)
			{
				if(j==5) continue outer;
				System.out.println("i,j="+i+","+j);
			}
		
		}
		System.out.println("Suite du programme");
		
		int tab[]= {10,20,14,25};
		for(int e : tab)
		{
			System.out.println(e);
		}
	}
}

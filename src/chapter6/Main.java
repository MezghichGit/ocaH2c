package chapter6;

public class Main {

	public static void main(String[] args) {
		int x = 3;
		int y = 3;
		String ch = null;
		try {
			System.out.println("Message");
		    System.out.println(x/y);
		    System.out.println(ch.length());
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Problème" + e.getMessage());
			e.printStackTrace();
			return;
		}
		
		finally {
		System.out.println("Suite du programme");
		}

	}

}

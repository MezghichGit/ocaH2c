package chapter4;

public class TestEtudiant {

	public static void main(String[] args) {
		Etudiant e = new Etudiant();
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
		}

	}

}

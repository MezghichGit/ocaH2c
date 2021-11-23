package chapter4;

public  class Etudiant {
	
	public Etudiant() {
		System.out.println("Constructeur par defaut");
	} // constructeur par défaut
	public Etudiant(int cin) {
		
		this(); // appel au constructeur par défaut
		System.out.println("Constructeur avec 1 param");
	}
	public Etudiant(int cin, int age) {
		this(20); // appel au constructeur avec un seul paramètre
	}
	
	private int cin;
	int age; // visibilité default; package private
	protected int num;
	public String nom;
	
	
	 public void info() throws Exception{
		System.out.println(this.cin +" "+ this.num+" "+this.nom);
		//throw new Exception();
	}
	 
	 public void info(int x) throws Exception{
			System.out.println(this.cin +" "+ this.num+" "+this.nom);
			//throw new Exception();
		}
	
	

}

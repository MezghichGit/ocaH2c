package chapter4;

public  class Etudiant {
	
	public Etudiant() {
		System.out.println("Constructeur par defaut");
	} // constructeur par d�faut
	public Etudiant(int cin) {
		
		this(); // appel au constructeur par d�faut
		System.out.println("Constructeur avec 1 param");
	}
	public Etudiant(int cin, int age) {
		this(20); // appel au constructeur avec un seul param�tre
	}
	
	private int cin;
	int age; // visibilit� default; package private
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

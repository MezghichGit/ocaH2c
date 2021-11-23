package chapter4;

public  class Etudiant {
	
	public Etudiant() {} // constructeur par défaut
	public Etudiant(int cin) {
		
		this(); // appel au constructeur par défaut
	}
	public Etudiant(int cin, int age) {}
	
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

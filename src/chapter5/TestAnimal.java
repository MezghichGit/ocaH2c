package chapter5;

public class TestAnimal {

	public static void main(String[] args) {
		Animal tab[] =new Animal[4]; // tab est une structeure polymorphe générique
		tab[0] = new Poisson();
		tab[1] = new Oiseau();
		tab[2] = new Serpent();
		tab[3] = new Chat();
		
		for(Animal a : tab)
		{
			a.seDeplacer();
		}

	}

}

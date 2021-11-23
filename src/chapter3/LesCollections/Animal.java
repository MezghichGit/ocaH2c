package chapter3.LesCollections;

import java.util.ArrayList;

public final class Animal {
	
	private final ArrayList<String>foods;
	public Animal(ArrayList<String> plats)
	{
		this.foods = new ArrayList(plats);
	}

	public ArrayList<String> getFoods() {
		return new ArrayList(foods);
	}

	public static void main(String[] args) {
		ArrayList<String> plats = new ArrayList<>();
		plats.add("meat");
		plats.add("fish");
		Animal a = new Animal(plats);
		//System.out.println(a.getFoods());
		ArrayList<String>l2 = a.getFoods();
		//plats.clear();
		l2.clear();
		System.out.println(a.getFoods());

	}

}

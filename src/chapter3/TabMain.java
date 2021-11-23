package chapter3;

import java.util.Arrays;

public class TabMain {

	public static void main(String[] args) {
		// declaration
		/*int tab[];
		int [] tab2;*/
		
		// initialisation
		/*
		int tab[]= new int[3];
		tab[0]=100;
		tab[1]=200;
		tab[2]=300;
		int tab2[]= {10,4,20,19};
		System.out.println(tab);
		Animal ta[] = new Animal[2];
		System.out.println(ta);*/
		
		// Tableau à plusieurs dimensions
		/*
		int tab[][] = new int[3][];
		tab[0] = new int[2];
		tab[1]= new int[6];
		tab[2]= new int[4];
		
		tab[0][1]=20;
		tab[2][2]=6;
		for(int t[] : tab)
		{
			for(int e : t)
			{
				System.out.print(e +"\t");
			}
			System.out.println();
		}*/
		
		int tab[]= {10,5,8,1};
		Arrays.sort(tab);
		for(int e:tab)
		{
			System.out.println(e);
		}
		

	}

}

package chapter2;

public class Main {

	public static void main(String[] args) {
	/*System.out.println(Byte.MAX_VALUE);
	System.out.println(Byte.MIN_VALUE);
	
	System.out.println(Short.MAX_VALUE);
	System.out.println(Short.MIN_VALUE);*/
		
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Long.MAX_VALUE);
		//System.out.println(Short.MIN_VALUE);
		/*
		int x= 2147483647;
		long y = 2147483648;
		double p = 12.5;
		float q = 12.5;*/
		
		/*int x = 10_000_000;
		
		double k = 12.5;
		//int b = 0X12F3;
		//int b = 0b11;
		int b = 014;
		System.out.println(b);*/
		/*
		int x = 10,y =20, z = 3;
		int k = ++x + 3 * x + 2*--y + ++y -2 * ++z;
		//int y = x++;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(k);*/
		/*byte x = 127;
		byte y = (byte)129;
		System.out.println(y);
		//int z = x + y;*/
		/*Animal a = new Oiseau();
		boolean res = a instanceof Animal;
		boolean res2 = a instanceof Oiseau;
		System.out.println(res);
		System.out.println(res2);*/
		int x = 10;
		int y = 20;
		int z = 30;
		if(x==y) System.out.println("Ok");
		boolean res = (x>y)||(++y>z);
		System.out.println("res="+res);
		System.out.println("x="+x);
		System.out.println("y="+y);
		

	}

}

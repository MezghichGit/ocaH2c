package chapter2.chap22;

public class A {

	public int x = 10;
	protected void finalize()
	{
		System.out.println("Destruction");
	}
}

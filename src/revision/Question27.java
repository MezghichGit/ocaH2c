package revision;

public class Question27 {

	public static void main(String[] args) {
		float var1 = (12_345.01>123_45.00)?12_456:124_56.02f;
		float var2 = var1 + 1024;
		System.out.println(var2);
		StringBuilder sb = new StringBuilder("1234-5678-9101-1121");
		String x = "xxxx-xxxx-xxxx-";
		//String temp = 
				sb.substring(15, 19); // renvois un String
		String ch = x + sb;
		System.out.println(ch);
		
		System.out.println("Question 31");
		String str = " ";
		//str=str.trim();
		str.trim();
		System.out.println(str.equals("")+" "+str.isEmpty());

	}

}

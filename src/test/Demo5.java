package test;

public class Demo5 {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(5 *4 + 2 / 3 + (10 % 2) + (i++));
		/*
		 * 5 * 4 + 2 / 3 + 0 + (i++)
		 * 
		 * 5 * 4 + 2 / 3 + 0 + 10
		 * 
		 *  20 + 2 / 3 + 0 + 10
		 *  
		 *  20 + 0 + 0 + 10;
		 */
	}
	/*public static void main(String[] args) {
		int age = 17;
		String result = age >=18?"成年人":"未成年人";
		System.out.println(result);
	}*/
}

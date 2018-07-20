package test;

public class Demo {

	public static void main(String[] args) {
		// byte short char 运算后，会自动装成int
		// 不同的数据类型运算后结果是最大的类型
		
		int i = 10;
		long l = 20;
		byte b = 5;
		l = i + l + b;
/*		byte b1 = 5;
		byte b2 = 3;
		b1 = (byte)(b1 + b2);*/
				
	/*	byte b = 5;
		short s = b;
		int i = s;
		long l = i;*/
	//	int i = 128;
		//byte b = (byte)i;
	//	System.out.println(b);
	//	System.out.println(Integer.toBinaryString(128));
	//	System.out.println(Integer.toBinaryString(-7));// 原码 --->去反 ---->加一
		// 00000000- 00000000 -00000000- 10000000
		// 10000000  补码
		
		// 00000111 // 7的原码
		// 11111000
		// 11111001
	}
}

package test;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		int workAge = 1;
		
		/*if(workAge >=2){
			System.out.println("通知来面试");
		}*/
		
	/*	if(workAge >=2){
			System.out.println("通知来面试");
		}else{
			System.out.println("不要来面试了");
		}*/
	/*	int num = 8;
		if(num==1){
			System.out.println("星期一");
		}else if(num==2){
			System.out.println("星期二");
			
		}else if(num==3){
			System.out.println("星期三");
			
		}else if(num==4){
			System.out.println("星期四");
			
		}else if(num==5){
			System.out.println("星期五");
			
		}else if(num==6){
			System.out.println("星期六");
			
		}else if(num==7){
			System.out.println("星期日");
			
		}else{
			System.out.println("错误的星期");
		}*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个成绩:");
		int score = input.nextInt();
		
		if(score>=90 && score <=100){
			System.out.println("A");
		}else if(score>=80 && score <=89){
			System.out.println("B");
		}else if(score>=70 && score <=79){
			System.out.println("C");
		}else if(score>=60 && score <=69){
			System.out.println("D");
		}else if(score>=0 && score <=59){
			System.out.println("E");
		}else{
			System.out.println("缺考");
		}
	}
}

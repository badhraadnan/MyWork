package exceptionExample;

import java.util.Scanner;
public class exceptionex {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Value of A");
		a=sc.nextInt();
		System.out.println("enter Value of B");
		b=sc.nextInt();
		
		try {
			int Result = a/b;
			System.out.println(Result);
		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}

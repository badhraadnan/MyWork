package final1;

import java.io.*;
import java.util.Scanner;
public class Final1 {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter length:- ");
			int length=Integer.parseInt(br.readLine());
			System.out.println("Enter breadth:- ");
			int breadth=Integer.parseInt(br.readLine());
			int area=length*breadth;
			System.out.println("Area is"+area);
			Final1 f=new Final1();
			
		}
		
		catch(Exception e) {
			
		}
	}

}

package sample;

import java.util.Scanner;

public class prime {
	
	public static void main(String[] args) {
		
		Scanner athul=new Scanner(System.in);
		int n,i,flag=0;
		System.out.println("enter a number");
		n=athul.nextInt();
		
		for(i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=1;
				break;
				
			}
		}if(flag==0) {
			System.out.println("the enterd number  is prime");
		}else {
			System.out.println("not a prime");
		}athul.close();
		
	
	}
	
	
	

}

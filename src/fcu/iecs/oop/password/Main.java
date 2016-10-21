package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		PasswordEncorder s=new PasswordEncorder();
		
		String Pass;
		boolean check=true;
		
		System.out.println("Please enter a password, enter exit to end input.");
		do{
			Pass = scn.next();
			if(Pass.equalsIgnoreCase("exit")){
				check=false;
			}
			else{
				System.out.println(s.encode(Pass));	
			}
		}while(check);
		
	}

}

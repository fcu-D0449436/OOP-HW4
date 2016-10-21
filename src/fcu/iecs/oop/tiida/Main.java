package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		NissanTiida s = new NissanTiida();
		
		System.out.println("Please enter a number.");
		
		int num = scn.nextInt();
		int i;
		for(i=1;i<=num;i++)
		{
			s.tiida();
		}
	}

}

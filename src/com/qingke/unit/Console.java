package com.qingke.unit;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	static {
		sc = new Scanner(System.in);
	}
	
	public static String waitPrint(){
		return sc.nextLine();
	}
	
	public static void printNote(String note){
		System.out.println(note);
	}
}

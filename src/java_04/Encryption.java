package java_04;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		//	int data = 'C';
		//	char data2 =65;
		//	System.out.println(data);
		//	System.out.println(data2);
		
		String pw =null;
		System.out.println("PW : ");
		pw = new Scanner(System.in).next();
		System.out.println("Encrypted PW : ");
		for(int i = 0; i < pw.length(); i++) {
			System.out.print((char)(pw.charAt(i)-10));
		}
		
	}

}

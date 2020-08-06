package java_04;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		//	int data = 'C';
		//	char data2 =65;
		//	System.out.println(data);
		//	System.out.println(data2);
			
		String pw = "";
		String enPw = "";
		System.out.print("PW : ");
		pw = new Scanner(System.in).next();
		System.out.print("Encrypted PW : ");
		
		for(int i = 0; i < pw.length(); i++) {
			enPw += ""+(char)(pw.charAt(i)-10);
		}
		System.out.print(enPw);
		
		
	}

}

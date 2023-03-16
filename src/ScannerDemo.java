import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			System.out.println("ENTER YOUR NAME: ");
			String name=s.nextLine();
			System.out.println("ENTER YOUR AGE: ");
			int age=s.nextInt();
			System.out.println("ENTER YOUR GENDER:");
			char gender=s.next() .charAt(0);
			System.out.println("ENTER YOUR PHONE NUMBER: ");
			long phonenumber=s.nextLong();		
			
System.out.println("NAME IS:" +name);
System.out.println("AGE IS:" +age);
System.out.println("GENDER IS:" +gender);			
System.out.println("PHONE NUMBER IS" +phonenumber);			

		
		
		
		

	}

}

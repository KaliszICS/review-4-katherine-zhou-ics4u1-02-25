import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner (System.in);
		System.out.print("Input an integer: ");
		String a = input.nextLine();
		String b = 5 + a;
		System.out.println(Integer.parseInt(b)+5);

		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		String c = input.nextLine();
		c= 4 + c + 3;
		System.out.println((Double.parseDouble(c)) + 3.4);
		
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String e = input.nextLine();
		System.out.println(!(Boolean.parseBoolean(e)));
		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String f = input.nextLine();
		String g = (f + 3);
		int h = ((Integer.parseInt(g)) + 2);
		System.out.println((char)h);

	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String i = ((input.nextLine()) + 1);
		int j = Integer.parseInt(i);
		int k = j/2;
		System.out.println(k + 0.0);
		

		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner input = new Scanner(System.in);
		String o = (1 + (input.nextLine()));
		Double m = Double.parseDouble(o);
		System.out.println((int)m);
		input.close();

		
	}

}

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
		System.out.printin(Integer.parseInt(b)+5);

		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		String c = input.nextLine();
		String d = ((4 + c)+3);
		System.out.println((Double.parseDouble(d)) + 3.2);
		
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
		String f = input.nextline();
		String g = (f + 3);
		h = ((Integer.parseInt(g)) + 2);
		System.out.println((char)h);

	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String i = ((input.nextLine()) + 1);
		j = Interger.parseInt(i);
		k = j/2;
		System.out.println(Double.parseDouble(k));
		

		
	}

	public static void q6() {
		//Write question 6 code here
		Scanner input = new Scanner(System.in);
		String l = (1 + (input.nextLine()));
		l = Double.parseDouble(l);
		System.ou.println((int)l);
		input.close();

		
	}

}

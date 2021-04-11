import java.util.Scanner;

public class Deci_MakeProg {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your response (1 to 3): ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		switch(input) {
		case 1  : System.out.println("hi");
		break;
		case 2: System.out.println("hello");
		break;
		case 3 : System.out.println("welcome");
		break;
		default :System.out.println("invalid input");
	}

}
}

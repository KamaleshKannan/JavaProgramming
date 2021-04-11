import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		System.out.println("Enter your salary : ");
		 * Scanner s = new Scanner(System.in);
		input = s.nextInt();
		if(input<20000)
			System.out.println("Your tax value is 3%");
		else if(input<40000)
			System.out.println("Your tax value is 5%");
		else if(input<60000)
			System.out.println("Your tax value is 7%");
		else
			System.out.println("Your tax value is 10%");
		
		
		}
	}

}

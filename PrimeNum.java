import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,flag=0;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0||n==1)
			System.out.println(n+" is neither Prime nor Composite");
		else {
			for(i=2;i<n;i++) {
				if(n%i==0) { 
					System.out.println(n+" is a Composite Number");
					flag = 1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(n+" is a Prime Number");
			}
			}
		}
		
	}



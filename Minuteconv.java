import java.util.Scanner;

public class Minuteconv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year, day, rem_minute;
		System.out.println("Enter the number of minutes : ");
		Scanner s = new Scanner(System.in);
		int minutes = s.nextInt();
		
		year = minutes/525600;
		rem_minute = minutes %525600;
		day = rem_minute/1440;
		System.out.println("Year : "+year);
		System.out.print("Days : "+day);
	}
	}

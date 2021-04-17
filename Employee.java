
public class Employee {

	
		// TODO Auto-generated method stub
		int year;
		String name;
		String address;
	}
	class empl{
		public static void main(String[] args) {
			Employee e1 = new Employee();
			Employee e2 = new Employee();
			Employee e3 = new Employee();
			e1.year = 1994;
			e1.name = "Robert";
			e1.address = "64C - Wall Street";
			e2.year = 2000;
			e2.name = "Sam";
			e2.address = "68D - Wall Street";
			e3.year = 1999;
			e3.name = "John";
			e3.address = "26B - Wall Street";
			System.out.println("Name\tYear of joining\t\tAddress");
			System.out.println(e1.name+"\t"+e1.year+"\t\t"+e1.address);
			System.out.println(e2.name+"\t"+e2.year+"\t\t"+e2.address);
			System.out.println(e3.name+"\t"+e3.year+"\t\t"+e3.address);
		}
		
	}



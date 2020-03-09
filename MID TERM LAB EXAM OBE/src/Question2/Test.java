package Question2;

public class Test 

{

	public static void main(String[] args) 
	
	{    
		Person P1 = new Person ( " Fahim ", " Dhaka ");
		Student S1 = new Student ( " Fahim ", " Dhaka ", " CSE ", 2020, 65000.00 );
		Staff S2 = new Staff (" Fahim " , " Dhaka ", " AIUB " , 222000.00 );
		
		System.out.println(P1);
		System.out.println(S1);
		System.out.println(S2);
		
		System.out.println();
		
		
		S1.ShowStudent();
		S2.ShowStaff();
		
		}


}


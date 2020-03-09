package Question2;

public class Student extends Person

{
     
	private String program;
	private int year;
	private double fee;
	
	
	public Student() 
	{
		
	}

	public Student(String name, String address, String program, int year, double fee) 
	
	{
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
		
	}

	public String getProgram() 
	{
		return program;
	}

	public void setProgram(String program) 
	{
		this.program = program;
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}

	public double getFee() 
	{
		return fee;
	}

	public void setFee(double fee) 
	{
		this.fee = fee;
	}


	/**public String toString()     // Normal String to String
	
	{
		return "Student [program=" + program + ", year=" + year + ", fee=" + fee + "]";
		
	}**/
	
	public String toString() //Inherited String to String 
	
	{
		return "Student [program=" + program + ", year=" + year + ", fee=" + fee + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
	public void ShowStudent()
	{
		
		super.ShowPerson();
		System.out.println(" Program  : " + program);
		System.out.println(" Year : " + year);
		System.out.println(" Fee  : " + fee);
		
		
	}

	
}

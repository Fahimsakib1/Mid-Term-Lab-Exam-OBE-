package Question2;

public class Staff extends Person

{
      
	private String school;
	private double pay;
	
	
	
	
	public Staff() 
	{
		super();
	}

	public Staff(String name, String address, String school, double pay) 
	
	{
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() 
	{
		return school;
	}

	public void setSchool(String school) 
	{
		this.school = school;
	}

	public double getPay() 
	{
		return pay;
	}

	public void setPay(double pay) 
	{
		this.pay = pay;
	}

	
	/**public String toString() // Normal String to String
	
	{
		return "Staff [school=" + school + ", pay=" + pay + "]";
	}**/
	
	
	
	public String toString() // Inherited String to String
	{
		return "Staff [school=" + school + ", pay=" + pay + ", getName()=" + getName() + ", getAddress()="
				+ getAddress() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	public void ShowStaff()
	{
		
		//super.ShowPerson();
		System.out.println(" School  : " + school);
		System.out.println(" Pay : " + pay);
		
	}

	
	
	
}

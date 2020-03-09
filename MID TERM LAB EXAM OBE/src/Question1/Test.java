package Question1;

public class Test 

{

	public static void main(String[] args) 
	
	{
		   Document D1 = new Document("Mario Rossi", "My first document");
	       System.out.println(D1);
	       D1.CreateCopies(12);
	       D1.SellCopies(4);
	      
	       System.out.println("Information on the document:");
	       
	       System.out.println();
	       
	       System.out.println("Author: " + D1.getAuthor());
	      System.out.println("Title:  " + D1.getTitle());
	       System.out.println("Now Copies are available : " + D1.getNmbCopy());
	       
	       D1.CreateCopies(10);
	       D1.SellCopies(5);
	       
     }

}

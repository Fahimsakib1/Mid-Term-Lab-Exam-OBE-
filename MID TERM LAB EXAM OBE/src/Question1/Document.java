package Question1;

public class Document 

{
	public String author;
	public String title;
	public int NmbCopy;
	
	
	public Document(String author, String title) 
	
	{
		super();
		this.author = author;
		this.title = title;
		this.NmbCopy=0 ;
		
	}



	public String toString()
	{
		return "Document [Author=" + author + ", title=" + title + "]";
	}
	
	public void CreateCopies(int n)
	{
		
		NmbCopy=NmbCopy+n;
		System.out.println("Number of copies : " + NmbCopy);
		
	}
	
	public void SellCopies(int n)
	{
		
		NmbCopy=NmbCopy-n;
		System.out.println("After Sell  Number of copies : " + NmbCopy);
		
	}



	public String getAuthor() 
	{
		return author;
	}



	public void setAuthor(String author) 
	{
		this.author = author;
	}



	public String getTitle() 
	{
		return title;
	}

    public void setTitle(String title)
	{
		this.title = title;
	}



	public int getNmbCopy() 
	
	{
		return NmbCopy;
	}



	public void setNmbCopy(int nmbCopy) 
	{
		NmbCopy = nmbCopy;
	}
	
}

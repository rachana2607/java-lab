class Student
{
	final String university="GITAM Bengaluru";
	String name;
	public void getInput(String name)
	{
		this.name=name;
	}

	public void display() 
	{
		System.out.print("\nName: "+ name + "\n University: " + university);
	}
}

class This_Final_Finalize_Working
{
	public static void main(String args[])
	{
		Student st= new Student();
		st.getInput("NB Rachana");
		st.display();
		System.out.print("\nHashcode is: " + st.hashCode());
		st = null; 
		System.gc();
		System.out.print("\nEnd of the garbage collection");
	}
	
	protected void Finalize()
	{
		System.out.print("\nCalled the finalize() method");
	}
}
class VariableLenArgu
{
	public static void main(String args[])
	{
		System.out.print("\nProgram to display the variable lenght Arguments passing ....\n");
		VariableArgu va = new VariableArgu();
		System.out.print("\nOnly one Arguments ------\n");
		va.print_arguments("Rakshitha");
		System.out.print("\nMultiple Arguments ------\n");
		va.print_arguments("Lekha\n", "Rakshitha\n", "Absha\n");

	}
}

class VariableArgu
{
	void print_arguments(String... str)
	{
		for(String s:str)
			{
				System.out.print(s);
			}
	}
}
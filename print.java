class print
{
	public static void main(String[] args) 
	{	

		//System - class
		//out - static object of PrintStream
		//      by default point to the system output device
		//println - method of the PrintStream


		//gives the cursor in the next line after printing and return none println method
		System.out.println("hello world");
		//gives the cursor in the same line after printing
		System.out.print("hello world\n");
		//same as c or c++ print function and return PrintStream class object maybe
		System.out.printf("Hello %s","world");
	}
}
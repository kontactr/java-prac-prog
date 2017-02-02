class short_hand
{
	public static void main(String[] args) {
		byte b = 5,e;
		e =(byte) (b * 10.0); 
		 //gives error because of return value which is in form of big datatype 
		 // so require to convert the datatype in appropriate form

		System.out.println(e);
		b *= 10.0;
		System.out.println(b);

		//always accept same value not covert means
		// Double f = 1; invalid
		// Double f = 1.0; valid
		// double f = 1; valid
		//double f = 1.0; valid
		Double f=1.0;
		//always return  value which datatype has as same as left side container
		f*=5.0F; 
		System.out.println(f instanceof Double); 
		//System.out.println(f instanceof Float); // gives error because not inherited...
	}
}
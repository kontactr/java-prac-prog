class number
{
	public static void main(String[] args) {
		
		//octal 
		int i = 0100; 
		System.out.println(i);

		//hex
		i = 0x40;
		System.out.println(i);
		i = 0X40;
		System.out.println(i);

		//dec
		i = 64;
		System.out.println(i);

		//bin
		i = 0b1000000;
		System.out.println(i);
		i = 0B1000000;
		System.out.println(i);
		i = 0b10_00_000;
		System.out.println(i);
		i = 0B10_00_000;

	}
}
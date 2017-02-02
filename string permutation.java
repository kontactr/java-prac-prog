import java.util.*;

class ws
{
	public static boolean check(String s , int k)
	{
		int val = 0;
		for(int j=0;j<s.length();j++)
		{
			val+= ((int)s.charAt(j) - 96);
		}
		if(val == k)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int case1 = s1.nextInt();
		while(case1-- != 0) {
		int k = s1.nextInt();
		String str = s1.next();
		String s = "";
		int count = 0;
			for(int k1=0;k1<str.length();k1++)
			{
				 s = "";
				for(int l=k1;l<str.length();l++)
				{
					s += str.charAt(l);
					if(check(s,k))
						count++;
				}
			}
			System.out.println(count);
	}
}
}
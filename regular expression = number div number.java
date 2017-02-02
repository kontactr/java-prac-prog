import java.util.*;

class reg
{
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		String str = s1.next();
		String arr[] = str.split("/");
		int state = 0;
		if(Integer.parseInt(arr[1]) == 0)
			state = 9;
		else
		{
		for(int j=0;j<str.length();j++)
		{
			if(j==0 && ((str.charAt(j) == '+') || (str.charAt(j) == '-') ||(((int)str.charAt(j)) >=48 && ((int)str.charAt(j)) <=57)))
			{
				state = 1;
				//System.out.println(str.charAt(j)+" "+state);
			}
			else if(j!=0 && state==1 && (((int)str.charAt(j)) >=48 && ((int)str.charAt(j)) <=57))
			{
				state = 1;
				//System.out.println(str.charAt(j)+" "+state);
			}
			else if(j!=0 && state==1 && str.charAt(j) == '/')
			{
				state = 2;
				//System.out.println(str.charAt(j)+" "+state);
			}
			else if(j!=0 && state== 2 && ((((int)str.charAt(j)) >=48 && ((int)str.charAt(j)) <=57) || str.charAt(j) == '+'))
			{
				state = 3;
				//System.out.println(str.charAt(j)+" "+state);
			}
			else if(j!=0 && state==3 && (((int)str.charAt(j)) >=48 && ((int)str.charAt(j)) <=57))
			{
				state = 3;
				//System.out.println(str.charAt(j)+" "+state);
			}
			else
			{
				state = 5;
				break;
			}
		}
	}
		if(state == 3)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
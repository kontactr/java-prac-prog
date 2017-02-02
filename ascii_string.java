import java.io.*;

class ascii_string
{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int case1 = Integer.parseInt(br.readLine());
		while(case1-- != 0)
		{
			int size = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String ans = "";
			for(int j=0;j<str.length();j++)
			{
				int c_val = (int)str.charAt(j);
				if(c_val <= 67)
				{
					ans += "C";
				}
				else if(c_val >= 67 && c_val <= 71)
				{
					ans += Math.abs(c_val - 67) <= Math.abs(c_val - 71) ? "C" : "G";
				}
				else if(c_val >= 71 && c_val <= 73)
				{
					ans += Math.abs(c_val - 71) <= Math.abs(c_val - 73) ? "G" : "I";
				}
				else if(c_val >= 73 && c_val <= 79)
				{
					ans += Math.abs(c_val - 73) <= Math.abs(c_val - 79) ? "I" : "O";
				}
				else if(c_val >= 79 && c_val <= 83)
				{
					ans += Math.abs(c_val - 79) <= Math.abs(c_val - 83) ? "O" : "S";
				}
				else if(c_val >= 83 && c_val <= 89)
				{
					ans += Math.abs(c_val - 83) <= Math.abs(c_val - 89) ? "S" : "Y";
				}
				else if(c_val >= 89 && c_val <= 97)
				{
					ans += Math.abs(c_val - 89) <= Math.abs(c_val - 97) ? "Y" : "a";
				}
				else if(c_val >= 97 && c_val <= 101)
				{
					ans += Math.abs(c_val - 97) <= Math.abs(c_val - 101) ? "a" : "e";
				}
				else if(c_val >= 101 && c_val <= 103)
				{
					ans += Math.abs(c_val - 101) <= Math.abs(c_val - 103) ? "e" : "g";
				}
				else if(c_val >= 103 && c_val <= 107)
				{
					ans += Math.abs(c_val - 103) <= Math.abs(c_val - 107) ? "g" : "k";
				}else if(c_val >= 107 && c_val <= 109)
				{
					ans += Math.abs(c_val - 107) <= Math.abs(c_val - 109) ? "k" : "m";
				}
				else if(c_val >= 109 && c_val <= 113)
				{
					ans += Math.abs(c_val - 109) <= Math.abs(c_val - 113) ? "m" : "q";
				}
				else if(c_val >= 113)
				{
					ans += "q";
				}

			}
			System.out.println(ans);
		}
	}
}
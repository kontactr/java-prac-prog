import java.io.*;

class str_padr
{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int case1 = Integer.parseInt(br.readLine());
		while(case1-- != 0)
		{
			String str = br.readLine();
			StringBuilder sb = new StringBuilder(str);
			sb.reverse();
			if(str.equals(new String(sb)))
			{
				if(str.length() % 2 == 0)
					System.out.println("YES EVEN");
				else
					System.out.println("YES ODD");
			}
			else
				System.out.println("NO");
		}
			}
}
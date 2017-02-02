import java.net.*;
import java.io.*;

public class server{

 ServerSocket st;
 server(int port)throws Exception
 {
 	st = new ServerSocket(port);	
 }
public static void main(String[] args)throws Exception
 {
 	
 	
	server se = new server(9632);
 	Socket s = se.st.accept();
 		try {
		System.out.println("hello world");
	 DataInputStream in = new DataInputStream(s.getInputStream());
	 int  i = 0;
	 
	 //which means there are no loops for waiting in.readUtF() read all
	 //the data upto that time when client releases the stream of write
	 boolean g = in.readUTF().equals("1");

	 System.out.println(g);
//	{
//		i++;
//
	//	System.out.println("hello world in stream");
	//}
	System.out.println("1"+i);
	 DataOutputStream os = new DataOutputStream(s.getOutputStream());
	 os.writeUTF("hello world");
	 System.out.println("closing");
	 s.close();
	}catch(Exception e){
		System.out.println("Exception");
	}
 	
	
}
	
}


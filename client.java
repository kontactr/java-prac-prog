import java.net.*;
import java.io.*;
import java.util.*;
public class client {

   public static void main(String [] args)throws Exception {
         
         Scanner s1 = new Scanner(System.in);
         String serverName = args[0];
         int port = Integer.parseInt(args[1]);
   
    
         Socket cl = new Socket(serverName, port);
         System.out.println("connection");
      

         OutputStream outToServer = cl.getOutputStream();
         DataOutputStream out = new DataOutputStream(outToServer);
         String s = "";
         while(!(s1.next()).equals("1"))
         {
            System.out.println("hello");
         }
         s = "1";
         out.writeUTF(s);
         InputStream inFromServer = cl.getInputStream();
         DataInputStream in = new DataInputStream(inFromServer);
         
         System.out.println("Server says " + in.readUTF());
       
         cl.close();
      
   }
}
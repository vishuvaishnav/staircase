import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.*;
public class ServerSUM {
public static void main(String a[]) throws IOException
{
System.out.println("\n Welcome");
ServerSocket ss=new ServerSocket(9012);
System.out.println("\n Server Running......");
System.out.println("\n Server wait for client request.....");
Socket serobj=ss.accept(); //binding
System.out.println("\n Server accepted the Client Request....");
DataInputStream din=new DataInputStream(serobj.getInputStream());
String number1=din.readUTF();
String number2=din.readUTF();
System.out.println(number1);
System.out.println(number2);
int add=Integer.parseInt(number1) + Integer.parseInt(number2);
DataOutputStream dout=new DataOutputStream(serobj.getOutputStream());
dout.writeUTF("\nMessage From Server...." + "SUM is = " +
Integer.toString(add) + "\n");
}
}
[26/04, 10:57 am] +91 98308 66954: //ClientIp
import java.io.*;
import java.net.*;
import java.lang.*;
public class ClientSUM
{
public static void main(String args[]) throws IOException
{
Socket objclient = new Socket("localhost",9012);
DataOutputStream dout=new DataOutputStream(objclient.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));System.out.println("Enter First number:");
int num1=Integer.parseInt(br.readLine());
dout.writeUTF(Integer.toString(num1));
System.out.println("Enter SECOND number:");
int num2=Integer.parseInt(br.readLine());
dout.writeUTF(Integer.toString(num2));
}
}
DataInputStream din=new DataInputStream(objclient.getInputStream());
String msg2=din.readUTF();
System.out.println("CLient Received after calculation Result= " + msg2);
}}

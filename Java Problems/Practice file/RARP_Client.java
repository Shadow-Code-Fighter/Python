import java.net.*;
import java.io.*;
import java.util.Scanner;
public class RARP_Client {
 public static void main(String[] args) {
 try{
Socket s=new Socket("localhost",777);
DataOutputStream dout=new DataOutputStream(s.getOutputStream());
DataInputStream dis=new DataInputStream(s.getInputStream());
Scanner sc=new Scanner(System.in);
System.out.println("Enter MAC address");
 String msg=sc.next();
 dout.writeUTF(msg);   //MAC address sent to server
 String ip=(String)dis.readUTF();
 System.out.println(ip);
 s.close();
 }
 catch(Exception e){
 System.out.println(e);
 }
 }
 }

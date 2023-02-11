import java.net.*;
import java.io.*;

public class RARP_Server {
 public static void main(String[] args) {
 try{
 ServerSocket s=new ServerSocket(777);
 Socket ss=s.accept();
 DataOutputStream out=new DataOutputStream(ss.getOutputStream());
 DataInputStream in=new DataInputStream(ss.getInputStream());
 String msg=(String)in.readUTF();     //Read MAC address entered by user
 System.out.println("MAC address entered by user"+msg);
 String ip[]={"192.168.252.18","192.168.252.19"};
 String mac[]={"E8-9E-B5-04-C6-0F","E8-9E-B4-04-C6-0F"};
System.out.println("Number of IPs available"+ip.length);
 for(int i=0;i<ip.length;i++){
 if(msg.equals(mac[i])){
 String ans=ip[i];
 out.writeUTF(ans);
 }else{
 System.out.println(i+"Address didn't match");
 }
 }
 // System.out.println("message"+msg);
 s.close();
 }
 catch(Exception e){
 System.out.println(e);
 }

 } 
}
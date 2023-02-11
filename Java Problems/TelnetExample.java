import java.io.*;
import java.net.*;
public class TelnetExample{
    public static void main(String []args){
        throws IOException{
            telnet.connect("examle.com",80);

            BufferedReader in = new BufferedReader(new InputStreamReader(telnet.getInputStream()));
            PrintStream out = new PrintStream(telnet.getOutputStream());
            out.println("some command");
            out.flush();

            String response;
            while((response=in.readLine()) != null){
                System.out.println(response);
            }
        }
        telnet.disconnect();
    }
}
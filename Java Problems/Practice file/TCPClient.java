import java.io.*;
import java.net.*;

public class TCPClient {

    public static void main(String[] args) throws IOException {

        String hostname = "localhost";
        int port = 9999;

        Socket socket = new Socket(hostname, port);
        BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String serverResponse = input.readLine();
        System.out.println(serverResponse);
        socket.close();
    }
}

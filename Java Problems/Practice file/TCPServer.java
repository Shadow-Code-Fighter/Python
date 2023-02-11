import java.net.*;
import java.io.*;

public class TCPServer {
  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(9999);
    while (true) {
      Socket clientSocket = serverSocket.accept();
      PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
      out.println("Hello, client!");
      clientSocket.close();
    }
  }
}

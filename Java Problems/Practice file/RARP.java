import  java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
//import java.lang.NullPointerException.*;

public class RARP {
    public static void main(String[] args) throws UnknownHostException {
        try {
            String ipAddress = "192.168.255.41"; // IP address of the device
            InetAddress inetAddress = InetAddress.getByName(ipAddress);
            NetworkInterface networkInterface = NetworkInterface.getByInetAddress(inetAddress);
            byte[] hardwareAddress = networkInterface.getHardwareAddress();
            if (hardwareAddress != null) {
                System.out.print("Hardware address: ");
                for (int i = 0; i < hardwareAddress.length; i++) {
                    System.out.format("%02X%s", hardwareAddress[i], (i < hardwareAddress.length - 1) ? ":" : "");
                }
                System.out.println();
            } else {
                System.out.println("Unable to resolve hardware address for IP address " + ipAddress);
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class ARP {
    public static void main(String[] args) {
        try {
            // Get the local host's IP address
            InetAddress localhost = InetAddress.getLocalHost();
            String localIp = localhost.getHostAddress();

            // Get the local host's MAC address
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            byte[] mac = null;
            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                if (!ni.isLoopback() && ni.getInetAddresses().hasMoreElements()) {
                    mac = ni.getHardwareAddress();
                    break;
                }
            }
            if (mac == null) {
                throw new Exception("MAC address not found");
            }

            // Print the local IP and MAC addresses
            System.out.println("Local IP: " + localIp);
            System.out.println("Local MAC: " + byteArrayToHexString(mac));

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Helper function to convert a byte array to a hex string
    private static String byteArrayToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X ", b));
        }
        return sb.toString();
    }
}
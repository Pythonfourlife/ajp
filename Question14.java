import java.net.InetAddress;
import java.net.UnknownHostException;

public class Question14 {
    public static void main(String[] args) {
        String hostName = "www.example.com";

        try {
            InetAddress inetAddress = InetAddress.getByName(hostName);

            System.out.println("Host Name: " + inetAddress.getHostName());
            System.out.println("Host Address: " + inetAddress.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("Unable to find IP address for the host: " + hostName);
        }
    }
}

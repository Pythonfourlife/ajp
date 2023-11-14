import java.net.InetAddress;
import java.net.UnknownHostException;

public class Question15 {
    public static void main(String[] args) {
        String hostName = "www.youtube.com";

        try {
            for (InetAddress address : InetAddress.getAllByName(hostName)) {
                System.out.println("IP Address: " + address.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.err.println("Unable to find IP addresses for the host: " + hostName);
        }
    }
}

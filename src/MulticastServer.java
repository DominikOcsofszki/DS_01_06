import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class MulticastServer {

//    String ip = "255.6.7.8";
//    String ip = "224.0.0.1";
//    int port = 6789;

    public void sendMessage(String ip, int port, String message) throws Exception {

        DatagramSocket ds = new DatagramSocket();
        InetAddress inetAddress = InetAddress.getByName(ip);
        byte[] b = message.getBytes();

        DatagramPacket dp = new DatagramPacket(b, b.length, inetAddress, port);
        ds.send(dp);
        ds.close();
    }

    public static void main(String[] args) throws Exception {
        String ip = "224.6.7.8";
        System.setProperty("java.net.preferIPv4Stack", "true");


        int port = 6789;
        MulticastServer ms = new MulticastServer();
        ms.sendMessage(ip, port, "AASDASDASDASD");

    }
}

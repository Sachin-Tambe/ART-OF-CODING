import java.net.*;
public class example2 {
    public static void main(String[] args) {
        DatagramSocket socket = null ;
        try {
            socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName("localhost");
            int serverPort = 1009 ;
            String messsage = "hello sachin";
            byte [] sendme = messsage.getBytes();
            DatagramPacket packet = new DatagramPacket(sendme , sendme.length , address , serverPort);
            socket.send(packet);
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
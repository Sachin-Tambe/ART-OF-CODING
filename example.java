import  java.net.*;
public class example {
    public static void main(String[] args) {
        DatagramSocket socket = null ;
        try {
            socket = new DatagramSocket(1009);
            byte [] receive = new byte[1024];
            System.out.println("server started ");
            while(true) {
                DatagramPacket reciPacket = new DatagramPacket(receive, receive.length);
                socket.receive(reciPacket);
                String reciString = new String(reciPacket.getData() , 0 , reciPacket.getLength()) ;
                System.out.println(reciString);
            }
        } catch (Exception e) {
           System.out.println(e.getStackTrace());
        }
    }
}
import java.net.Socket;

public class Mainserver {
    public static void main(String[] args) {
        int porta = 12345;
        Server server;
        try{
            server= new Server(porta);
            System.out.println("server in ascolto");
            Socket socket = server.attendi;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }}


import java.net.Socket;
public class Mainserver {
    public static void main(String[] args) {
        Server server = new Server(12345);
        System.out.println("Server pronto");
        server.attendi();
        server.gestisciComunicazione();
        server.chiudi();
        server.termina();
    }
}

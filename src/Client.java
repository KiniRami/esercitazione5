import java.net.Socket;

public class Client {
   private String nome;
   private String colore;
    private Socket socket;

    public Client(String nome,String colore) {
        this.nome = nome;
        this.colore = colore;
    }
}

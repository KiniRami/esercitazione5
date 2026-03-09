public class Mainclient {
    public static void main(String[] args) {
        Client client = new Client("Rami", "blu");
        if (client.connetti("localhost", 12345) == 0) {
            client.comunica();
        }
    }
}

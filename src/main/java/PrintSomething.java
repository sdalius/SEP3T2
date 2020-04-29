import SocketServer.ConnectedClient;

public class PrintSomething {
    public static void main(String[] args) {
        ConnectedClient client = new ConnectedClient();
        client.start(5000);
    }
}

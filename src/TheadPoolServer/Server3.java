package TheadPoolServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server3 {
    private final ExecutorService threadPool;

    public Server3(int poolSize) {
        this.threadPool = Executors.newFixedThreadPool(poolSize);
    }

    public void handleClient(Socket clientSocket) {
        try (PrintWriter toSocket = new PrintWriter(clientSocket.getOutputStream(), true)) {
            toSocket.println("Hello from server " + clientSocket.getInetAddress());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int port = 8010;
        int poolSize = 10; // Adjust the pool size as needed
        Server3 server3 = new Server3(poolSize);

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            serverSocket.setSoTimeout(70000);
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();

                // Use the thread pool to handle the client
                server3.threadPool.execute(() -> server3.handleClient(clientSocket));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            // Shutdown the thread pool when the server exits
            server3.threadPool.shutdown();
        }
    }
}
package SingleThreadedServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server1 {

    public void run() throws IOException, UnknownHostException{
        int port = 8010;
        ServerSocket socket = new ServerSocket(port);
        socket.setSoTimeout(20000);
        while(true){
            System.out.println("Server is listening on port: "+port);
            Socket acceptedConnection = socket.accept();
            System.out.println("Connected to "+acceptedConnection.getRemoteSocketAddress());
            PrintWriter toClient = new PrintWriter(acceptedConnection.getOutputStream(), true);
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(acceptedConnection.getInputStream()));
            toClient.println("Hello World from the server");
        }
    }

    public static void main(String[] args){
        Server1 server1 = new Server1();
        try{
            server1.run();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
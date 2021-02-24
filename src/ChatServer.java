
import java.net.*;
import java.io.*;
import java.util.Formatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatServer
{
    private static int i = 0;

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(4444);
        ExecutorService fixedPool = Executors.newFixedThreadPool(30);

        while (true) {
            i++;
            Socket clientSocket = serverSocket.accept(); // blocking

            Formatter output = new Formatter( clientSocket.getOutputStream() );
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));


            fixedPool.submit(new CreateThread(in, i));

        }
        //clientSocket.close();

        //

    }
}
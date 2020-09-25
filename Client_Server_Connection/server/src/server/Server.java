package server;

import java.io.*;
import java.net.*;


public class Server {


    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket socket = serverSocket.accept();
        
        System.out.println("Client Connected");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pointserver;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danecek
 */
public class PointServer extends Thread {

    public PointServer(int port) {
        this.port = port;
    }

    int port;

    @Override
    public void run() {
        try {
            ServerSocket ss = new ServerSocket(port);
            int counter = 0;
            for (;;) {
                System.out.println("Server is waiting for client");
                Socket s = ss.accept();
                new PointServerClientThread(s, Integer.toString(++counter)).start();
            }
        } catch (IOException ex) {
            Logger.getAnonymousLogger().log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        new PointServer(3333).start();
    }

}

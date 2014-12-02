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
public class PointServerClientThread extends Thread {

    public PointServerClientThread(Socket s, String name) {
        super(name);
        this.s = s;
    }

    Socket s;

    @Override
    public void run() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            for (;;) {
                MyPoint mp = (MyPoint) ois.readObject();
                System.out.println("server thread " + getName() + " received: " + mp);
                MyPoint invPoint = new MyPoint(-mp.getX(), -mp.getY());
                oos.writeObject(invPoint);
                oos.flush();
                System.out.println("server thread " + getName() + " sent: " + invPoint);
            }
        } catch (IOException ex) {
            Logger.getLogger(PointServerClientThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PointServerClientThread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

package pointclient;

import pointserver.MyPoint;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author danecek
 */
public class PointClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket s = new Socket("localhost", 3333);
        ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
        for (;;) {
            Scanner sc = new Scanner(System.in);
            MyPoint mp = new MyPoint(sc.nextInt(), sc.nextInt());
            oos.writeObject(mp);
            oos.flush();
            System.out.println("I sent to server: " + mp);
            MyPoint returnPoint = (MyPoint) ois.readObject();
            System.out.println("I received from server: " + returnPoint);
        }
    }

}

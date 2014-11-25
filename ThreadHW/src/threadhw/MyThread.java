package threadhw;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {

    public MyThread(String string) {
        super(string);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
    }

}

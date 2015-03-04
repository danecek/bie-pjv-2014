/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfxhelloword;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.scene.text.Text;

/**
 *
 * @author danecek
 */
public class MyThread extends Thread {

    Text text;

    public MyThread(Text text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (;;) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            Platform.runLater(new Runnable() {

                @Override
                public void run() {
                    text.setText(new Date().toString());
                }
            });
        }
    }

}

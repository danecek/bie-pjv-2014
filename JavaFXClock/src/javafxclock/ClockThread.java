/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxclock;

import java.util.Date;
import javafx.application.Platform;
import javafx.scene.text.Text;

/**
 *
 * @author danecek
 */
public class ClockThread extends Thread {
    
    Text text;
    private boolean runFlag = true;

    public ClockThread(Text text) {
        this.text = text;
    }
    
    @Override
    public void run() {
        while (runFlag) {
            try {                
                sleep(1000);
            } catch (InterruptedException ex) {
            }
            Platform.runLater(
              new ClockTask(text)
            );

        }
    }

    public void myStop() {
        runFlag = false;
    }
    
}

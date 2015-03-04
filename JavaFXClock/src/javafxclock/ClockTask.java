/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxclock;

import java.util.Date;
import javafx.scene.text.Text;

/**
 *
 * @author danecek
 */
public class ClockTask implements Runnable {
    
    Text text;

    public ClockTask(Text text) {
        this.text = text;
    }

    @Override
    public void run() {
        text.setText(new Date().toString());

    }
    
}

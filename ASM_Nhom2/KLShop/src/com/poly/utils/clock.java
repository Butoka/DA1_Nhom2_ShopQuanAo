
package com.poly.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author HP
 */
public class clock extends Thread{
    private JLabel  JLabel;

    public clock(JLabel  JLabel) {
        this. JLabel = JLabel;
    }
 
    @Override
    public void run(){
        SimpleDateFormat sdf =new SimpleDateFormat("hh:mm aa");
        while(true){
            Date now =new Date(); //lấy ngày hiện tại của hệ thống
            String str =sdf.format(now);
            JLabel.setText(str);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
        }
    }
}

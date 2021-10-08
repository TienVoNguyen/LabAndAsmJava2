
package assignment.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class OclockThread extends Thread{
    Date dd;
    private JLabel lbTime;
    
    public OclockThread(JLabel lbTime) {
        this.lbTime = lbTime;
    }
    
    
    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss aa");
        try {
            do {
                dd = new Date();
                String st = sdf.format(dd);
                lbTime.setText(st);
                Thread.sleep(1000);
            } while (isAlive());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

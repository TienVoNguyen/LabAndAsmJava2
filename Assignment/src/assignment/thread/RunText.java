package assignment.thread;

import assignment.EmployeeFrom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RunText extends Thread {

    public JLabel lbl = new JLabel();
    public JPanel p;
    public EmployeeFrom e;

    public RunText(EmployeeFrom e, JPanel p) {
        this.e = e;
        this.p = p;
        add();
    }

    public void add() {
        lbl.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lbl.setForeground(new java.awt.Color(51, 51, 51));
        lbl.setText("QUẢN LÝ NHÂN VIÊN");
        lbl.setBounds(691, 10, 253, 28);
        p.add(lbl);
    }

    @Override
    public void run() {
        while (true) {
            int x = lbl.getX() - 1;
            int y = lbl.getY();
            lbl.setLocation(x, y);
            if (x <= 0) {
                while (true) {
                    x = lbl.getX() + 1;
                    y = lbl.getY();
                    lbl.setLocation(x, y);
                    if (x >= 450) {
                        break;
                    }
                    try {
                        Thread.sleep(7);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                        Logger.getLogger(RunText.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            try {
                Thread.sleep(7);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                Logger.getLogger(RunText.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}


package lab6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OddAEven{

    
    public static void main(String[] args) {
        Thread odd = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Số lẻ: ");
                for (int i = 0; i < 10; i++) {
                    if (i%2 != 0) {
                        try {
                            System.out.print(i + "\t");
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(OddAEven.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                System.out.println("");
            }
        });
        Thread even = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    odd.join();
                    System.out.print("Số chẵn: ");
                    for (int i = 0; i < 10; i++) {
                        if (i%2 == 0) {
                            try {
                                System.out.print(i + "\t");
                                Thread.sleep(150);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(OddAEven.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                    System.out.println("");
                } catch (InterruptedException ex) {
                    Logger.getLogger(OddAEven.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        odd.start();
        even.start();
        
        
        
    }
   
}

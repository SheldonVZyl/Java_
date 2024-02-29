package Book_3.Chapter_7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TickTockAnonymous
{
    private String tickMessage = "tick";
    private String tockMessage = "tock";

    public static void main(String[] args) {
        TickTockAnonymous t = new TickTockAnonymous();
        t.go();
    }

    private void go()
    {
        // create a timer that calls the Ticker class
        // at 1 second intervals
        Timer t = new Timer(1000,
                new ActionListener() {
                    private boolean tick = true;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (tick)
                        {
                            System.out.println(tickMessage);
                        } else {
                            System.out.println(tockMessage);
                        }
                        tick = !tick;
                    }
                }
        );

        t.start();
        JOptionPane.showMessageDialog(null, "Click OK to exit the program");;
        System.exit(0);

    }

}

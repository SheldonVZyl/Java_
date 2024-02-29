package Book_3.Chapter_7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuterTickTock
{
    private String tickMessage = "Tick...";
    private String tockMessage = "Tock...";

    public static void main(String[] args) {
        OuterTickTock t = new OuterTickTock();
        t.go();
    }

    private void go()
    {
        // create a timer that calls the Ticker class
        // at one second intervals
        Timer t = new Timer(1000, new InnerTicker() );
        t.start();

        // display a msg box to prevent program from ending immediately
        JOptionPane.showMessageDialog(null, "Click OK to exit program.");
        System.exit(0);
    }

    class InnerTicker implements ActionListener
    {
        private boolean tick = true;

        public void actionPerformed(ActionEvent event)
        {
            if (tick)
            {
                System.out.println(tickMessage);
            } else {
                System.out.println(tockMessage);
            }
            tick = !tick;
        }
    }

}

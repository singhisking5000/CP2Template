import javax.swing.*;        
import java.awt.Color;

public class HelloWorldSwing {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        //ImageIcon
        JFrame frame = new JFrame(/* A NAME GOES HERE (OPTIONAL)*/ "Swing Excersises");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //When we hit the X on the top right to close the application, it will actually close
        frame.setSize(240,240);
        frame.getContentPane().setBackground(new Color(171, 169, 161));

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        label.setText("Goodbye World!");
        //label.setHorizontalAlignment(40);
        //label.setHorizontalTextPosition();

        frame.getContentPane().add(label);

        //Display the window.
        //frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

package GUIDev;
import java.awt.Dimension;
import javax.swing.*;
public class GUIDev{
    public static void main(String[] args)
    {
        Runnable GUITask=new Runnable(){
             @Override public void run(){
                renderGUI();
            }
        };

       SwingUtilities.invokeLater(GUITask);
    }
    public static void renderGUI(){
        JFrame frame=new JFrame("Hello World!");
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setPreferredSize(new Dimension(400,400));
          JLabel label=new JLabel("Hello World!I am a GUI");
          frame.getContentPane().add(label);
          frame.pack();
          frame.setVisible(true);
    }
}


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class Finestra
{
   
    private static void createAndShowGUI() {
        JFrame jFrame = new JFrame("ATUOVELOX CRUD MONTANELLI");
        jFrame.setResizable(false);
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(1280, 720);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //parte riguardante x
        JLabel label1 = new JLabel(" x= "); 
        Border border1 = BorderFactory.createLineBorder(Color.BLACK);
        label1.setBorder(border1);
        label1.setPreferredSize(new Dimension(40, 20));
        label1.setText(" x = ");
        label1.setHorizontalAlignment(JLabel.LEFT);
        label1.setVerticalAlignment(JLabel.CENTER);
        jFrame.add(label1);
        jFrame.setVisible(true);
        JTextField f = new JTextField(2);
        f.setLocation(50, 50);
        jFrame.add(f);
        jFrame.setVisible(true);  
        JButton button = new JButton("INVIA X");
        button.setForeground(Color.BLACK);
        button.setBackground(Color.WHITE);
        Border line1 = new LineBorder(Color.BLACK);
        Border margin1 = new EmptyBorder(5, 15, 5, 15);
        Border compound1 = new CompoundBorder(line1, margin1);
        button.setBorder(compound1);
        jFrame.add(button);
        jFrame.setVisible(true);  
        button.setPreferredSize(new Dimension(90, 20));
        //parte riguardante y
        JLabel label3 = new JLabel(" y= "); 
        Border border3 = BorderFactory.createLineBorder(Color.BLACK);
        label3.setBorder(border3);
        label3.setPreferredSize(new Dimension(40, 20));
        label3.setText(" y = ");
        label3.setHorizontalAlignment(JLabel.LEFT);
        label3.setVerticalAlignment(JLabel.CENTER);
        jFrame.add(label3);
        jFrame.setVisible(true);
        JTextField f2 = new JTextField(2);
        f2.setLocation(50, 50);
        jFrame.add(f2);
        jFrame.setVisible(true);  
        JButton button2 = new JButton("INVIA Y");
        button2.setForeground(Color.BLACK);
        button2.setBackground(Color.WHITE);
        Border line2 = new LineBorder(Color.BLACK);
        Border margin2 = new EmptyBorder(5, 15, 5, 15);
        Border compound2 = new CompoundBorder(line2, margin2);
        button2.setBorder(compound2);
        jFrame.add(button2);
        jFrame.setVisible(true);  
        button2.setPreferredSize(new Dimension(90, 20));
        //parte riguardante risultato
        JLabel label2 = new JLabel(" espressione ");
        Border border2 = BorderFactory.createLineBorder(Color.BLACK);
        label2.setBorder(border2);
        label2.setPreferredSize(new Dimension(160, 20));
        label2.setText(" = [(3+x)-(5-y)]*(7y+3)");
        label2.setHorizontalAlignment(JLabel.LEFT);
        label2.setVerticalAlignment(JLabel.CENTER);
        jFrame.add(label2);
        jFrame.setVisible(true);

    }
    
  public static void main(String[] args) {
    createAndShowGUI();
  }

}
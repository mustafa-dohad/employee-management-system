package employee.management.system;
import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {

    Splash() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash-ems.gif"));
        Image i2 = i1.getImage().getScaledInstance(1000, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1000, 550);
        add(image);

        JLabel m1 = new JLabel("Mustafa Murtaza: CS221027");
        m1.setBounds(40, 560, 300, 20); // Adjusted bounds
        m1.setFont(new Font("Arial", Font.BOLD, 20));
        m1.setForeground(Color.BLACK);
        m1.setBackground(Color.WHITE);
        add(m1); // Add m1 to the JFrame

        JLabel m2 = new JLabel("Archita Kumari: CS231152");
        m2.setBounds(40, 590, 300, 20); // Adjusted bounds
        m2.setFont(new Font("Arial", Font.BOLD, 20));
        m2.setForeground(Color.BLACK);
        m2.setBackground(Color.WHITE);
        add(m2);

        JLabel m3 = new JLabel("Mehek Talreja : CS231115");
        m3.setBounds(680, 560, 300, 20); // Adjusted bounds
        m3.setFont(new Font("Arial", Font.BOLD, 20));
        m3.setForeground(Color.BLACK);
        m3.setBackground(Color.white);
        add(m3); // Add m1 to the JFrame

        JLabel m4 = new JLabel("Sandhiya: CS231106");
        m4.setBounds(680, 590, 300, 20); // Adjusted bounds
        m4.setFont(new Font("Arial", Font.BOLD, 20));
        m4.setForeground(Color.BLACK);
        m4.setBackground(Color.white);
        add(m4);

        setSize(1000, 650);
        setLayout(null); // Using null layout
        setLocation(350, 150);
        setVisible(true);

        try {
            Thread.sleep(10000);
            setVisible(false);
            new Login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Splash();
    }
}

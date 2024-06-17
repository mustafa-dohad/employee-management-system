package employee.management.system;
import javax.swing.*;
import java.awt.*;
public class Login extends JFrame {
    JTextField tusername;
    JPasswordField tpassword;

    JButton login,back;


    Login()
    {
        setLayout(null);

        JLabel username = new JLabel("Username");
        username.setBounds(40,20,100,30);
        add(username);

        tusername = new JTextField();
        tusername.setBounds(150,20,150,30);
        add(tusername);

        JLabel password = new JLabel("Password");
        password.setBounds(40,70,100,30);
        add(password);

        tpassword = new JPasswordField();
        tpassword.setBounds(150,70,150,30);
        add(tpassword);

        login = new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        add(login);
        back = new JButton("BACK");
        back.setBounds(300,140,150,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        add(back);

        setSize(600, 300);
        setLocation(450,200);
        setVisible(true);

    }









    public static void main(String[] args) {        try {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (Exception e) {
        // If Nimbus is not available, you can set the GUI to another look and feel.
        e.printStackTrace();
    }

        new Login();
    }
}

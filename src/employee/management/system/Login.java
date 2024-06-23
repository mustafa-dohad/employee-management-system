package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JTextField tusername;
    JPasswordField tpassword;

    JButton login;

    Login() {
        setLayout(null);

        JLabel tuname = new JLabel("username: cs123456");
        tuname.setBounds(250,450,250,30);
        tuname.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        tuname.setForeground(Color.white);
        add(tuname);
        JLabel tpass = new JLabel("password: 123456789");
        tpass.setBounds(250,480,250,30);
        tpass.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        tpass.setForeground(Color.white);
        add(tpass);


        tusername = new JTextField();
        tusername.setBounds(600, 283, 174, 45);
        add(tusername);

        tpassword = new JPasswordField();
        tpassword.setBounds(600, 325, 174, 45);
        add(tpassword);

        login = new JButton("LOGIN");
        login.setBounds(556, 410, 220, 48);
        login.setBackground(new Color(97,21,21));
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 650, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0, 0, 1000, 650);
        add(img);

        setSize(1000, 650);
        setLocation(350, 150);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            try {
                String username = tusername.getText();
                String password = new String(tpassword.getPassword());

                conn conn = new conn();
                String query = "select * from login where username= '" + username + "' and password= '" + password + "'";

                ResultSet resultSet = conn.statement.executeQuery(query);
                if (resultSet.next()) {
                    setVisible(false);
                    new Main_class();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                }

            } catch (Exception E) {
                E.printStackTrace();
            }
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

        new Login();
    }
}

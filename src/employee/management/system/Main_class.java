package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_class extends JFrame {
    Main_class(){

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/interface.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0, 0, 1120, 600);
        add(img);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(400,180,400,40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        heading.setBackground(Color.WHITE);
        img.add(heading);

        JButton add = new JButton("Add Employee");
        add.setBounds(355,240,150,40);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLUE);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    new AddEmployee();
            }
        });
        img.add(add);

        JButton view = new JButton("View Employee");
        view.setBounds(525,240,150,40);
        view.setForeground(Color.WHITE);
        view.setBackground(Color.BLUE);
        view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ViewEmployee();
            }
        });
        img.add(view);

        JButton remove = new JButton("Remove Employee");
        remove.setBounds(695,240,150,40);
        remove.setForeground(Color.WHITE);
        remove.setBackground(Color.BLUE);
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new RemoveEmployee();
            }
        });
        img.add(remove);

        setSize(1120, 630);
        setLocation(250, 150);
        setLayout(null);
        setVisible(true);
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
        new Main_class();
    }
}

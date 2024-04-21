package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JTextField textFieldName;
    JPasswordField passwordField;
    JButton loginButton;
    JButton back;


    Login(){
//        for text visibility we use Jlabel
        JLabel labelName = new JLabel("Username ");
        labelName.setBounds(40, 20, 100, 20);
        labelName.setForeground(Color.white);
        add(labelName);

        textFieldName = new JTextField();
        textFieldName.setBounds(150, 20, 150, 20);
        add(textFieldName);

        JLabel labelPass = new JLabel("Password");
        labelPass.setBounds(40, 70, 100, 20);
        labelPass.setForeground(Color.white);
        add(labelPass);


        passwordField = new JPasswordField();
        passwordField.setBounds(150, 70, 150, 20);
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(40, 140, 120, 30);
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.white);
        loginButton.addActionListener(this);
        add(loginButton);

        back = new JButton("Back");
        back.setBounds(180, 140, 120, 30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/second.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(350, 20, 200, 200);
        add(img);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/loginbackm.jpeg"));
        Image i22 = i11.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel image = new JLabel(i33);
        image.setBounds(0, 0, 600, 300);
        add(image);

        setSize(600, 300);
        setLocation(500, 250);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== loginButton){

        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

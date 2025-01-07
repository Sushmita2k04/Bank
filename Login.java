package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text =  new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(220,40,400,40);
        add(text);

        JLabel cardNo =  new JLabel("Card No: ");
        cardNo.setFont(new Font("Raleway",Font.BOLD,28));
        cardNo.setBounds(120,150,150,30);
        add(cardNo);

        //Creating Text box to enter the card details
        cardTextField = new JTextField();
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setBackground(Color.black);
        cardTextField.setForeground(Color.pink);
        cardTextField.setFont(new Font("Raleway",Font.BOLD, 20));
        add(cardTextField);

        JLabel pin =  new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120,220,400,40);
        add(pin);

        //Creating Text box to enter the PIN details
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setBackground(Color.black);
        pinTextField.setForeground(Color.pink);
        pinTextField.setFont(new Font("Arial",Font.BOLD, 20));
        add( pinTextField );

        //Creating a button for SIGN IN
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100,30);
        login.setBackground(Color.black);
        login.setForeground(Color.pink);
        login.addActionListener(this);
        add(login);

        //Creating a button for clearing the data
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100,30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.pink);
        clear.addActionListener(this);
        add(clear);

        //Creating a button for clearing the data
        signup = new JButton("SIGN UP");
        signup.setBounds(300, 350, 230,30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.pink);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.pink);

        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource()==login) {
            
        } else if (ae.getSource()== signup) {
            
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}


package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,dobTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton male,female,other,other1,married,unmarried;
    JDateChooser dateChooser;
    SignupOne(){
        setLayout(null);//Sets the layout null

        Random rom = new Random();
        random = Math.abs(rom.nextLong() % 9000L)+1000L;

        JLabel formno = new JLabel("APPLICATION FORM NO. "+ random );
        getContentPane().setBackground(Color.pink);
        formno.setBounds(140, 20, 600, 40);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        add(formno);

        JLabel perdonalDetails = new JLabel("Page 1 : Personal Details");
        //perdonalDetails.setForeground(Color.WHITE);
        perdonalDetails.setBounds(290, 80, 400, 30);
        perdonalDetails.setFont(new Font("Raleway",Font.BOLD,30));
        add(perdonalDetails);

        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,20));
        nameTextField.setBounds(300, 140, 400,30);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,20));
        fnameTextField.setBounds(300, 190, 400,30);
        add(fnameTextField);


        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
         dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);


        JLabel gender = new JLabel("Name: ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
         male = new JRadioButton("Male");
        male.setBounds(300, 290, 100 , 30);
        male.setBackground(Color.pink);
        add(male);
         female = new JRadioButton("Female");
        female.setBounds(450, 290, 100 , 30);
        female.setBackground(Color.pink);
        add(female);
         other = new JRadioButton("Other");
        other.setBounds(600, 290, 100 , 30);
        other.setBackground(Color.pink);
        add(other);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);


        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,20));
        emailTextField.setBounds(300, 340, 400,30);
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

         unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(300, 390, 100 , 30);
        unmarried.setBackground(Color.pink);
        add(unmarried);
         married = new JRadioButton("Married");
        married.setBounds(450, 390, 100 , 30);
        married.setBackground(Color.pink);
        add(married);
         other1 = new JRadioButton("Other");
        other1.setBounds(600, 390, 100 , 30);
        other1.setBackground(Color.pink);
        add(other1);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(unmarried);
        maritalgroup.add(married);
        maritalgroup.add(other1);

        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,20));
        addressTextField.setBounds(300, 440, 400,30);
        add(addressTextField);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100, 490, 200, 30);
        add(city);
         cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,20));
        cityTextField.setBounds(300, 490, 400,30);
        add(cityTextField);

        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100, 540, 200, 30);
        add(state);
         stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,20));
        stateTextField.setBounds(300, 540, 400,30);
        add(stateTextField);

        JLabel pincode= new JLabel("Pin Code: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,20));
        pinTextField.setBounds(300, 590, 400,30);
        add(pinTextField);

         next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660, 80, 30);
        next.addActionListener(this);
        add(next);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){

        String formno = ""+ random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()){
            gender="Male";
        } else if (female.isSelected()) {
            gender="Female";
        }else if (other.isSelected()) {
            gender="Other";
        }
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()){
            marital="Married";
        } else if (unmarried.isSelected()) {
            marital="Unmarried";
        }else if (other1.isSelected()) {
            marital="Other1";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();

        try{
            if (name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }else{
                Connectionn conn = new Connectionn();
              //  String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"''"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                String query = "INSERT INTO signup (formno, name, fname, dob, gender, email, marital, address, city, pin, state) " +
                        "VALUES ('" + formno + "', '" + name + "', '" + fname + "', '" + dob + "', '" + gender + "', '" + email + "', '" + marital + "', '" + address + "', '" + city + "', '" + pin + "', '" + state + "')";

                conn.s.executeUpdate(query);

            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new SignupOne();
    }
}
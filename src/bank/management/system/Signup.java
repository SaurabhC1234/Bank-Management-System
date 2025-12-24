package bank.management.system;



import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JTextField textName, textFname,textEmail,textAddress,textCity,textState,textPin,textPhone;

    JDateChooser dateChooser;

    JRadioButton r1,r2,r3,r4;

    JButton next;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L);
    String first = " " + Math.abs(first4);

    Signup(){
        super("APPLICATION FORM : " );

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,150,100);
        add(image);


        JLabel label1 = new JLabel("APPLICATION FORM NO : " + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2  = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,100,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Releway",Font.BOLD,20));
        labelName.setBounds(100,150,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,150,400,30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name : ");
        labelfName.setFont(new Font("Releway",Font.BOLD,20));
        labelfName.setBounds(100,190,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,190,400,30);
        add(textFname);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,270,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(420,270,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel DOB = new JLabel("Date Of Birth : ");
        DOB.setFont(new Font("Releway",Font.BOLD,20));
        DOB.setBounds(100,230,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,230,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender : ");
        labelG.setFont(new Font("Releway",Font.BOLD,20));
        labelG.setBounds(100,270,200,30);
        add(labelG);


        JLabel labelMs = new JLabel("Marital Status : ");
        labelMs.setFont(new Font("Raleway",Font.BOLD,20));
        labelMs.setBounds(100,310,200,30);
        add(labelMs);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(300,310,100,30);
        add(r3);

        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(420,310,120,30);
        add(r4);

        ButtonGroup buttonMGroup = new ButtonGroup();
        buttonMGroup.add(r3);
        buttonMGroup.add(r4);


        JLabel labelEmail = new JLabel("Email Address : ");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,350,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,350,400,30);
        add(textEmail);


        JLabel labelAdd = new JLabel("Address : ");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,390,200,30);
        add(labelAdd);

        textAddress = new JTextField();
        textAddress.setFont(new Font("Raleway",Font.BOLD,14));
        textAddress.setBounds(300,390,400,30);
        add(textAddress);

        JLabel labelCity = new JLabel("City : ");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,430,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,430,400,30);
        add(textCity);


        JLabel labelState = new JLabel("State : ");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,470,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,470,400,30);
        add(textState);


        JLabel labelPin = new JLabel("Pincode : ");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,510,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,510,400,30);
        add(textPin);


        JLabel labelPhone = new JLabel("Phone No : ");
        labelPhone.setFont(new Font("Raleway",Font.BOLD,20));
        labelPhone.setBounds(100,550,200,30);
        add(labelPhone);

        textPhone = new JTextField();
        textPhone.setFont(new Font("Raleway",Font.BOLD,14));
        textPhone.setBounds(300,550,400,30);
        add(textPhone);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.black);
        next.setForeground(Color.WHITE);
        next.setBounds(620,600,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,670);
        setLocation(250,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }
        else if(r2.isSelected()){
            gender = "Female";
        }
        String email  = textEmail.getText();
        String marital  = null;
        if(r3.isSelected()){
            marital = "Married";
        }else if(r4.isSelected()){
            marital = "Unmarried";
        }
         String address = textAddress.getText();
        String city = textCity.getText();
        String state = textState.getText();
        String pincode = textPin.getText();
        String number = textPhone.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Fill all the Fields");
            }
            else{
                Conn con1 = new Conn();
                String query = "INSERT INTO signup VALUES('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"','"+number+"')";
                con1.statement.executeUpdate(query);
                new Signup2(formno);
                setVisible(false);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}

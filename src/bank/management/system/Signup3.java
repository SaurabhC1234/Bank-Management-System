package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton s,c;

    String formno;

    Signup3(String formno){


        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1 = new JLabel("Page 3");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(340,20,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,50,400,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,200,30);
        add(l3);


        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(173, 216, 230));
        r1.setBounds(100,150,170,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(173, 216, 230));
        r2.setBounds(400,150,210,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(173, 216, 230));
        r3.setBounds(100,175,185,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(173, 216, 230));
        r4.setBounds(400,175,250,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4= new JLabel("Card Number :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,220,200,30);
        add(l4);

        JLabel l5= new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,245,200,20);
        add(l5);

        JLabel l6= new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(400,220,250,30);
        add(l6);
        JLabel l7= new JLabel("(It'd appear on atm card/Cheque Book and Statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(400,240,500,30);
        add(l7);

        JLabel l8= new JLabel("PIN :");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,290,200,30);
        add(l8);

        JLabel l9= new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(400,290,200,30);
        add(l9);


        JLabel l10= new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,310,500,30);
        add(l10);

        JLabel l11= new JLabel("Services Required :");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,355,200,30);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(173, 216, 230));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,385,200,30);
        add(c1);


        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(173, 216, 230));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(400,385,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(173, 216, 230));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,410,200,30);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setBackground(new Color(173, 216, 230));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(400,410,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(173, 216, 230));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,435,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(173, 216, 230));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(400,435,200,30);
        add(c6);


        JCheckBox c7 = new JCheckBox("I here by declares that the above entered details correct to the best of my knowledge.",true);
        c7.setBackground(new Color(173, 216, 230));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,500,600,30);
        add(c7);

        JLabel l12= new JLabel("Form No : ");
        l12.setFont(new Font("raleway",Font.BOLD,14));
        l12.setBounds(650,10,100,30);
        add(l12);

        JLabel l13= new JLabel(formno);
        l13.setFont(new Font("raleway",Font.BOLD,14));
        l13.setBounds(750,10,120,30);
        add(l13);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.black);
        s.setForeground(Color.WHITE);
        s.setBounds(220,570,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.black);
        c.setForeground(Color.WHITE);
        c.setBounds(420,570,100,30);
        c.addActionListener(this);
        add(c);



        getContentPane().setBackground(new Color(173, 216, 230));
        setSize(950,660);
        setLayout(null);
        setLocation(230,10);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if(r1.isSelected()){
            atype = "Saving Account";
        }
        else if (r2.isSelected()){
            atype = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            atype = "Current Account";
        }
        else {
            atype = "Recurring Deposit Account";
        }

        Random random = new Random();
        long first7 = (random.nextLong() % 90000000L)+ 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (random.nextLong() % 90000L)+ 1000L;
        String pin = ""+ Math.abs(first3);

        String ser = "";
        if(c1.isSelected()){
            ser += "ATM CARD";
        } else if (c2.isSelected()) {
            ser += "Internet Banking";
        } else if (c3.isSelected()) {
            ser += "Mobile Banking";
        } else if (c4.isSelected()) {
            ser += "Email Alerts";
        } else if (c5.isSelected()) {
            ser += "Cheque Book";
        } else if (c6.isSelected()) {
            ser += "E-Statement";
        }
        try{
            if (e.getSource()==s){
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Kindly Fill all the Fields");
                }
                else {
                    Conn c1 = new Conn();
                    String query1 = "INSERT INTO signup3 VALUES('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+ser+"')";
                    String query2 = "INSERT INTO login VALUES('"+formno+"','"+cardno+"','"+pin+"')";

                    c1.statement.executeUpdate(query1);
                    c1.statement.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"Card_Number : " +cardno +"\n PIN : " +pin );
                    new Deposit(pin);
                    setVisible(false);

                }
            }else if (e.getSource()==c){
                System.exit(0);
            }
        }catch (Exception E){
            E.printStackTrace();
        }



    }

    public static void main(String[] args) {
        new Signup3("");
    }
}

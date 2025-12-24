package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    JLabel label1,label2;
    JButton b1,b2;
    String pin;

    BalanceEnquiry(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1400,650,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1400,650);
        add(l3);

         label1 = new JLabel("YOUR CURRENT BALANCE IS RS. ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,14));
        label1.setBounds(390,120,600,35);
        l3.add(label1);

         label2 = new JLabel();
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,20));
        label2.setBounds(390,160,600,35);
        l3.add(label2);

        b1 = new JButton("BACK");
        b1.setBounds(613,320,150,30);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

//        b2 = new JButton("Back");
//        b2.setBounds(613,320,150,30);
//        b2.setBackground(new Color(65,125,128));
//        b2.setForeground(Color.WHITE);
//        b2.addActionListener(this);
//        l3.add(b2);

        int balance = 0;
        try {
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where PIN = '"+pin+"'");
            while (resultSet.next()){
                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception E){
            E.printStackTrace();
        }

        label2.setText(""+balance);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Main_Class(pin);
    }

    static void main(String[] args) {
        new BalanceEnquiry("");
    }
}

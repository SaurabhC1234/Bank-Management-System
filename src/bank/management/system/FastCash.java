package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    FastCash(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1400,650,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1400,650);
        add(l3);

        JLabel label = new JLabel("PLEASE SELECT WITHDRAW AMOUNT");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,18));
        label.setBounds(400,130,600,35);
        l3.add(label);

        b1 = new JButton("Rs. 100");
        b1.setForeground(Color.WHITE);
        b1.setBackground(new Color(65,125,128));
        b1.addActionListener(this);
        b1.setBounds(371,212,160,30);
        l3.add(b1);


        b2 = new JButton("Rs. 500");
        b2.setForeground(Color.WHITE);
        b2.setBackground(new Color(65,125,128));
        b2.addActionListener(this);
        b2.setBounds(608,212,160,30);
        l3.add(b2);

        b3 = new JButton("Rs. 1000");
        b3.setForeground(Color.WHITE);
        b3.setBackground(new Color(65,125,128));
        b3.addActionListener(this);
        b3.setBounds(371,248,160,30);
        l3.add(b3);


        b4 = new JButton("Rs. 2000 ");
        b4.setForeground(Color.WHITE);
        b4.setBackground(new Color(65,125,128));
        b4.addActionListener(this);
        b4.setBounds(608,248,160,30);
        l3.add(b4);


        b5 = new JButton("Rs. 5000");
        b5.setForeground(Color.WHITE);
        b5.setBackground(new Color(65,125,128));
        b5.addActionListener(this);
        b5.setBounds(371,284,160,30);
        l3.add(b5);


        b6 = new JButton("Rs. 10000");
        b6.setForeground(Color.WHITE);
        b6.setBackground(new Color(65,125,128));
        b6.addActionListener(this);
        b6.setBounds(608,284,160,30);
        l3.add(b6);

        b7 = new JButton("BACK");
        b7.setForeground(Color.WHITE);
        b7.setBackground(new Color(65,125,128));
        b7.addActionListener(this);
        b7.setBounds(608,320,160,30);
        l3.add(b7);


        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b7){
            setVisible(false);
            new Main_Class(pin);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Conn c= new Conn();
            Date date = new Date();
            try{
                ResultSet resultSet = c.statement.executeQuery("select * from bank where PIN = '"+pin+"'");
                int balance = 0;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(resultSet.getString("amount"));

                    }
                }

                if(e.getSource()!= b7 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"INSUFFICIENT BALANCE");
                    return;
                }

                c.statement.executeUpdate("insert into bank value('"+pin+"','"+date+"','withdraw','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs. " + amount + " Debited Successfully");


            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new Main_Class(pin);
        }
    }

    static void main(String[] args) {
        new FastCash("");
    }
}

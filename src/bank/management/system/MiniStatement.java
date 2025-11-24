package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {
    String pin;
    JButton button;
    MiniStatement(String pin){

        this.pin=pin;

        getContentPane().setBackground(new Color(255,204,204));
        setSize(400,600);
        setLocation(20,20);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(20,80,400,250);
        add(label1);

        JLabel label2 = new JLabel("JavaDS BANK");
        label2.setFont(new Font("System",Font.BOLD,15));
        label2.setBounds(150,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,50,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);

        try {
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from login where PIN  = '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card_Number "+ resultSet.getString("Card_Number").substring(0,4) + "XXXXXXXXXXXX"+ resultSet.getString("Card_Number").substring(12));

            }


        }catch (Exception e){
            e.printStackTrace();
        }

        try {

            int balance = 0;
            Conn c= new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where PIN = '"+pin+"'");
            while (resultSet.next()){

                label1.setText(label1.getText() + "<html>" + resultSet.getString("Date") + "&nbsp;&nbsp;&nbsp;&nbsp;" +resultSet.getString("Type")+"&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("Amount") + "<br><html>");

                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));

                }
            }

            label4.setText("Your Total Balance is Rs." + balance);

        }catch (Exception E){
            E.printStackTrace();
        }

        button = new JButton("EXIT");
        button.setBounds(20,500,100,25);
        button.setBackground(Color.black);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        add(button);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

    }

    public static void main(String[] args) {
        new MiniStatement("");
    }

}

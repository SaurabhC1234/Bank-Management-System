package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePin extends JFrame implements ActionListener {

    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;

    ChangePin(String pin){

        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1400,650,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1400,650);
        add(l3);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(388,120,600,35);
        l3.add(label1);

        JLabel label2 = new JLabel(" NEW PIN : ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(385,155,600,35);
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setBounds(545,160,200,25);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.WHITE);
        l3.add(p1);

        JLabel label3 = new JLabel(" CONFIRM PIN : ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(385,185,600,35);
        l3.add(label3);

        p2 = new JPasswordField();
        p2.setBounds(545,193,200,25);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        l3.add(p2);



        b1 = new JButton("CHANGE");
        b1.setBounds(613,280,150,30);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(613,320,150,30);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);


        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{

            String pin1 = p1.getText();
            String pin2 =p2.getText();

            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN Doesn't Match!  ");
                return;
            }
            if(e.getSource()==b1){
                if (p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                }
                if(p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }

                Conn c = new Conn();
                String query1 = "update bank set PIN = '"+pin1+"' where PIN = '"+pin+"'";
                String query2 = "update login set PIN = '"+pin1+"' where PIN = '"+pin+"'";
                String query3 = "update signup3 set PIN = '"+pin1+"' where PIN = '"+pin+"'";


                c.statement.executeUpdate(query1);
                c.statement.executeUpdate(query2);
                c.statement.executeUpdate(query3);


                JOptionPane.showMessageDialog(null,"Your PIN Changed Successfully...");
                setVisible(false);
                new Main_Class(pin);
            } else if (e.getSource().equals(b2)) {
                new Main_Class(pin);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }



    }

    static void main(String[] args) {
        new ChangePin("");
    }
}

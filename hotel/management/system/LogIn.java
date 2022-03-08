package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LogIn extends JFrame implements ActionListener {
    JLabel l1 , l2;
    JTextField t1 ;
    JPasswordField t2;
    JButton b1 , b2;
    
    
    LogIn(){
        l1 = new JLabel("USER NAME");
        l1.setBounds(40,20,100,20);
        add(l1);  // for user name
        l2 = new JLabel("PASSWORD");
        l2.setBounds(40,70,100,20);
        add(l2);  // for password
        
        
        // now for text field to insert username and pw
        
        t1 = new JTextField();
        t1.setBounds(150,20,150,30);
        add(t1);
        t2 = new JPasswordField();
        t2.setBounds(150,70,150,30);
        add(t2);
        
        // now for button
        b1 = new JButton("LOGIN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.setBounds(200,110,100,30);
        b1.addActionListener(this);
        add(b1);
        
        //For button 2
        
        b2 = new JButton("CANCEL");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.setBounds(200,150,100,30);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/second.jpg"));
        Image i3 = i2.getImage().getScaledInstance(200 ,200, Image.SCALE_DEFAULT);
        ImageIcon i4 = new ImageIcon(i3);
        JLabel l3 = new JLabel(i4);
        l3.setBounds(350,10,200,200);
        add(l3);
        getContentPane().setBackground(Color.white);
        
        
        
        
        setLayout(null); 
        setBounds(500,300,600,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource()==b1){
          String username = t1.getText();
          String password = t2.getText();
          conn c = new conn();
          
          String str = "SELECT * from login WHERE username = '"+ username + "' ANd password = '"+ password + "'";
          try{
              
          ResultSet rs = c.s.executeQuery(str);
          
          if(rs.next()){
             new DashBoard().setVisible(true);
             this.setVisible(false);
          }else{
              JOptionPane.showMessageDialog(null, "Invalid Username and Password");
          }   this.setVisible(false);
          
          } catch (Exception e){
              
          }
          
      }else if(ae.getSource()==b2){
          System.exit(0);
      }
    }
    public static void main(String[] args) {
        new LogIn();
    }
}

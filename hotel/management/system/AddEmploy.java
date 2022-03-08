
package hotel.management.system;

import java.awt.*; //abstract window tool kit...
import java.awt.event.*;
import javax.swing.*;


public class AddEmploy extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5,t6;
    JRadioButton b1, b2;
    JComboBox c1;
    JButton b3;
    
    AddEmploy(){
    JLabel name = new JLabel("NAME");
    name.setFont(new Font("Tahoma",Font.PLAIN , 17));
    name.setBounds(60,30,120,30);
    add(name);
    
    
    t1 = new JTextField();
    t1.setBounds(200,30,150,30);
    add(t1);
    // for age
     JLabel age = new JLabel("AGE");
    age.setFont(new Font("Tahoma",Font.PLAIN , 17));
    age.setBounds(60,80,120,30);
    add(age);
    
    
    t2 = new JTextField();
    t2.setBounds(200,80,150,30);
    add(t2);
    // till here
    
    // gender
    JLabel gender = new JLabel("GENDER");
    gender.setFont(new Font("Tahoma",Font.PLAIN , 17));
    gender.setBounds(60,120,120,30);
    add(gender);
    b1 = new JRadioButton("MALE");
    b1.setBounds(200,120,60,30);
    b1.setBackground(Color.white);
    add(b1);
    
    b2 = new JRadioButton("FEMALE");
    b2.setBounds(270,120,80,30);
    b2.setBackground(Color.white);
    add(b2);
//till here

// for salary field
    JLabel salary = new JLabel("SALARY");
    salary.setFont(new Font("Tahoma",Font.PLAIN , 17));
    salary.setBounds(60,220,80,30);
    add(salary);
    
    t3 = new JTextField();
    t3.setBounds(200,220,150,30);
    add(t3);
    // till here
    
// for phone
JLabel phone = new JLabel("PHONE");
    phone.setFont(new Font("Tahoma",Font.PLAIN , 17));
    phone.setBounds(60,260,80,30);
    add(phone);
    
    t4 = new JTextField();
    t4.setBounds(200,260,150,30);
    add(t4);
// till here

//for aadahaar
JLabel aadhar = new JLabel("AADHAR NUMBER");
    aadhar.setFont(new Font("Tahoma",Font.PLAIN , 17));
    aadhar.setBounds(60,300,150,30);
    add(aadhar);
    
    t5 = new JTextField();
    t5.setBounds(200,300,150,30);
    add(t5);
//till here
// for email
JLabel email = new JLabel("EMAIL");
    email.setFont(new Font("Tahoma",Font.PLAIN , 17));
    email.setBounds(60,340,80,30);
    add(email);
    
    t6 = new JTextField();
    t6.setBounds(200,340,150,30);
    add(t6);
// tilll here
//job drop bar
String[] optionsToChoose = {"front desk clerk","porters","housekeeping","kiten staff","room services","waiter","manger","accountent","chef"};
 JLabel job = new JLabel("JOB");
    job.setFont(new Font("Tahoma",Font.PLAIN , 17));
    job.setBounds(60,170,120,30);
    add(job);
    
    
    c1 = new JComboBox(optionsToChoose);
    c1.setBounds(200,170,150,30);
    c1.setBackground(Color.white);
    add(c1);
    //till here
    
    // jbutton for submit 
    
    b3  = new JButton("SUBMIT");
    b3.setBounds(200,380,150,30);
    b3.setBackground(Color.black);
    b3.setForeground(Color.white);
    b3.addActionListener(this);
    add(b3);
    
    
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/tenth.jpg"));
           Image i2 = i1.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
           ImageIcon i3 = new ImageIcon(i2);
            JLabel l1 = new JLabel(i3);
            l1.setBounds(330,0,500,500);
            add(l1);
            
            JLabel l2 = new JLabel("ADD EMPLOY DETAILS");
            l2.setFont(new Font("Tahoma",Font.PLAIN , 25));
            l2.setBounds(150,10,300,60);
            l2.setForeground(Color.blue);
            l1.add(l2);
     
            getContentPane().setBackground(Color.WHITE);
    
    setLayout(null);
    setBounds(450,220,800,500);
    setVisible(true);                           
    
}
    // for getting value or input from users:-
    public void actionPerformed(ActionEvent ae){
            String name = t1.getText();
            String age = t2.getText();
            String salary = t3.getText();
            String phone = t4.getText();
            String aadhar = t5.getText();
            String email = t6.getText();
            
            String gender = null;
            if(b1.isSelected()){
                gender = "Male";
            }else if(b2.isSelected()){
                gender = "Female";
            
            }
            String job = (String)c1.getSelectedItem();
            conn c = new conn();
            String str = "insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+aadhar+"', '"+email+"')";
            try{
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"New Employee added");
                this.setVisible(false);
            }catch(Exception e){
                System.out.println(e);
            }
    }
    public static void main(String[] args) {
        new AddEmploy().setVisible(true);
    }
    
}

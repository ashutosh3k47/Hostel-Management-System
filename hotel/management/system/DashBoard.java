
package hotel.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;
public class DashBoard extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu m1, m2;
    JMenuItem i1,i2,i3,i4;
    
    
    DashBoard(){
        mb= new JMenuBar();
        add(mb);
        
        m1 = new JMenu("HOSTEL MANAGEMENT");
        m1.setForeground(Color.black);
        mb.add(m1);
        m2 = new JMenu("ADMIN");
        m2.setForeground(Color.black);
        mb.add(m2);
        
        i1= new JMenuItem("RECEPTION");
        m1.add(i1);
        i2= new JMenuItem("ADD EMPLOYEE");
        i2.addActionListener(this);
        m2.add(i2);
        i3= new JMenuItem("ADD ROOMS");
        m2.add(i3);
        i4= new JMenuItem("ADD DRIVERS");
        m2.add(i4);
        mb.setBounds(0, 0, 1950, 30);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1950,980);
        add(l1);
        
        //taj hostel group welcomes you
        JLabel l2 = new JLabel("THE HOSTEL GROUP WELCOMES YOU");
        l2.setBounds(450,100,1000,100);
        
        l2.setForeground(Color.white);
        l2.setFont(new Font("Tahoma",Font.PLAIN, 46));
        l1.add(l2);
        
        setLayout(null);
        setBounds(0,0,1950,1000);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
            new AddEmploy();

    }
    
    public static void main(String[] args) {
        new DashBoard().setVisible(true);
    }
}

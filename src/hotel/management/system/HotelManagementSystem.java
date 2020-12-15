
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener {
    public JLabel l1;
    public JButton b1;
    public HotelManagementSystem(){
        //setSize(1366,430);
        //setLocation(300,300);
        setLayout(null);
        setBounds(100,90,1366,565);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel\\management\\system\\icons\\first.jpg"));
        l1 =new JLabel(i1);
        l1.setBounds(0,0,1366,565);
        add(l1);
        
        JLabel l2 = new JLabel("Hotel Management System ");
        l2.setBounds(20,430,1000,90);
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("serif",Font.PLAIN,70));
        l1.add(l2);
        
        b1 = new JButton("Next");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(1150,460,100,40);
        
        l1.add(b1);
        b1.addActionListener(this);
         
        setVisible(true);
        while(true)

       {
            l2.setVisible(false);
            try{
                Thread.sleep(500);
            }
            catch(Exception ex){   
            }
            l2.setVisible(true);
            try{
            Thread.sleep(500);
            }
            catch(Exception ex){
            }
        }
        
    
    }
    
     public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
         this.setVisible(false);
    }
    public static void main(String[] args) {
       HotelManagementSystem hm =new HotelManagementSystem ();
       hm.setVisible(true);
    }
}
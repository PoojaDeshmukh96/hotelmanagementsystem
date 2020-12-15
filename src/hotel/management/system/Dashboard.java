package hotel.management.system;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame {

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");
	
        setForeground(Color.CYAN);
        setLayout(null); 

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);
        
        JLabel head = new JLabel("THE TAJ GROUP WELCOMES YOU");
	head.setForeground(Color.WHITE);
        head.setFont(new Font("Tahoma", Font.PLAIN, 46));
	head.setBounds(600, 60, 1000, 85);
	NewLabel.add(head);
		
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	
	
        
        JMenu HOTEL_MANAGEMENT = new JMenu("HOTEL MANAGEMENT");
        HOTEL_MANAGEMENT.setForeground(Color.BLUE);
	menuBar.add(HOTEL_MANAGEMENT);
		
        JMenuItem RECEPTION = new JMenuItem("RECEPTION");
        HOTEL_MANAGEMENT.add(RECEPTION);
		
	JMenu ADMIN = new JMenu("ADMIN");
        ADMIN.setForeground(Color.RED);
	menuBar.add(ADMIN);
        
        JMenuItem AddEmployee = new JMenuItem("ADD EMPLOYEE");
	ADMIN.add(AddEmployee);
        
        AddEmployee.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

        JMenuItem AddRooms = new JMenuItem("ADD ROOMS");
	ADMIN.add(AddRooms);
        
        AddRooms.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRoom().setVisible(true);
                }catch(Exception e ){}
            }
	});
        

	RECEPTION.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception().setVisible(true);
            }
	});
        
        
        JMenuItem FlightDetailshello3 = new JMenuItem("ADD DRIVERS");
	ADMIN.add(FlightDetailshello3);
        
	FlightDetailshello3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDrivers().setVisible(true);
                }catch(Exception e ){}
            }
	});
        JButton LOGOUT = new JButton("LOGOUT");
        LOGOUT.setForeground(Color.BLUE);
        LOGOUT.setBackground(Color.BLACK);
        LOGOUT.setForeground(Color.WHITE);
        LOGOUT.setBounds(1150,460,100,40);
        	
//LOGOUT.setMnemonic(KeyEvent.VK_L);
        menuBar.add(LOGOUT);
        LOGOUT.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
//                    System.exit(0);
                     new Login().setVisible(true);
                    setVisible(false);
                }catch(Exception e ){}
            }
	});
       
        setSize(1950,1090);
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}

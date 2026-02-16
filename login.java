package employee.manage.system;
import javax.swing.*;
import java.awt.*;
//used here to create a login for info of employees                        
public class login extends JFrame{
    login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        //user name label
        
        JLabel askusername=new JLabel("USERNAME");
        askusername.setBounds(40,20,100,20);
        add(askusername);
        
        //username textfeild
        JTextField tfusername=new JTextField();
        tfusername.setBounds(150,20,150,20);
        add(tfusername);

        //labelling field of password 
        JLabel passwords=new JLabel("PASSWORD");
        passwords.setBounds(40,40,100,20);
        add(passwords);

        //text field of password
         JTextField passkey=new JTextField();
        passkey.setBounds(150,40,150,20);
        add(passkey);
        
        //code of login button
        
        JButton testlogin = new JButton("LOGIN");
        testlogin.setBounds(150,60,150,30);
        testlogin.setBackground(Color.BLACK);
        testlogin.setForeground(Color.white);
        add(testlogin);

        setSize(600,300);
        setLocation(450,200);
        setVisible(true);
    }
    public static void main(String args[]){
        new login();
    }
    
}




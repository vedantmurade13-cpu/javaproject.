
package employee.manage.system;
import javax.swing.*;
import java.awt.*;
public class splash extends JFrame{
    
    splash(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1170,650);
        setVisible(true);
        setLocation(200,50);
        JLabel heading= new JLabel("Employee Management System ");
        heading.setBounds(180,30,1300,90);
        heading.setFont(new Font("serif",Font.PLAIN,60));
        heading.setForeground(Color.RED);
        add (heading);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2=i1.getImage().getScaledInstance(1100,700,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(50,100,1050,500);
        add(image);
        JButton clickhere=new JButton("Click Here To Continue");
        clickhere.setBounds(400,400,300,70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.white);
        image.add(clickhere);
     while(true){   
         heading.setVisible(false);
         try{
             Thread.sleep(200);
         }catch(Exception e){
             
         }
         
         heading.setVisible(true);
          heading.setVisible(false);
         try{
             Thread.sleep(200);
         }catch(Exception e){
             
         }
    }
    }
        public static void main(String args[]){
        new splash();
        
        
    }
    
}

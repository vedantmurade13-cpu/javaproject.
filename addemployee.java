package employee.manage.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class addemployee extends JFrame implements ActionListener{
    
    JButton addback,addbutton;
    JLabel heading,labelname ,labelfname ,labeldob, labelsalary, labeladdress ,labelfphone ,labelfemail, labeleducation, labeldesignation, labeladhar, labelempid;
    JTextField tname, tfname, tfsalary, tfaddress ,tfphone, tfemail ,tfdesignation, tfaadhar ,tfempid;
    JDateChooser dob;
    JComboBox cobeducation;
            
    Random rn=new Random();
    int number=rn.nextInt(99999);

    //menu bar to add employees
    addemployee(){
        getContentPane().setBackground(Color.white);
        setLayout(null);
    
    heading=new JLabel("Add employee details");
    heading.setBounds(250,10,500,50);
    heading.setFont(new Font("SAN_SERIF",Font.BOLD, 25));
    add(heading);
    
   
    labelname=new JLabel("Name");
    labelname.setBounds(30,65,150,50);
    labelname.setFont(new Font("SERIF",Font.PLAIN, 25));
    add(labelname);
    
     tname= new JTextField();
    tname.setBounds(175,70,300,30);
    add(tname);
    
     labelfname=new JLabel("Father's Name");
    labelfname.setBounds(30,100,150,50);
    labelfname.setFont(new Font("SERIF",Font.PLAIN, 25));
    add(labelfname); 
    
     tfname= new JTextField();
    tfname.setBounds(175,110,300,30);
    add(tfname);
    
    labeldob=new JLabel("Date of Birth");
    labeldob.setBounds(30,136,150,50);
    labeldob.setFont(new Font("SERIF",Font.PLAIN, 25));
    add(labeldob); 
    
    //JTextField tfdob= new JTextField();
    //tfdob.setBounds(200,150,300,30);
    //add(tfdob);
     dob = new JDateChooser();
    dob.setBounds(175,145,130,30);
    add(dob);
    
    labelsalary=new JLabel("Salary");
    labelsalary.setBounds(30,175,150,50);
    labelsalary.setFont(new Font("SERIF",Font.PLAIN, 25));
    add(labelsalary); 
    
    tfsalary= new JTextField();
    tfsalary.setBounds(175,186,300,30);
    add(tfsalary);
    
   labeladdress=new JLabel("Address");
    labeladdress.setBounds(30,215,150,50);
    labeladdress.setFont(new Font("SERIF",Font.PLAIN, 25));
    add(labeladdress);
    
     tfaddress= new JTextField();
    tfaddress.setBounds(175,225,300,30);
    add(tfaddress); 
    
    labelfphone=new JLabel("Phone");
    labelfphone.setBounds(30,257,150,50);
    labelfphone.setFont(new Font("SERIF",Font.PLAIN, 25));
    add(labelfphone); 
    
    tfphone= new JTextField();
    tfphone.setBounds(175,267,300,30);
    add(tfphone);
    
     labelfemail=new JLabel("Email");
    labelfemail.setBounds(30,297,150,50);
    labelfemail.setFont(new Font("SERIF",Font.PLAIN, 25));
    add(labelfemail); 
    
    tfemail= new JTextField();
    tfemail.setBounds(175,317,300,30);
    add(tfemail);
    
     labeleducation=new JLabel("Education");
    labeleducation.setBounds(495,60,150,50);
    labeleducation.setFont(new Font("SERIF",Font.PLAIN, 25));
    add(labeleducation); 
    
    String courses[]={"BBA","BCA","B.COM","B.TECH","B.E","MBA","MCA","MA","M.TECH","PHD"};
     cobeducation=new JComboBox(courses);
    cobeducation.setBounds(635,70,130,30);
    cobeducation.setFont(new Font("SERIF",Font.PLAIN, 25));
    add(cobeducation);
    
     labeldesignation=new JLabel("Designation");
    labeldesignation.setBounds(495,100,150,50);
    labeldesignation.setFont(new Font("SERIF",Font.PLAIN, 25));
    add(labeldesignation);
    
     tfdesignation= new JTextField();
    tfdesignation.setBounds(635,110,130,30);
    add(tfdesignation);
    
   labeladhar=new JLabel("Aadhar N0.");
    labeladhar.setBounds(495,140,150,50);
    labeladhar.setFont(new Font("SERIF",Font.PLAIN, 25));
    add(labeladhar);
    
     tfaadhar= new JTextField();
    tfaadhar.setBounds(635,150,130,30);
    add(tfaadhar);
    
     labelempid=new JLabel("Employee ID");
    labelempid.setBounds(495,180,150,50);
    labelempid.setFont(new Font("SERIF",Font.PLAIN, 25));
    add(labelempid);
    
    tfempid= new JTextField(""+number);
    tfempid.setBounds(635,190,130,30);
    add(tfempid);
    
     addbutton = new JButton("Add Details");
     addbutton.setBounds(175,380,170,30);
     addbutton.addActionListener(this);
     addbutton.setBackground(Color.BLACK);
     addbutton.setBackground(Color.white);
     add(addbutton);
        
      addback = new JButton("BACK");
     addback.setBounds(400,380,170,30);
     addback.addActionListener(this);
     addback.setBackground(Color.BLACK);
     addback.setBackground(Color.white);
     add(addback);
    
    
    setSize(800,500);
    setLocation(150,50);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==addbutton){
            String name=tname.getText();
            String fname=tfname.getText();
            String dateofbirth=((JTextField) dob.getDateEditor().getUiComponent()).getText();
            String salary=tfsalary.getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            String education=(String)cobeducation.getSelectedItem();
            String Designation=tfdesignation.getText();
            String aadharNo=tfaadhar.getText();
            String empID=tfempid.getText();
            
            try{
    connectsql c = new connectsql();
    String query = "insert into employee values('"+name+"','"+fname+"','"+dateofbirth+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+Designation+"','"+aadharNo+"','"+empID+"')";
    
    c.s.executeUpdate(query);

    JOptionPane.showMessageDialog(null,"Employee Details Added Successfully");
    setVisible(false);
    new home();
}
catch (Exception e){
    e.printStackTrace();
}
            
    }
        else if(ae.getSource()==addback){
        setVisible(false);
        new home();
    }
    }
    
    public static void main(String args[]){
    new addemployee();
    
}
}

package bank.managment.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t5,t6,t7,t8;
    JRadioButton r1,r2,r3,m1,m2,m3;
    JButton next;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 =(ran.nextLong() %9000l) +1000L;
    String first = " " + Math.abs(first4);

    signup(){
        super("APPLICATION FORM");

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel l1 = new JLabel("APPLICATION FORM NO."+first);
        l1.setBounds(160,20,600,40);
        l1.setFont(new Font("Raleway",Font.BOLD,38));
        add(l1);

        JLabel l2 = new JLabel("Page 1");
        l2.setFont(new Font("Ralway",Font.BOLD,22));
        l2.setBounds(330,70,600,30);
        add(l2);

        JLabel l3 = new JLabel("Personal Details");
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        l3.setBounds(290,90,600,30);
        add(l3);

        JLabel l4 = new JLabel("Name :");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(100,190,100,30);
        add(l4);

        t1 = new JTextField();
        t1.setFont(new Font("Raleway",Font.BOLD,14));
        t1.setBounds(300,190,400,30);
        add(t1);

        JLabel l5 = new JLabel("Father's Name :");
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        l5.setBounds(100,240,200,30);
        add(l5);

        t2 = new JTextField();
        t2.setFont(new Font("Raleway",Font.BOLD,14));
        t2.setBounds(300,240,400,30);
        add(t2);

        JLabel l6 = new JLabel("Date Of Birth :");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(100,340,200,30);
        add(l6);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel l7 = new JLabel("Gender :");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        l7.setBounds(100,290,200,30);
        add(l7);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(635,290,90,30);
        add(r3);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        JLabel l8 = new JLabel("Email address :");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(100,390,200,30);
        add(l8);

        t3 = new JTextField();
        t3.setFont(new Font("raleway",Font.BOLD,14));
        t3.setBounds(300,390,400,30);
        add(t3);

        JLabel l9 = new JLabel("Marital Status :");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(100,440,200,30);
        add(l9);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,100,30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,100,30);
        add(m2);

        m3 = new JRadioButton("other");
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(635,440,100,30);
        add(m3);

        ButtonGroup bgm = new ButtonGroup();
        bg.add(m1);
        bg.add(m2);
        bg.add(m3);


        JLabel l10 = new JLabel("Address :");
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        l10.setBounds(100,490,200,30);
        add(l10);

        t5 = new JTextField();
        t5.setFont(new Font("raleway",Font.BOLD,14));
        t5.setBounds(300,490,400,30);
        add(t5);

        JLabel l11 = new JLabel("City :");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(100,540,200,30);
        add(l11);

        t6 = new JTextField();
        t6.setFont(new Font("raleway",Font.BOLD,14));
        t6.setBounds(300,540,400,30);
        add(t6);

        JLabel l12 = new JLabel("Pin Code :");
        l12.setFont(new Font("Raleway",Font.BOLD,20));
        l12.setBounds(100,590,200,30);
        add(l12);

        t7 = new JTextField();
        t7.setFont(new Font("raleway",Font.BOLD,14));
        t7.setBounds(300,590,400,30);
        add(t7);

        JLabel l13 = new JLabel("State :");
        l13.setFont(new Font("Raleway",Font.BOLD,20));
        l13.setBounds(100,640,200,30);
        add(l13);

        t8 = new JTextField();
        t8.setFont(new Font("raleway",Font.BOLD,14));
        t8.setBounds(300,640,400,30);
        add(t8);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);




        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          String formno = first;
          String name = t1.getText();
          String fname = t2.getText();
          String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
          String gender = null;
          if(r1.isSelected()){
              gender = "male";
          }else if(r2.isSelected()){
              gender = "female";
          }else if(r3.isSelected()){
              gender = "Other";
          }
          String email = t3.getText();
          String married = null;
          if(m1.isSelected()){
              married = "married";
          }else if(m2.isSelected()){
              married = "unmarried";
          }else if(m3.isSelected()){
              married = "other";
          }
          String address = t5.getText();
          String city = t6.getText();
          String pincode = t7.getText();
          String state = t8.getText();

          try{
              if(t1.getText().equals("")){
                  JOptionPane.showMessageDialog(null, "Fill all the fields");

              }else{
                  con con1 = new con();

                  String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+married+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                  con1.statement.executeUpdate(q);
                  new signup2(formno);
                  setVisible(false);
              }
          }catch (Exception E){
              E.printStackTrace();
          }
    }

    public static void main(String[]args){
        new signup();
    }
}

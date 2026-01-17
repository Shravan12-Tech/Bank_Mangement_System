package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signup2 extends JFrame implements ActionListener {
    JComboBox cb,cb2,cb3,cb4,cb5;
    JTextField t1,t2;
    JRadioButton r1,r2,r3,r4;
    JButton next;
    String formno;
    signup2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2:");
        l1.setFont(new Font("Ralway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additonal Details");
        l2.setFont(new Font("Ralway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3= new JLabel("Religion :");
        l3.setFont(new Font("Ralway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"      ","Hindu","Muslim","Sikh","Chistian","Other"};
        cb = new JComboBox(religion);
        cb.setBackground(new Color(252,208,76));
        cb.setFont(new Font("Raleway",Font.BOLD,14));
        cb.setBounds(350,120,320,30);
        add(cb);

        JLabel l4= new JLabel("Category :");
        l4.setFont(new Font("Ralway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String Category[] = {"      ","General","OBC","SC","ST","Other"};
        cb2 = new JComboBox(Category);
        cb2.setBackground(new Color(252,208,76));
        cb2.setFont(new Font("Raleway",Font.BOLD,14));
        cb2.setBounds(350,170,320,30);
        add(cb2);

        JLabel l5= new JLabel("Income :");
        l5.setFont(new Font("Ralway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String Income[] = {"      ","Null","<1,50,000","<2,50,000","<500000","Upto 10,00,000","About 10,00,000"};
        cb3 = new JComboBox(Income);
        cb3.setBackground(new Color(252,208,76));
        cb3.setFont(new Font("Raleway",Font.BOLD,14));
        cb3.setBounds(350,220,320,30);
        add(cb3);

        JLabel l6= new JLabel("Education :");
        l6.setFont(new Font("Ralway",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);

        String education[] = {"      ","Non-Graduate","Graduate","Post-Graduate","Doctrate","Otheer"};
        cb4 = new JComboBox(education);
        cb4.setBackground(new Color(252,208,76));
        cb4.setFont(new Font("Raleway",Font.BOLD,14));
        cb4.setBounds(350,270,320,30);
        add(cb4);

        JLabel l7= new JLabel("Occupation :");
        l7.setFont(new Font("Ralway",Font.BOLD,18));
        l7.setBounds(100,340,150,30);
        add(l7);

        String Occupation[] = {"      ","Salaried","Self-Emploed","Business","Student","Retired","Otheer"};
        cb5 = new JComboBox(Occupation);
        cb5.setBackground(new Color(252,208,76));
        cb5.setFont(new Font("Raleway",Font.BOLD,14));
        cb5.setBounds(350,340,320,30);
        add(cb5);

        JLabel l8= new JLabel("PAN Number :");
        l8.setFont(new Font("Ralway",Font.BOLD,18));
        l8.setBounds(100,390,150,30);
        add(l8);

        t1 = new JTextField();
        t1.setFont(new Font("Ralway",Font.BOLD,18));
        t1.setBounds(350,390,320,30);
        add(t1);

        JLabel l9= new JLabel("Aadhar Number :");
        l9.setFont(new Font("Ralway",Font.BOLD,18));
        l9.setBounds(100,440,150,30);
        add(l9);

        t2 = new JTextField();
        t2.setFont(new Font("Ralway",Font.BOLD,18));
        t2.setBounds(350,440,320,30);
        add(t2);

        JLabel l10= new JLabel("Senior Citizen :");
        l10.setFont(new Font("Ralway",Font.BOLD,18));
        l10.setBounds(100,490,180,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,490,100,30);
        add(r2);

        JLabel l11= new JLabel("Existing Account :");
        l11.setFont(new Font("Ralway",Font.BOLD,18));
        l11.setBounds(100,540,180,30);
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Ralway",Font.BOLD,14));
        r3.setBackground(new Color(252,208,76));
        r3.setBounds(350,540,100,30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Ralway",Font.BOLD,14));
        r4.setBackground(new Color(252,208,76));
        r4.setBounds(460,540,100,30);
        add(r4);

        ButtonGroup bge = new ButtonGroup();
        bge.add(r1);
        bge.add(r2);
        ButtonGroup bga = new ButtonGroup();
        bga.add(r3);
        bga.add(r4);


        JLabel l12= new JLabel("Form No :");
        l12.setFont(new Font("Ralway",Font.BOLD,18));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13= new JLabel(formno);
        l13.setFont(new Font("Ralway",Font.BOLD,18
        ));
        l13.setBounds(700,30,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) cb.getSelectedItem();
        String cate = (String) cb2.getSelectedItem();
        String inc = (String) cb3.getSelectedItem();
        String edu = (String) cb4.getSelectedItem();
        String occ = (String) cb5.getSelectedItem();

        String pan = t1.getText();
        String adh = t2.getText();

        String sc = null;
        if (r1.isSelected()) {
            sc = "Yes";
        } else if (r2.isSelected()) {
            sc = "No";
        }

        String ea = null;
        if (r3.isSelected()) {
            ea = "Yes";
        } else if (r4.isSelected()) {
            ea = "No";
        }
        try{
            if(t1.getText().equals("")|| t2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the field");
            }else{
                con c1 = new con();
                String q1 = "insert into signup2 values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+adh+"','"+sc+"','"+ea+"')";
                c1.statement.executeUpdate(q1);
                new signup3(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[]args){
        new signup2("");
    }
}

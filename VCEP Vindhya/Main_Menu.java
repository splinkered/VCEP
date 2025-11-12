import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;

import java.io.*;
import java.lang.*;


public class Main_Menu{  
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int)screenSize.getWidth();
    int height = (int)screenSize.getHeight();
    //horizontal and vertical row size
    int hrs = height/10; //screen divided in 10 parts 3+1+2+1+2+1
    int vrs = width/9; //screen divided in 9 parts 1+2+3+2+1
    
    JFrame mm = new JFrame();
    private JLabel header;
    private JButton start;
    
    private JLabel instruct1;
    private JLabel instruct2;
    private JLabel instructhead;

    public Main_Menu(){
        sc1 fs = new sc1(); 
        mm.setTitle("VCEP");
        mm.setSize(width,height);
        
        mm.setUndecorated(true);
        
        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(width, height));
        contentPane.setBackground(new Color(255,255,255));
        
        instructhead = new JLabel();
        instructhead.setBounds((vrs*1),(hrs*4),(vrs*7),(hrs));
        instructhead.setBackground(new Color(255,255,255));
        instructhead.setForeground(new Color(200,0,0));
        instructhead.setEnabled(true);
        instructhead.setFont(new Font("SansSerif",0,(hrs*3/4)));
        instructhead.setText("Instructions");
        instructhead.setVisible(true);
        
        JLabel credit = new JLabel();
        credit.setBounds((20),(height-hrs),(vrs*7),(hrs));
        credit.setBackground(new Color(255,255,255));
        credit.setForeground(new Color(0, 71, 171));
        credit.setEnabled(true);
        credit.setFont(new Font("SansSerif",0,(hrs*1/3)));
        credit.setText("By Pragnesh Patil");
        credit.setVisible(true);
        
        instruct1 = new JLabel();
        instruct1.setBounds((vrs*1),(hrs*5),(vrs*7),(hrs));
        instruct1.setBackground(new Color(255,255,255));
        instruct1.setForeground(new Color(200,0,0));
        instruct1.setEnabled(true);
        instruct1.setFont(new Font("SansSerif",0,(hrs*3/4)));
        instruct1.setText("You can't change your choices once ");
        instruct1.setVisible(true);
        
        instruct2 = new JLabel();
        instruct2.setBounds((vrs*1),(hrs*6),(vrs*7),(hrs));
        instruct2.setBackground(new Color(255,255,255));
        instruct2.setForeground(new Color(200,0,0));
        instruct2.setEnabled(true);
        instruct2.setFont(new Font("SansSerif",0,(hrs*3/4)));
        instruct2.setText("you have pressed \'next\' button");
        instruct2.setVisible(true);      
        
        start = new JButton();
        start.setBounds((3*vrs),(hrs*7), (vrs*3), (hrs*2));
        start.setBackground(new Color(0, 71, 171));
        start.setForeground(new Color(255,255,255));
        start.setEnabled(true);
        start.setFont(new Font("SansSerif",1,hrs));
        start.setText("Start");
        start.setVisible(true);
        start.addActionListener( e ->{
            fs.screen1();
            mm.dispose();
        });
        
        try{
            BufferedImage hdr = ImageIO.read(new File("./res/header/headr.png"));
            Image schdr = hdr.getScaledInstance(width,(hrs*3),Image.SCALE_DEFAULT);
            
            header = new JLabel(new ImageIcon(hdr));
            header.setBounds(0,0,width,(hrs*3));
            
            mm.add(header);
            
         }catch(Exception e){}
         
         start.setFocusPainted(false);

        //adding panel to JFrame and seting of window position and close operation
        mm.add(start);
        mm.add(credit);
        mm.add(instruct1);
        mm.add(instruct2);
        mm.add(instructhead);
        mm.add(contentPane);
        
        mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mm.setLocationRelativeTo(null);
        mm.pack();
        mm.setVisible(true);
    }
}
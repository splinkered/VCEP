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


public class sc7{
    Xcel_Man xman = new Xcel_Man();

    private JMenuBar menuBar;
    private JRadioButton c4;
    private JRadioButton c1;
    private JRadioButton c10;
    private JRadioButton c2;
    private JRadioButton c3;
    private JRadioButton c5;
    private JRadioButton c6;
    private JRadioButton c7;
    private JRadioButton c8;
    private JRadioButton c9;
    private JLabel ml;
    private JButton next;
    private JLabel header;
    
    JFrame scr4 = new JFrame();
    
    
    String pst = "Nilgiri House Captain";
    String pth = "./res/db/nilgiri_house_captain.csv";
    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)screenSize.getWidth();
        int height = (int)screenSize.getHeight();
        
        //straight parts; 4 for label and header, 5 for options, 1/2+1/2 for spacing and 1 more for next button
        int sp = height/11;
        
        //loopy parts; 12 parts 1(spacing)+4(option)+1(spacing)+4(option)+1(option)
        int lp = width/12;

    public void screen7(){
        altsc8 ns = new altsc8();
        
        scr4.setTitle("VCEP");
        scr4.setSize(width,height);      

        scr4.setJMenuBar(menuBar);
        scr4.setUndecorated(true);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(width,height));
        contentPane.setBackground(new Color(255,255,255));
        
        
        c1 = new JRadioButton();
        c1.setBounds((lp),(sp*9/2),(lp*4),(sp));
        c1.setBackground(new Color(255,255,255));
        c1.setForeground(new Color(0,0,0));
        c1.setEnabled(true);
        c1.setFont(new Font("SansSerif",0,24));
        c1.setText("John Doe");
        c1.setVisible(true);
        
        c2 = new JRadioButton();
        c2.setBounds((lp),(sp*11/2),(lp*4),(sp));
        c2.setBackground(new Color(255,255,255));
        c2.setForeground(new Color(0,0,0));
        c2.setEnabled(true);
        c2.setFont(new Font("SansSerif",0,24));
        c2.setText("Criag Swan");
        c2.setVisible(true);
        
        int hrs = height/10;
        int vrs = width/9;
        JLabel credit = new JLabel();
        credit.setBounds((20),(height-hrs),(vrs*7),(hrs));
        credit.setBackground(new Color(255,255,255));
        credit.setForeground(new Color(0, 71, 171));
        credit.setEnabled(true);
        credit.setFont(new Font("SansSerif",0,(hrs*1/3)));
        credit.setText("By Pragnesh Patil");
        credit.setVisible(true);
        contentPane.add(credit);

        c3 = new JRadioButton();
        c3.setBounds((lp),(sp*13/2),(lp*4),(sp));
        c3.setBackground(new Color(255,255,255));
        c3.setForeground(new Color(0,0,0));
        c3.setEnabled(true);
        c3.setFont(new Font("SansSerif",0,24));
        c3.setText("Joe Mama");
        c3.setVisible(true);
        
        c4 = new JRadioButton();
        c4.setBounds((lp),(sp*15/2),(lp*4),(sp));
        c4.setBackground(new Color(255,255,255));
        c4.setForeground(new Color(0,0,0));
        c4.setEnabled(true);
        c4.setFont(new Font("SansSerif",0,24));
        c4.setText("Janus Bonk");
        c4.setVisible(true);

        c5 = new JRadioButton();
        c5.setBounds((lp),(sp*17/2),(lp*4),(sp));
        c5.setBackground(new Color(255,255,255));
        c5.setForeground(new Color(0,0,0));
        c5.setEnabled(true);
        c5.setFont(new Font("SansSerif",0,24));
        c5.setText("Cadet Muska");
        c5.setVisible(true);

        c6 = new JRadioButton();
        c6.setBounds((lp*6),(sp*9/2),(lp*4),(sp));
        c6.setBackground(new Color(255,255,255));
        c6.setForeground(new Color(0,0,0));
        c6.setEnabled(true);
        c6.setFont(new Font("SansSerif",0,24));
        c6.setText("Juan Uke");
        c6.setVisible(true);

        c7 = new JRadioButton();
        c7.setBounds((lp*6),(sp*11/2),(lp*4),(sp));
        c7.setBackground(new Color(255,255,255));
        c7.setForeground(new Color(0,0,0));
        c7.setEnabled(true);
        c7.setFont(new Font("SansSerif",0,24));
        c7.setText("Gus Thompson");
        c7.setVisible(true);

        c8 = new JRadioButton();
        c8.setBounds((lp*6),(sp*13/2),(lp*4),(sp));
        c8.setBackground(new Color(255,255,255));
        c8.setForeground(new Color(0,0,0));
        c8.setEnabled(true);
        c8.setFont(new Font("SansSerif",0,24));
        c8.setText("Sawyer Timmy");
        c8.setVisible(true);

        c9 = new JRadioButton();
        c9.setBounds((lp*6),(sp*15/2),(lp*4),(sp));
        c9.setBackground(new Color(255,255,255));
        c9.setForeground(new Color(0,0,0));
        c9.setEnabled(true);
        c9.setFont(new Font("SansSerif",0,24));
        c9.setText("Justin Lork");
        c9.setVisible(true);
        
        c10 = new JRadioButton();
        c10.setBounds((lp*6),(sp*17/2),(lp*4),(sp));
        c10.setBackground(new Color(255,255,255));
        c10.setForeground(new Color(0,0,0));
        c10.setEnabled(true);
        c10.setFont(new Font("SansSerif",0,24));
        c10.setText("Peter Samuel");
        c10.setVisible(true);

        ml = new JLabel();
        ml.setBounds((width*3/8),(sp*3),width,(sp*2));
        ml.setBackground(new Color(255,255,255));
        ml.setForeground(new Color(0,0,0));
        ml.setEnabled(true);
        ml.setFont(new Font("SansSerif",0,(sp*7/10)));
        ml.setText(pst);
        ml.setVisible(true);

        next = new JButton();
        next.setBounds((width-(lp*7/2)),(sp*19/2),(lp*3),(sp));
        next.setBackground(new Color(0, 71, 171));
        next.setForeground(new Color(255,255,255));
        next.setEnabled(true);
        next.setFont(new Font("SansSerif",1,32));
        next.setText("Next");
        next.setVisible(true);
        next.addActionListener(e ->{
         xman.read(pth);
          xman.regPost(pst);
          xman.print();
          
          int vr = 0;
          
          xman.getVotes();
          if(c1.isSelected() == true){
              xman.edit(1);          
              xman.write(pth);
              xman.print();
              xman.clear();
              vr = 1;
          }else if(c2.isSelected() == true){
              xman.edit(2);          
              xman.write(pth);
              xman.print();
              xman.clear();
              vr = 1;
          }else if(c3.isSelected() == true){
              xman.edit(3);          
              xman.write(pth);
              xman.print();
              xman.clear();
              vr = 1;
          }else if(c4.isSelected() == true){
              xman.edit(4);          
              xman.write(pth);
              xman.print();
              xman.clear();
              vr = 1;
          }else if(c5.isSelected() == true){
              xman.edit(5);          
              xman.write(pth);
              xman.print();
              xman.clear();
              vr = 1;
          }else if(c6.isSelected() == true){
              xman.edit(6);          
              xman.write(pth);
              xman.print();
              xman.clear();
              vr = 1;
          }else if(c7.isSelected() == true){
              xman.edit(7);          
              xman.write(pth);
              xman.print();
              xman.clear();
              vr = 1;
          }else if(c8.isSelected() == true){
              xman.edit(8);          
              xman.write(pth);
              xman.print();
              xman.clear();
              vr = 1;
          }else if(c9.isSelected() == true){
              xman.edit(9);          
              xman.write(pth);
              xman.print();
              xman.clear();
              vr = 1;
          }else if(c10.isSelected() == true){
              xman.edit(10);          
              xman.write(pth);
              xman.print();
              xman.clear();
              vr = 1;
          }
          if(vr ==1){
              vr=0;
            ns.screen8();
            scr4.dispose();
        }
        });
        
        //button shiz
        ButtonGroup candidates =  new ButtonGroup();
        candidates.add(c1);
        candidates.add(c2);
        candidates.add(c3);
        candidates.add(c4);
        candidates.add(c5);
        candidates.add(c6);
        candidates.add(c7);
        candidates.add(c8);
        candidates.add(c9);
        candidates.add(c10);
        
        //setting up header
        try{
            BufferedImage hdr = ImageIO.read(new File("./res/header/headr.png"));
            Image schdr = hdr.getScaledInstance(width,(sp*3),Image.SCALE_DEFAULT);
            
            header = new JLabel(new ImageIcon(hdr));
            header.setBounds(0,0,width,(sp*3));
            
            scr4.add(header);
            
                }catch(Exception e){}
                
        c1.setFocusPainted(false);
        c2.setFocusPainted(false);
        c3.setFocusPainted(false);
        c4.setFocusPainted(false);
        c5.setFocusPainted(false);
        c6.setFocusPainted(false);
        c7.setFocusPainted(false);
        c8.setFocusPainted(false);
        c9.setFocusPainted(false);
        c10.setFocusPainted(false);
        next.setFocusPainted(false);  
        
        //adding components to contentPane panel
        contentPane.add(c4);
        contentPane.add(c1);
        contentPane.add(c10);
        contentPane.add(c2);
        contentPane.add(c3);
        contentPane.add(c5);
        contentPane.add(c6);
        contentPane.add(c7);
        contentPane.add(c8);
        contentPane.add(c9);
        contentPane.add(ml);
        contentPane.add(next);

        //adding panel to JFrame and seting of window position and close operation
        scr4.add(contentPane);
        scr4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scr4.setLocationRelativeTo(null);
        scr4.pack();
        scr4.setVisible(true);
    }
}

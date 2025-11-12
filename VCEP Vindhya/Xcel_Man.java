import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.*;  

public class Xcel_Man
{
    //data
    String[] p1;
    String[] p2;
    String[] p3;
    String[] p4;
    String[] p5;
    String[] p6;
    String[] p7;
    String[] p8;
    String[] p9;
    String[] p10;
    String[] p11;
    String[] p12;
    //votes
    int l1;
    int l2;
    int l3;
    int l4;
    int l5;
    int l6;
    int l7;
    int l8;
    int l9;
    int l10;
    
    String[] tpPost;
    String post;    
    
    public void read(String path){
        String line = "";  
        String splitBy = ",";  
       
        try   
        {            
            BufferedReader br = new BufferedReader(new FileReader(path));  
            line = br.readLine();
            tpPost = line.split(splitBy);
            post = tpPost[0];
            
            line = br.readLine();
            line = br.readLine();
            line = br.readLine();
            p1 = line.split(splitBy);
            line = br.readLine();
            p2 = line.split(splitBy);
            line = br.readLine();
            p3 = line.split(splitBy);
            line = br.readLine();
            p4 = line.split(splitBy);
            line = br.readLine();
            p5 = line.split(splitBy);
            line = br.readLine();
            p6 = line.split(splitBy);
            line = br.readLine();
            p7 = line.split(splitBy);
            line = br.readLine();
            p8 = line.split(splitBy);
            line = br.readLine();
            p9 = line.split(splitBy); 
            line = br.readLine();
            p10 = line.split(splitBy); 
            
            }catch (IOException e){e.printStackTrace();}             
    }
    public void do11(String npath){
        //read
        try{
        BufferedReader br = new BufferedReader(new FileReader(npath));  
        String line = "";  
        String splitBy = ",";  
           line = br.readLine();
            tpPost = line.split(splitBy);
            post = tpPost[0];
            
            line = br.readLine();
            line = br.readLine();
            line = br.readLine();
            p11 = line.split(splitBy);           
            line = br.readLine();
            p12 = line.split(splitBy);         
            
            int l11= Integer.valueOf(p11[1])+1; 
            int l12= Integer.valueOf(p12[1]);      
            //write
             FileWriter writer = new FileWriter(npath);
            writer.write(post+","+"");
            writer.write("\n"+","+",");
            writer.write("\n"+"Candidates,"+"Votes,");
            writer.write("\n"+p11[0]+","+l11+",");          
            writer.write("\n"+p12[0]+","+l12+",");          
            writer.write("\n"+","+",");
            writer.close();
            System.out.println("Successfully wrote to the file.");            
           
        p11[1]="";p11[0]="";
        p12[1]="";p12[0]="";
        l11=0;
        }catch(Exception e){e.printStackTrace();}
        
        
    }  public void do12(String path){
        //read
        try{
        BufferedReader br = new BufferedReader(new FileReader(path));  
        String line = "";  
        String splitBy = ",";  
           line = br.readLine();
            tpPost = line.split(splitBy);
            post = tpPost[0];
            
            line = br.readLine();
            line = br.readLine();
            line = br.readLine();
            p11 = line.split(splitBy);           
            line = br.readLine();
            p12 = line.split(splitBy);         
            
            int l12= Integer.valueOf(p12[1])+1; 
            int l11= Integer.valueOf(p11[1]);      
            //write
             FileWriter writer = new FileWriter(path);
            writer.write(post+","+"");
            writer.write("\n"+","+",");
            writer.write("\n"+"Candidates,"+"Votes,");
            writer.write("\n"+p11[0]+","+l11+",");          
            writer.write("\n"+p12[0]+","+l12+",");          
            writer.write("\n"+","+",");
            writer.close();
            System.out.println("Successfully wrote to the file.");            
           
        p11[1]="";p11[0]="";
        p12[1]="";p12[0]="";
        l11=0;
        }catch(Exception e){e.printStackTrace();}
        
        
    }
    public void getVotes(){
        l1= Integer.valueOf(p1[1]);        
        l2= Integer.valueOf(p2[1]); 
        l3= Integer.valueOf(p3[1]); 
        l4= Integer.valueOf(p4[1]); 
        l5= Integer.valueOf(p5[1]); 
        l6= Integer.valueOf(p6[1]); 
        l7= Integer.valueOf(p7[1]); 
        l8= Integer.valueOf(p8[1]); 
        l9= Integer.valueOf(p9[1]); 
        l10= Integer.valueOf(p10[1]); 
    }
    public void regPost(String p){
        post = p;
    }
    public void write(String path){
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(post+","+"");
            writer.write("\n"+","+",");
            writer.write("\n"+"Candidates,"+"Votes,");
            writer.write("\n"+p1[0]+","+l1+",");
            writer.write("\n"+p2[0]+","+l2+",");
            writer.write("\n"+p3[0]+","+l3+",");
            writer.write("\n"+p4[0]+","+l4+",");
            writer.write("\n"+p5[0]+","+l5+",");
            writer.write("\n"+p6[0]+","+l6+",");
            writer.write("\n"+p7[0]+","+l7+",");
            writer.write("\n"+p8[0]+","+l8+",");
            writer.write("\n"+p9[0]+","+l9+",");
            writer.write("\n"+p10[0]+","+l10+",");
            writer.write("\n"+","+",");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {}
    }
    public void edit(int cand){
        if(cand==1){
            l1 = Integer.valueOf(p1[1])+1;
        }else if(cand==2){
            l2 = Integer.valueOf(p2[1]) + 1;
        }else if(cand==3){
            l3 = Integer.valueOf(p3[1])+1;
        }else if(cand==4){
            l4 = Integer.valueOf(p4[1])+1;
        }else if(cand==5){
            l5 = Integer.valueOf(p5[1])+1;
        }else if(cand==6){
            l6 = Integer.valueOf(p6[1])+1;
        }else if(cand==7){
            l7 = Integer.valueOf(p7[1])+1;
        }else if(cand==8){
            l8 = Integer.valueOf(p8[1])+1;
        }else if(cand==9){
            l9 = Integer.valueOf(p9[1])+1;
        }else if(cand==10){
            l10 = Integer.valueOf(p10[1])+1;
        }
    }
    public void clear(){
        p1[1]="";p1[0]="";
        p2[1]="";p2[0]="";
        p3[1]="";p3[0]="";
        p4[1]="";p4[0]="";
        p5[1]="";p5[0]="";
        p6[1]="";p6[0]="";
        p7[1]="";p7[0]="";
        p8[1]="";p8[0]="";
        p9[1]="";p9[0]="";
        p10[1]="";p10[0]="";
        
        l1=0;
        l2=0;
        l3=0;
        l4=0;
        l5=0;
        l6=0;
        l7=0;
        l8=0;
        l9=0;
        l10=0;
    }
    //for debugginh
    public void print(){
        //scraping up 4 now
        //System.out.println(p1[0]+","+p1[1]);
        // System.out.println(p2[0]+","+p2[1]);
        // System.out.println(p3[0]+","+p3[1]);
        // System.out.println(p4[0]+","+p4[1]);
        // System.out.println(p5[0]+","+p5[1]);
        // System.out.println(p6[0]+","+p6[1]);
        // System.out.println(p7[0]+","+p7[1]);
        // System.out.println(p8[0]+","+p8[1]);
        // System.out.println(p9[0]+","+p9[1]);
        // System.out.println(p10[0]+","+p10[1]);
    }
}

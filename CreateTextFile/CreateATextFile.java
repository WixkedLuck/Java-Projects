/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createatextfile;
import java.io.*;
import java.util.*; 
import java.io.IOException; 
/**
 *
 * @author garde
 */
public class CreateATextFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
   
     int k=0 ;
        int[] sortarray=null; 
        String[] Num=null; 
        java.io.File test=new java.io.File("Exercise17_01.txt");
                if(test.exists()){
                System.out.println("file already exists");
                 }
            java.io.PrintWriter out= new java.io.PrintWriter(test); 
            
            
      while (k!=100){
          int l=(int)(1+Math.random()*101);
    out.print(l+" "); 
    k++;
      }
    out.close();
      
    
    Scanner in= new Scanner(new File("Exercise17_01.txt"));
    
    while(in.hasNext()){
    String allnumbers=in.nextLine(); 
    Num=allnumbers.split(" "); 
    
    }
    sortarray=new int[Num.length];    
    for(int i=0; i<Num.length; i++){
    sortarray[i]=Integer.parseInt(Num[i]); 
    }
   
    
    for(int j=0; j<sortarray.length; j++){
    System.out.println(sortarray[j]);
    }
    
    
    
    }




























}

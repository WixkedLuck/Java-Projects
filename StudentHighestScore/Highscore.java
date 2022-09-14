/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highscore;
import java.util.Scanner; 
/**
 *
 * @author garde
 */
public class Highscore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in); 
        System.out.println("Enter number of studemts ");
        int stud=input.nextInt(); 
        int total=0; 
       double test=0; 
       String s2="c";
        while(stud!=total)
        {
            System.out.println("Enter name of student ");
            String s1=input.next(); 
            System.out.println("Enter score");
            double score=input.nextDouble(); 
            if (score>test)
                test=score; 
             s2=s1; 
            
        total++;}
        System.out.println(s2+" had the highest score");
        
    }
    
}

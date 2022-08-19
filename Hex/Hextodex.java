/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hybner;

/**
 *
 * @author garde
 */
public class Hextodex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(Hexadecimal("CAB"));
       System.out.println(Hexadecimal("A10"));
       System.out.println(Hexadecimal("E8"));
       System.out.println(Hexadecimal("ABC"));
       System.out.println(Hexadecimal("5K;"));
    
       
    }
    public static int Hexadecimal(String hex){
    int a=convertionofHexatoDec(hex.charAt(0)); 
    for (int i=1;i<hex.length();i++){
    a=a*16+hex.charAt(i)-'0';
    
    } return a; 
    }
    static int convertionofHexatoDec(char ch){
    if(ch=='A'){return 10;}
    else if(ch=='B'){return 11;}
    else if(ch=='C'){return 12;}
    else if(ch=='D'){return 13;}
    else if(ch=='E'){return 14;}
    else if(ch=='A'){return 15;}
    else if(ch<='9'&&ch>='0'){return ch-'0';}
    else throw new NumberFormatException("Illegal character"+ch); 
    }
}

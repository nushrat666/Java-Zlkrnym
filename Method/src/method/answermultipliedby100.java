/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import java.util.Scanner;

/**
 *
 * @author Tuli
 */
public class answermultipliedby100 {
    static Scanner myscanner=new Scanner(System.in);
    
    public static void main(String[] args) {
        int firstNumber ;
       System.out.print("Please give us a number to be multiplied by 100: ");
            firstNumber=myscanner.nextInt();
    int resultnew = prokriya(firstNumber); 
        

        System.out.println(resultnew);      
             
    }
    static public int prokriya(int firstvalue){
       int answer=firstvalue*=100;
       return answer;
   }
}


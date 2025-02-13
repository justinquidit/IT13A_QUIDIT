
package Prelim;
//import java.util.Scanner;
public class Act1_Arithmetic_Operators {
    public static void main(String[] org){
        
        //Scanner scan = new Scanner(System.in); 
       //boolean op = true;
        //while(op){
        //System.out.print("input firt number = ");
          //int opop = scan.nextInt();
          // System.out.print("input second number = ");
         // int opop1 = scan.nextInt();
           
        int numb1 = 10;
        int numb2 = 6;
        int numb3 = 4;
        int numb4 = 3;
        
        //int opopsolt = opop+opop1;
        
        int show1 = numb1 * numb3 + numb2;
        int backup1 = numb1 - numb3;
        int show2 = backup1 % numb2;
        int backup2 = numb1 + numb3 + numb2;
        int show3 = backup2 / numb4;
        int backup3 = numb3 * numb3;
        int show4 = numb1 * numb2 - backup3;
        
          System.out.println("10 * 4 + 6 ="+show1);
         System.out.println("(10-4) % 6 = "+show2);
            System.out.println("(10 + 4 + 6)/3 = "+show3);
               System.out.println("10 * 6 -(4 * 4 ) = "+show4);
               //System.out.println("result = "+ opopsolt);
          
}
}
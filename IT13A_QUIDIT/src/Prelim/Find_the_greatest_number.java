
package Prelim;
import java.util.Scanner;
public class Find_the_greatest_number {
    
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    boolean u = true;
    while(u){
        
    System.out.println("Input the first number");
    int z = scan.nextInt();
    
    System.out.println("Input the second number");
    int x = scan.nextInt();
    
    System.out.println("Input the third number");
    int c = scan.nextInt();
       
    if(z >x && z>c){System.out.println("the greatest number is : "+z);
    
    }else if(x >z && x>c){System.out.println("the greatest number is : "+x);
    
    }else if(c>x && c>z){ System.out.println("the greatest number is : "+c);
    
    }else{System.out.println("kjasbdksadk");}
    }
    }
}
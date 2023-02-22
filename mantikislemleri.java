package deneme2;

import java.util.Scanner;

public class Deneme2 {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Fist number :");
        int num1 = s.nextInt();
        System.out.print("Enter Sec number :");
        int num2 = s.nextInt();
        
        if(num1>num2){
        System.out.println("first number:"+num1+" bigger than second number:"+num2);
        }
        else{
        System.out.println("second number:"+num2+" bigger than first number:"+num1);
                }
        
        if(num1==num2){
        System.out.println("Numbers are equal.");
        }
        else{
        System.out.println("Numbers are not equal.");
                }
        
        
        if(num1>=num2){
        System.out.println("first number:"+num1+" equal or bigger than second number:"+num2);
        }
        else{
        System.out.println("second number:"+num2+" equal or bigger than first number:"+num1);
                }
    }
}

package deneme2;

import java.util.Scanner;

public class Deneme2 {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Fist number :");
        int num1 = s.nextInt();
        System.out.print("Enter Sec number :");
        int num2 = s.nextInt();
        System.out.print("Enter Third number :");
        int num3 = s.nextInt();
        
        if(num1>num2 && num1>num3 && num2>num3){
        System.out.println("Number 1 >Number 2> Number3");
        }
        else if(num1>num2 && num1>num3 && num3>num2){
            System.out.println("Number 1 >Number 3> Number2");
        }
        else if(num2>num1 && num2>num3 && num1>num3){
            System.out.println("Number 2 >Number 1> Number3");
        }
        else if(num2>num1 && num2>num3 && num3>num1){
            System.out.println("Number 2 >Number 3> Number1");
        }
        else if(num3>num1 && num3>num2 && num1>num2){
            System.out.println("Number 3 >Number 1> Number2");
        }
        else if(num3>num1 && num3>num2 && num2>num1){
            System.out.println("Number 3 >Number 2> Number1");
        }
        else{
            System.out.println("Two or more numbers are equal");
        }
        
        }
        
}

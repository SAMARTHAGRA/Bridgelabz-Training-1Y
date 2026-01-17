import java.util.Scanner;

public class SumOfTwoNum{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number :");
        int num1= sc.nextInt();

        System.out.println("Enter Second Number :");    
        int num2 =sc.nextInt();

        int sum = num1 + num2; 

        System.out.println("Sum of Two Number is :" + sum);
       sc.close();                     
    }
}
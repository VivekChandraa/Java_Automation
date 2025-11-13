package Test;

import java.util.Scanner;

public class GreaterSmallerNumber {
    public static void main(String[] args) {
        System.out.println("Enter number 1");
        Scanner sc= new Scanner(System.in);
        int num1= sc.nextInt();

        System.out.println("Enter number 2");
        int num2= sc.nextInt();

        if (num1>=num2){
            System.out.println("Max is---->"+num1);
        }
        else {
            System.out.println("Max is---->"+num2);
        }
        sc.close();
        }
}

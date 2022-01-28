package algorelated;

import java.util.Scanner;

public class SumTwoDigit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, sum;

        System.out.print("Enter Frist Number : ");
        num1 = input.nextInt();
        System.out.print("Enter Second Number : ");
        num2 = input.nextInt();

        input.close();

        sum = num1 + num2;

        System.out.println("Sum of these number : " + sum);

    }

}

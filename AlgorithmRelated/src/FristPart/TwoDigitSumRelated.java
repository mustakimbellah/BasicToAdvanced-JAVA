package FristPart;

import java.util.Scanner;

public class TwoDigitSumRelated {

    static int sunofTwoDigits(int frist_digit, int second_digit) {

        return frist_digit + second_digit;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(sunofTwoDigits(a, b));

    }

}

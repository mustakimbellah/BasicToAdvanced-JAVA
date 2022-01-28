package FlowControl;

import java.util.Scanner;

public class SwitchCaseTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Charecter to Check: ");
        char ch = sc.next().charAt(0);

        /*
        
        if(ch=='a' || ch=='e' || ch=='i'||ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I'||ch=='O' || ch=='U')
        {
            System.out.println(ch+"is a vowel");  
        }
        else
        {
            System.out.println(ch+"is a consonant");
        }

         */
        switch (ch) {
            case 'a':

                System.out.println(ch + " is a vowel");

                break;

            case 'e':

                System.out.println(ch + " is a vowel");

                break;

            case 'i':

                System.out.println(ch + " is a vowel");

                break;

            case 'o':

                System.out.println(ch + " is a vowel");

                break;

            case 'u':

                System.out.println(ch + " is a vowel");

                break;

            case 'A':

                System.out.println(ch + " is a vowel");

                break;

            case 'E':

                System.out.println(ch + " is a vowel");

                break;

            case 'I':

                System.out.println(ch + " is a vowel");

                break;

            case 'O':

                System.out.println(ch + " is a vowel");

                break;

            case 'U':

                System.out.println(ch + " is a vowel");

                break;

            default:

                System.out.println(ch + " is a consonant");
        }

    }

}

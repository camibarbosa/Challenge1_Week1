package Q03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int test = 1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            int inputNumber = sc.nextInt();
            if (inputNumber == 0) {
                break;
            }

            int result = 0;
            char operator = '+';
            for (int i = 0; i < inputNumber; i++) {
                int numberChosen = sc.nextInt();
                if (operator != '+') {
                    result -= numberChosen;
                } else {
                    result += numberChosen;
                }

                if (i < inputNumber - 1) {
                    operator = sc.next().charAt(0);
                }
            }

            System.out.println("Test " + test++);
            System.out.println(result);
            System.out.println();
        }
        sc.close();
    }
}

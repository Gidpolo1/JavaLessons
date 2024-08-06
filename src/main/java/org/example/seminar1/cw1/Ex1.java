package org.example.seminar1.cw1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // todo: сканнер
        int n = scanner.nextInt();
        int result = getSumMinusPr(n);
        System.out.println("Result = " + result);
    }

    /**
     * @apiNote описание
     * @param n начальное значение
     * @return произведение минус сумма
     */
    private static int getSumMinusPr(int n) {
        int sum = 0;
        int pr = 1;
        while (n != 0) {
            sum += n % 10;
            pr *= n % 10;
            n /= 10;
        }
        return pr - sum;
    }
}



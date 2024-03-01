/*
Print the following pattern for the given N number of rows.
Pattern for N = 3
A
BB
CCC

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 26

Sample Input 1:
7

Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG


Sample Input 2:
6


Sample Output 2:
A
BB
CCC
DDDD
EEEEE
FFFFFF


 */



package beginner_dsa.step0.pattren2;

import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value ranging from 3 to 7");
        int n = sc.nextInt();
        switch (n) {
            case 3:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        System.out.print((char) (65 + i));
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        System.out.print((char) (65 + i));
                    }
                    System.out.println();
                }
                break;
            case 5:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        System.out.print((char) (65 + i));
                    }
                    System.out.println();
                }
                break;
            case 6:
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        System.out.print((char) (65 + i));
                    }
                    System.out.println();
                }
                break;
            case 7:
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < i + 1; j++) {
                        System.out.print((char) (65 + i));
                    }
                    System.out.println();
                }
                break;
        }

    }
}

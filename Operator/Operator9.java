import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
         int notes500 = 0, notes100 = 0, notes50 = 0, notes20 = 0;
         int notes10 = 0, notes5 = 0, notes2 = 0, notes1 = 0;

    // Start calculating from the highest note
    if (amount >= 500) {
        notes500 = amount / 500;
        amount %= 500;
    }
    if (amount >= 100) {
        notes100 = amount / 100;
        amount %= 100;
    }
    if (amount >= 50) {
        notes50 = amount / 50;
        amount %= 50;
    }
    if (amount >= 20) {
        notes20 = amount / 20;
        amount %= 20;
    }
    if (amount >= 10) {
        notes10 = amount / 10;
        amount %= 10;
    }
    if (amount >= 5) {
        notes5 = amount / 5;
        amount %= 5;
    }
    if (amount >= 2) {
        notes2 = amount / 2;
        amount %= 2;
    }
    if (amount >= 1) {
        notes1 = amount;
    }

    System.out.printf("Total number of notes:\n");
    System.out.printf("500 : %d\n", notes500);
    System.out.printf("100 : %d\n", notes100);
    System.out.printf("50 : %d\n", notes50);
    System.out.printf("20 : %d\n", notes20);
    System.out.printf("10 : %d\n", notes10);
    System.out.printf("5 : %d\n", notes5);
    System.out.printf("2 : %d\n", notes2);
    System.out.printf("1 : %d\n", notes1);

    }
}
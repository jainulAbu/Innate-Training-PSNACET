import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int[]a1=new int[n1];
        int[]a2=new int[n2];
        int[]a3=new int[n3];
        for(int i=0;i<n1;i++){
            a1[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
        }
        for(int i=0;i<n3;i++){
            a3[i]=sc.nextInt();
        }
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2 && k < n3) {
            if (a1[i]==a2[j]&&a2[j]==a3[k]) {
                System.out.print(a1[i] + " ");
                i++; j++; k++;
            }
            else if (a1[i] < a2[j]) i++;
            else if (a2[j] < a3[k]) j++;
            else k++;
    }
}
}
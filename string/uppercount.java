import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named 
        Solution. */
        Scanner sc = new Scanner(System.in);
        String str=" ";
        str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            
            if(Character.isUpperCase(c)){
                count++;
            }
        }
        System.out.println(count);
    }
}
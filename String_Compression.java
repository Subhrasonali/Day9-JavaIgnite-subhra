/*
String Compression (Very Tricky)

Create a program that:

Compresses repeating characters
Example:
Input: aaabbcc
Output: a3b2c2
  */
import java.util.Scanner;

public class String_Compression { 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        int count = 1;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result = result + str.charAt(i) + count;
                count = 1;
            }
        } 
        result = result + str.charAt(str.length() - 1) + count;

        System.out.println("Compressed String: " + result);

        sc.close();
    }
}
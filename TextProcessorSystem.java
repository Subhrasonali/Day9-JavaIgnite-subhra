/*
Create a program that:

Takes a string input using StringBuilder

Perform the following operations:

Tasks:
Append a word at the end
Insert a word in the middle
Replace part of the string
Reverse the final string
Example Flow:
Input: Java
Append: Programming
Insert: "Easy" in middle
Replace: "Easy" → "Powerful"
Reverse final string
Rules:
Must use StringBuilder only
Do not convert back to String for operations
*/
import java.util.Scanner;

public class TextProcessorSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        // Append
        sb.append(" Programming");
        System.out.println("After Append: " + sb);

        // Insert 
        sb.insert(5, " Easy");
        System.out.println("After Insert: " + sb);

        // Replace
        int start = sb.indexOf("Easy");
        sb.replace(start, start + 4, "Powerful");
        System.out.println("After Replace: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After Reverse: " + sb);

        sc.close();
    }
}
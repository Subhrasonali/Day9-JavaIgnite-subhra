/*
Word Reversal in Sentence

Create a program that:

Takes a full sentence as input
Reverses each word, but keeps word order same
Example:
Input: Java is fun
Output: avaJ si nuf
  */
import java.util.Scanner;

public class Word_Reversal_Sentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            System.out.print(sb.reverse() + " ");
        }

        sc.close();
    }
}
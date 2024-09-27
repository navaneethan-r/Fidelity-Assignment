package com.example.reverseSentence;
import java.util.*;
public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String sentence = sc.nextLine();

        ProcessSentence ps = new ProcessSentence(sentence);
        ps.reverseSentence();
    }
}

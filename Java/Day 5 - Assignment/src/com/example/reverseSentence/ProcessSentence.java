package com.example.reverseSentence;

public class ProcessSentence {
    private final String reverseSentence;

    public ProcessSentence(String reverseSentence) {
        this.reverseSentence = reverseSentence;
    }

    public void reverseSentence(){
        StringBuilder str = new StringBuilder(reverseSentence);
        String[] arr = str.toString().split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            if(i==0)
            {
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i] + " ");
            }
        }
    }

}

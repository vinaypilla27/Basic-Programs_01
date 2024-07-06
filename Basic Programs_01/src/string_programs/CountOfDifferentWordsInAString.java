package string_programs;

import java.util.HashMap;
import java.util.Map;

public class CountOfDifferentWordsInAString {
    public static void main(String[] args) {

    String input ="Vinay Pilla is a Good Vinay Pilla and is married to thriveni Muppina";

    String[] words = input.split(" ");
    Map<String,Integer>  countOfWords = new HashMap<String,Integer>();
    String temp;
    for(String s : words) {
        temp=s.toLowerCase();
        if(countOfWords.get(temp)!=null){
            countOfWords.put(temp,countOfWords.get(temp)+1);
        }else
        countOfWords.put(temp,1);
        }
    System.out.println(countOfWords);
    }

}

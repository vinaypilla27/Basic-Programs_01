package string_programs;

import java.util.HashSet;
import java.util.Set;

public class CountOfDistinctWords {
    public static void main(String[] args) {
        String input = "W3Schools is optimized for learning and training." +
                " Examples might be simplified to improve reading and learning." +
                " Tutorials, references, and examples are constantly reviewed to avoid errors," +
                " but we cannot warrant full correctness of all content. While using W3Schools," +
                " you agree to have read and accepted our";
        String[] words = input.split(" ");
        Set<String> unique = new HashSet<>();
        for (String s : words) {
            unique.add(s);
        }
        System.out.println("Total Strings = "+words.length);
        System.out.println("Total Unique Strings = "+unique.size());

    }

}



package string_programs;

import java.util.HashMap;
import java.util.Map;

public class CountingVowels {
    public static void main(String[] args) {
        String s="Vinay Pilla uuuu oooooo";
        Map<Character,Integer> vowels = new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){
            char ca=s.charAt(i);
            if(ca=='a' || ca=='e' || ca=='i' || ca=='o'|| ca=='u'){
                //System.out.println(vowels.get());
                if(vowels.get(ca)!=null)
                vowels.put(ca,vowels.get(ca)+1);
                else
                    vowels.put(ca,1);
            }

        }
        System.out.println(vowels);
    }
}

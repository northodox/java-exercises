package org.launchcode.java.studios;
import java.util.HashMap;

public class CountingCharacters {
    public static void main(String[] args) {
        String characterString = "Aaa Bbbb CCCc";
        char[] charactersInString = characterString.toCharArray();
        HashMap<Character, Integer> characters = new HashMap<>();

        for(char i : charactersInString) {
            Integer total = charactersInString.length;
            Integer charCount = 0;
            char c = i;
            for (int z = 0; z < total; z++){
                if(c == charactersInString[z]) {
                    charCount ++;
                }
            characters.put(c, charCount);
            }
        }
        System.out.println(characters);
    }
}

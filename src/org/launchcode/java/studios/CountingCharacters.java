package org.launchcode.java.studios;
import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {

        //Get string from the user
        java.util.Scanner in;
        System.out.println("Enter the string you would like to count: ");
        in = new Scanner(System.in);
        String characterString = in.nextLine();
        char[] charactersInString = characterString.toCharArray();
        HashMap<Character, Integer> characters = new HashMap<>();

        //get each character while looping through string
        for(char i : charactersInString) {
            Integer total = charactersInString.length;
            Integer charCount = 0;
            char c = java.lang.Character.toLowerCase(i);

            //count each character while looping through string
            for (int z = 0; z < total; z++){
                if(c == java.lang.Character.toLowerCase(charactersInString[z])) {
                    charCount ++;
                }
            characters.put(c, charCount);
            }
        }
        System.out.println(characters);
    }
}

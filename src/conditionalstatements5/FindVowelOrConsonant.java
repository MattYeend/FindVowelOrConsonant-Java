/*
Conditional Statements exercise 5
 */
package conditionalstatements5;

import java.util.Scanner;

public class FindVowelOrConsonant {

    public static void main(String[] args) {
        //Find vowel or consonant
        System.out.println("Find Vower or Consonant");
        Scanner in = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String input = in.next().toLowerCase();
        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("u") || 
                input.equals("e") || input.equals("i") || input.equals("o");
        if(input.length() > 1){
            System.out.println("Error. Not a single character found. \n");
        }else if(!(uppercase || lowercase)){
            System.out.println("Error. Not a letter. Enter either an uppercase letter or lowercase letter. \n");
        }else if(vowels){
            System.out.println("Input letter is a Vowel. \n");
        }else{
            System.out.println("Input letter is a Consonant. \n");
        }
    }
}
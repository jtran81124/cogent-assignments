package assignment1;

import java.util.HashSet;
import java.util.Set;

public class StringHandler {


    public String removeChar(String s, String badChar){
        String out = "";

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) != badChar.charAt(0)){
                out += s.charAt(i);
            }
        }
        System.out.print("Removing '" + badChar + "' from '"+ s + "': ");
        System.out.println(out);
        return out;
    }

    public int countChar(String s, String findMe){
        int out = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == findMe.charAt(0)){
                out++;
            }
        }
        System.out.println("There are "+ out + " " + findMe+ " in " + s);
        return out;
    }

    public boolean isAnagram(String s, String s2){
        //Can use array of charactrs and get their unicode.
        //can use hashtable

        int[] alphaArr = new int[26];


        for(int i = 0; i < s.length(); i++){
            alphaArr[s.charAt(i) - 'a'] += 1;
        }

        for(int i = 0; i < s2.length(); i++){
            alphaArr[s2.charAt(i) - 'a'] -= 1;
        }

        for(int i = 0; i < alphaArr.length; i++){
            if(alphaArr[i] != 0){
                return false;
            }
        }

        //System.out.println(Arrays.toString(alphaArr));
        return true;
    }

    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while (left < right) {

            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isVowel(char ch){

        Set<Character> h = new HashSet<Character>();

        h.add('a');
        h.add('e');
        h.add('i');
        h.add('o');
        h.add('u');

        ch = Character.toLowerCase(ch);
        if(h.contains(ch)){
            System.out.println(ch + " is a vowel");
            return true;
        }
        else{
            System.out.println(ch + " is a consonant");
            return false;
        }
    }

    public boolean isCharDigit(char ch){
        if('a' - ch > 26){
            System.out.println(ch + " is a digit");
            return true;
        }
        System.out.println(ch + " is not a digit");
        return false;
    }

    public String deleteVowels(String s){

        String out = "";
        Set<Character> h = new HashSet<Character>();
        h.add('a');
        h.add('e');
        h.add('i');
        h.add('o');
        h.add('u');

        for(int i = 0; i < s.length(); i++){

            if(!h.contains(Character.toLowerCase(s.charAt(i)))){
                out += s.charAt(i);
            }
        }

        System.out.println(out);
        return out;
    }

    public int[] countVowelsAndConsonates(String s){

        int[] out = {0, 0};
        Set<Character> h = new HashSet<Character>();
        h.add('a');
        h.add('e');
        h.add('i');
        h.add('o');
        h.add('u');

        int vowels = 0;
        int consonates = 0;

        for(int i = 0; i < s.length(); i++){


            if(h.contains(Character.toLowerCase(s.charAt(i)))){
                vowels++;
            }
        }
        consonates = s.length() - vowels;

        System.out.println("Consonates: " + consonates + " Vowels: " + vowels);
        return out;

    }

    public char mostFreqChar(String s){
        s.toLowerCase();
        char out = ' ';
        int max = 0;

        for(int i = 0; i < s.length(); i++){


        }



        return out;
    }




    public static void main(String[] args) {
        StringHandler sh = new StringHandler();


        sh.removeChar("Hello", "l");

        sh.countChar("Hello", "l");

        System.out.println(sh.isAnagram("abc", "cab"));
        System.out.println(sh.isAnagram("abc", "aba"));

        System.out.println(sh.isPalindrome("racecar"));
        System.out.println(sh.isPalindrome("apple"));

        //Is it a consonate or vowel?
        sh.isVowel('a');
        sh.isVowel('b');

        sh.isCharDigit('a');
        sh.isCharDigit('4');

        sh.deleteVowels("Moon");

        sh.countVowelsAndConsonates("hello");

    }
}

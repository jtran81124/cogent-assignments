package assignment1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringHandler {

    /*
    HOW DO GRADE? Some methods are out of order.
    The main below is ordered correctly.
     */


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

        int[] alphaArr = new int[26];
        s.toLowerCase();
        int max_index = 0;
        int max = 0;

        //count all the characters
        for(int i = 0; i < s.length(); i++){
            alphaArr[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < alphaArr.length; i++) {
            //new max
            if(alphaArr[i] > max){
                max_index = i;
                max = alphaArr[i];
            }
        }


        char out_char = (char) (max_index + 'a');
        System.out.println("Most freq char: " + out_char);
        return out_char;
    }

    public void countCharTypes(String s){
        int alph = 0, digi = 0, spl = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
                alph++;
            }
            else if(ch >= '0' && ch <= '9') {
                digi++;
            }
            else {
                spl++;
            }
        }

        System.out.println("Alpha: " + alph + " Digits: " + digi + " Special: " + spl);
    }

    public String replaceFirstVowel(String s){
        String out = "";
        for(int i = 0; i < s.length(); i++){
            if(isVowel(s.charAt(i))){
                out += "-" + s.substring(i+1, s.length());
                System.out.println(out);
                return out;
            }
            else{
                out += s.charAt(i);
            }
        }

        return out;
    }

    public String replaceSpaces(String s){
        s = s.replaceAll("\\s", "");
        System.out.println(s);
        return s;
    }

    //TODO: not done
    public String removeRepeats(String s){

        char last = ' ';
        String out = "";
        for(int i = 0; i < s.length(); i++){
            char curr_char = s.charAt(i);
            if(curr_char != last){
                out += curr_char;
                last = curr_char;
            }
        }
        System.out.println(out);
        return out;
    }

    public int calculateSumOfIntegers(String s) {

        int sum = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9'){
                sum += ch - '0';
            }



        }
        System.out.println(sum);

        return sum;
    }

    public String getNonRepeats(String s){

        //Annoying edge cases

        if(s.length() <= 1){
            return s;
        } else if (s.length() == 2) {

            if(s.charAt(0) == s.charAt(1)){
                return "";
            }
            return s;
        }


        //abc
        int curr = 1;
        String out = "" + s.charAt(0);
        char last = ' ';
        while(curr+1 < s.length()-1){

            //repeat found, add nothing
            if(s.charAt(curr-1) == s.charAt(curr)){
                last = ' ';


            }
            else{
                last = s.charAt(curr-1);
                out += s.charAt(curr);
            }
            curr++;

        }

        System.out.println(out);
        return out;
    }

    public String sortedAscendingString(String s){
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        String out = new String(arr);
        System.out.println(out);
        return out;

    }
    public String sortedDecendingString(String s){

        s = sortedAscendingString(s);

        String out = "";

        for(int i =  s.length()-1; i >= 0; i--) {
            out += s.charAt(i);
        }
        System.out.println(out);
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

        sh.mostFreqChar("abdddc");

        sh.replaceFirstVowel("race");

        sh.countCharTypes("__DragonSlayer101__");

        sh.replaceSpaces("The Big brown fox jumped over the    lazy dog");

        sh.removeRepeats("bananna");

        sh.calculateSumOfIntegers("the55");
        //TODO: not done
        sh.getNonRepeats("aab");

        //also shows ascending and descending order
        sh.sortedDecendingString("cabb");
    }
}

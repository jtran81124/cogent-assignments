package assignment1;

import java.util.ArrayList;

public class Numbers {


    //itertate from 1 -> sqrt(n)
    public boolean isPrime(int n){

        if (n == 1 || n == 0){
            return false;
        }

        for(int i = 2; i < Math.sqrt(n);i++){
            if(n%i == 0){
                return true;
            }
        }
        return false;
    }

    public boolean isPallindrome(int num){

        int divisor = 1;
        //divisor gives the length and index of the left side.
        while(num / divisor > 10){
            divisor *= 10;
        }
        //System.out.println(divisor);

        //check left side and right side
        //remove the left side and right side.
        while(num >= 10){
            int left = num / divisor;
            int right = num % 10;

            if(left != right){
                return false;
            }

            //remove left and right side
            num = num % divisor / 10;
        }
        return true;
    }

    public int[] swap(int arr[]){
        if(arr.length == 2){
            System.out.println(arr[0] + " " + arr[1]);
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
            System.out.println(arr[0] + " " + arr[1]);
        }

        return arr;

    }

    public ArrayList<Integer> getPrimeFactors(int n){
        ArrayList<Integer> out = new ArrayList<Integer>();

        int original_num = n;
        for(int i = 1; i < original_num; i++){

            if(n%i == 0){
                out.add(i);
                n /= i;
            }
        }

        System.out.println(out);
        return out;

    }

    public int reverseNumber(int n){

        int out = 0;

        while(n>0){
            out = (out*10) + n%10;
            n /= 10;
        }
        System.out.println("reversed num: " + out);
        return out;
    }


    public static void main(String[] args) {

        Numbers n = new Numbers();

        //isPrime()
        int num = 4;
        System.out.println("Is "+ num + " prime: " + n.isPrime(num));
        //isPalindrome()
        num = 1221;
        System.out.println("Is "+ num + " palindrome: " + n.isPallindrome(num));
        //swapping ints
        int[] arr = {1,2};
        System.out.print("Swapping integers: ");
        n.swap(arr);

        num = 42;
        n.getPrimeFactors(num);

        num = 123;
        n.reverseNumber(num);
    }


}

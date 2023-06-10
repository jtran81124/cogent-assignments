package assignment2;

import java.util.Arrays;

public class Main {



    public String[] sortStringArray(String[] s){
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        return s;
    }

    public int sequentialSearch(int[] nums, int n){

        for(int num: nums){
            if(num == n){
                System.out.println(num);
                return num;
            }
        }
        System.out.println("Doesn't exist");
        return -1;
    }

    public static void main(String[] args) {

        Main m = new Main();

        //exercise 1
        String[] randomNames = {"Jacob","Steve","Aisha","Holly","Cynthia"};
        m.sortStringArray(randomNames);


        //exercise 2
        int[] nums = {1,5,2,4,4};
        m.sequentialSearch(nums,2);
        m.sequentialSearch(nums,3);

        //exercise 3

        //exercise 4
//        Employee emp1 = new Employee();
//        Employee emp2 = new Employee();
    }
}

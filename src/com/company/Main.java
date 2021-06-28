package com.company;

public class Main {

    public static void main(String[] args) {
        // An array is a data structure that allows you to save
        // multiple values of the same data-type in a particular memory location.

        // Two ways to create an array variable in java.
        //0,  1,  2,  3; length: how many elements are in the array.
        // NOTE: the last item of any array in java is always length of the array - 1
        int[] ages = {12, 15, 18, 19};  // 1. manually enter the values yourself
        //       System.out.println(ages.length);
        //       System.out.println(ages[3]);
        double average = 0;
        double sum = 0;

        for (int i = 0; i < ages.length; i++) {
            sum = sum + ages[i];
            //     System.out.println(sum);
        }
        average = sum / ages.length;
 //       System.out.println(average);

        String[] names = new String[4]; // 2. Create a new instance and give it a size.
        names[0] = "Anne";
        names[1] = "Lana";
        names[2] = "Paris";
        names[3] = "Jane"; // {null, null, null, "Jane")
        //       System.out.println(names[0]);


        String bunchOfNames = "";
        for (int i = 0; i < names.length; i++); {
            bunchOfNames += names[i] + "";

        }
//        System.out.println(bunchOfNames);

        // Loop through and print out only the even numbers
        // e.g.
        // Even Number: 96
        // [13, 45, 26, 22, 19, 24, 20, 30, 90, 12]




    }
}

package homework2;

import java.util.Arrays;

public class Programme17 {

    public static void main(String[] args) {
        int[] numericArray = {6, 8, 3, 1, 4};

        System.out.println("Original numeric array: " + Arrays.toString(numericArray));

        Arrays.sort(numericArray);

        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

        //sorting String Arrays
        String[] stringArray = {"Vishal", "Kartik", "Rupal", "Mukul", "Jagruti", "Beena"};

        System.out.println("Original string array: " + Arrays.toString(stringArray));

        Arrays.sort(stringArray);

        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
    }
}


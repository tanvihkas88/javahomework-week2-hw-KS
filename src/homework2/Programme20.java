package homework2;

public class Programme20 {

    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        int valueToCheck = 6;

        if (containsValue(array, valueToCheck)) {
            System.out.println("The array contains the value " + valueToCheck + ".");
        } else {
            System.out.println("The array does not contain the value " + valueToCheck + ".");
        }
    }

    public static boolean containsValue(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}



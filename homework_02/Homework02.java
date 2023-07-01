public class Homework02 {
    /*
     * 1. Написать метод, возвращающий количество чётных элементов массива
    */
    public static int countEvens(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /*
     * 2. Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
     */
    public static int minMaxDifference(int[] arr) {
        int minValue = arr[0];
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return maxValue - minValue;
    }

    /*
     * 3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
     */
    public static boolean isAdjacentZerosPresent(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == 0 && arr[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {2, 3, 0, 0, 4, 5};

        System.out.println("Number of even elements: " + countEvens(arr1));
        System.out.println("Difference between max and min elements:" + minMaxDifference(arr1));
        System.out.println("Adjacent zeros present for arr1: " + isAdjacentZerosPresent(arr1));
        System.out.println("Adjacent zeros present for arr2: " + isAdjacentZerosPresent(arr2));
    }
}

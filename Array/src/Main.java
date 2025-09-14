import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        java.util.Scanner scanner = new Scanner(System.in);
        printArray(new int[]{1, 2, 3});
        createArray(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(createArray(10));
        }

    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[] createArray(int index) {
        int[] array = new int[index];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 100;
        }
        return array;
    }



}
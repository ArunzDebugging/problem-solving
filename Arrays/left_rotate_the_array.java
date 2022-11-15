package Arrays;

import java.util.Scanner;

public class left_rotate_the_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] = new int[size];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for (i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;


        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}

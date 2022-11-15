package Arrays;

import java.util.Scanner;

public class move_zeros_to_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp[]=new int[size];
        int k=0;
        for(i=0;i<size;i++)
        {
            if(arr[i]>0)
            {
                temp[k]=arr[i];
                k++;
            }
        }
        for(i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }


    }
}

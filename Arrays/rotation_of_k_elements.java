package Arrays;
//using temp array
import java.util.*;
public class rotation_of_k_elements {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("size");
        int size=sc.nextInt();
        int i;
        int arr[]=new int[size];
        System.out.println("array elements");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int newarr[]=new int[size];
        System.out.println("position");
        int k=sc.nextInt();
        System.out.println("output");
        int ind=0;
        for(i=k;i<size;i++)
        {
          newarr[ind]=arr[i];
          ind++;
        }

        for(i=0;i<k;i++)
        {
            newarr[ind]=arr[i];
            ind++;
        }
        for(i=0;i<size;i++)
        {
            System.out.println(newarr[i]);
        }
    }
}

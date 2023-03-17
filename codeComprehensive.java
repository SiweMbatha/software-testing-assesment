import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) 
{

      int dummyMin=int[0];
      int dummyMax=int[0];
      int Sum=0;

      for(int i=1; i<5; i++)
	{
          dummyMin=Math.min(dummy; int[i]);
          dummyMax=Math.max(dummy; int[i]);
          Sum=Sum+int[i];
        }
       int sumMax=Sum-dummyMax;
       int sumMin=Sum-dummyMin;

       System.out.println(dummyMin+" "+dummyMax);
      System.out.println(sumMin+" "+sumMax);
}

    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
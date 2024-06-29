import java.io.*;
class GFG {
    static int findMinX(int num[], int rem[], int k)
    {
        int x = 1; 
        while (true)
        {
            int j;
            for (j=0; j<k; j++ )
                if (x%num[j] != rem[j])
                   break;
            if (j == k)
                return x;
            x++;
        }
    }
    public static void main(String args[])
    {
        int num[] = {3,5};
        int rem[] = {1,3};
        int k = num.length;
        System.out.println("x is " + findMinX(num, rem, k));
    }
}



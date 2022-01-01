import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s[] = new int[n+1];
            s[0] = a + b;
            for(int j=1;j<n+1;j++){
                    System.out.print(s[j-1]+" ");
                    s[j] = s[j-1]+(int)Math.pow(2, j)*b;
                    
                }
                System.out.println();
        }
        in.close();
    }
}

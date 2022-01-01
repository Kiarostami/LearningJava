import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                s1 = String.format("%-15s", s1);
                String s = String.valueOf(x);
                if (1<s.length() && s.length()<3){
                        s = "0"+s;
                    }
                else if (s.length()<2){
                        s = "00"+s;
                    }  
                s1 = s1.concat(s);
                System.out.println(s1);
            }
            System.out.println("================================");

    }
}




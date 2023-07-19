import java.util.Arrays;
import java.util.Scanner;

public class Elementremoval {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
      for(int i=0;i<n;i++){
          a[i]=sc.nextInt();
      }
        Arrays.sort(a);

        int cost=0;
        for (int i=0;i<n;i++){
            cost=a[i]*(i+1);
        }
        System.out.println(cost);
    }
}
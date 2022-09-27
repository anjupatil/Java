import java.util.*;
public class MaxProd3{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       Arrays.sort(a);
       long a1=a[n-1]*a[n-2]*a[n-3];
       long b=a[0]*a[1]*a[n-1];
       if(a1>b)
       {
        System.out.println(a1);
       }
       else
       System.out.println(b);
            
        
        
    }
}
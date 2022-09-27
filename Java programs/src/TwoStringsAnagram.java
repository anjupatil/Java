import java.util.*;
//import java.io.*;
public class TwoStringsAnagram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(isAnagram(s1,s2));
        sc.close();
    }
    public static boolean isAnagram(String s1,String s2)
    {
        int[] alphabet=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            alphabet[s1.charAt(i)-'a']++;
           
        }
        for(int i=0;i<s2.length();i++)
        {
            alphabet[s2.charAt(i)-'a']--;
        }
        for(int i:alphabet)
        {
            if(i!=0)
            {
                return false;
            }
        }
        return true;
    }
}

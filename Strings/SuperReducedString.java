import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        return reduce_string(s,s.length());
    }

    static String reduce_string(String s,int l)
    {
        // If length is zero initially or after recursion, then it returns empty string cause its suppose to.
        if(l==0)
            return "Empty String";
        
        // characters a and b will contain the two consecutive characters we are trying to compare.
        char a=s.charAt(0);
        char b;
        // The for loop is also required as 
        for(int i=1;i<l;i++){
            b=s.charAt(i);
            if(b==a){
                // This step remove the consecutive same characters from the string.
                s=s.substring(0,i-1)+s.substring(i+1,l);
                // Here we reduce the length of the string by 2 chars. I first thought as to why do we modify the length around everywhere and why not just use s.length everywhere, but doing this saves us computation time.
                l-=2;
                // Here we call the reduce_string function recursively. The reason we do that is to find any new set of same characters ahead of this position, so that any far off repeated character can come closer as well.
                return reduce_string(s,l);
            }
            a=b;
        }
        return s;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}

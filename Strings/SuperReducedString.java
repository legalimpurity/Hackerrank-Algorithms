import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        return reduced_string(s,0);
    }

    static String reduced_string(String s, int pos) {
        System.out.println("pos "+pos+" and length "+s.length());
        if(s.length() == 0)
            return "Empty String";
        if(pos + 1 >= s.length())
            return s;
        char str1 = s.charAt(pos);
        char str2 = s.charAt(1+pos);
        System.out.println("comparing "+str1+" and "+str2);
        if(str1 == str2)
        {
            s = s.substring(0,pos) + s.substring(pos+2,s.length());
        }
        else
        {
            pos++;
        }
        System.out.println("after "+pos+" iteration"+s);
        s = reduced_string(s,pos);
        return s;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}

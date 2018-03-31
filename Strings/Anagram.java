import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int numberNeeded(String first, String second) {
      
        int[] firstMap= getCharactersHistorgam(first);
        int[] secondMap= getCharactersHistorgam(second);
        int charactersToBeDeleted = 0;
        for(int i =0; i < 26; i++)
            charactersToBeDeleted += Math.abs(firstMap[i]-secondMap[i]);
        return charactersToBeDeleted; 
    }
    
    public static int[] getCharactersHistorgam(String stringToLook)
    {
        int counter[] = new int[26];
        for(int i=0; i < stringToLook.length(); i++)
        {
            counter[stringToLook.charAt(i) - 'a']++;
        }
        return counter;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

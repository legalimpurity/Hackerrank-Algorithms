import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }

        ArrayList<String> sortedarray = new ArrayList<String>();

        for(int unsorted_i=0; unsorted_i < unsorted.length; unsorted_i++) {
                       
            boolean needToBeinserted = true;

            String toBeSorted = unsorted[unsorted_i];
            int unsortedlength = toBeSorted.length();
            System.out.println("unsorted_i " + unsorted_i);
            System.out.println("unsorted[unsorted_i]" + unsorted[unsorted_i]);

            for(int sorted_j = 0; sorted_j+1 < sortedarray.size(); sorted_j++) {
                System.out.println("sorted_j "+ sorted_j);
                System.out.println("sortedarray.get(sorted_j) "+ sortedarray.get(sorted_j));
                System.out.println("sortedarray.get(sorted_j).length() "+ sortedarray.get(sorted_j).length());
                System.out.println("unsortedlength "+ unsortedlength);
                if(unsortedlength < sortedarray.get(sorted_j).length()) {
                    sortedarray.add(sorted_j,toBeSorted);
                    needToBeinserted = false;
                }
            }

            if(needToBeinserted)
                sortedarray.add(toBeSorted);
        }

        for (int sorted_j = 0; sorted_j < sortedarray.size(); sorted_j++)
            System.out.println(sortedarray.get(sorted_j));
        }
}

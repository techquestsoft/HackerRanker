import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result1 {

    /*
     * Complete the 'palindromeChecker' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER_ARRAY startIndex
     *  3. INTEGER_ARRAY endIndex
     *  4. INTEGER_ARRAY subs
     */

    public static String palindromeChecker(String s, java.util.List<Integer> startIndex, java.util.List<Integer> endIndex, java.util.List<Integer> subs) {
        // Write your code here
        return null;
    }

}

public class PalindromeChecker {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int startIndexCount = Integer.parseInt(bufferedReader.readLine().trim());

        java.util.List<Integer> startIndex = new java.util.ArrayList<>();

        for (int i = 0; i < startIndexCount; i++) {
            int startIndexItem = Integer.parseInt(bufferedReader.readLine().trim());
            startIndex.add(startIndexItem);
        }

        int endIndexCount = Integer.parseInt(bufferedReader.readLine().trim());

        java.util.List<Integer> endIndex = new java.util.ArrayList<>();

        for (int i = 0; i < endIndexCount; i++) {
            int endIndexItem = Integer.parseInt(bufferedReader.readLine().trim());
            endIndex.add(endIndexItem);
        }

        int subsCount = Integer.parseInt(bufferedReader.readLine().trim());

        java.util.List<Integer> subs = new java.util.ArrayList<>();

        for (int i = 0; i < subsCount; i++) {
            int subsItem = Integer.parseInt(bufferedReader.readLine().trim());
            subs.add(subsItem);
        }

        String result = Result1.palindromeChecker(s, startIndex, endIndex,
                subs);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

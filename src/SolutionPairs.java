import java.util.*;
import java.io.*;
import  java.util.stream.Collectors;
 class Result {

    /*
     * Complete the 'countPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY numbers
     *  2. INTEGER k
     */

    public static int countPairs(List<Integer> numbers, int k) {
        // Write your code here
       List<Integer> listDistinct =
                numbers.stream().distinct().collect(Collectors.toList());
        int[] distinctValues = listDistinct.stream()
                .mapToInt(Integer::intValue)
                .toArray();


       List<Map> pairs1 = new java.util.ArrayList();
        for (int i=0; i< distinctValues.length; i++) {
            Map pairs = new HashMap<>();
            pairs.put(Integer.valueOf(distinctValues[i]),
                    Integer.valueOf(distinctValues[i]));
            pairs1.add(pairs);
            pairs = new HashMap<>();
            if(i+1 < distinctValues.length ) {
                pairs.put(Integer.valueOf(distinctValues[i]),
                        Integer.valueOf(distinctValues[i + 1]));
            }
            pairs1.add(pairs);
        }
        int parisCount = 0;
        for (Map pari:pairs1
             ) {
            Set keys = pari.keySet();
            System.out.println("All keys are: " + keys);
// To get all key: value
            for(Object key: keys){
                System.out.println(key + ": " + (Integer)key);
                if(((Integer)key+k) == (Integer)pari.get(key)){
                    parisCount++;
                }
            }
        }

        return parisCount;

    }

}

public class SolutionPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter =
              //  new BufferedWriter(new FileWriter(System.getenv
        //  ("OUTPUT_PATH")));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < numbersCount; i++) {
            int numbersItem = Integer.parseInt(bufferedReader.readLine().trim());
            numbers.add(numbersItem);
        }

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.countPairs(numbers, k);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }
}


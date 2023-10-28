import java.io.*;

public class FizzBuzz {
    public static void main(String args[] ) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        String line = br.readLine();

        int N = Integer.parseInt(line);

        for (int i = 1; i <= N; i++) {

            if (i%3 ==0 && i%5 ==0){
                System.out.println("FizzBuzz");
            }else  if (i%3 ==0 && i%5 !=0){
                System.out.println("Fizz");
            }else  if (i%3 !=0 && i%5 ==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }



        }
    }
}

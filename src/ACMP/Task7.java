package ACMP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Task7 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] numbers = line.split(" ");
        if(numbers.length!=3) System.out.println("Error!");
        BigInteger one = new BigInteger(numbers[0]);
        BigInteger two = new BigInteger(numbers[1]);
        BigInteger three = new BigInteger(numbers[2]);

       if(one.compareTo(two)==1 && one.compareTo(three)==1){
           System.out.println(one);
           System.exit(0);
       }
       if(two.compareTo(one)==1 && two.compareTo(three)==1){
           System.out.println(two);
           System.exit(0);
       }

       else System.out.println(three);

    }
}

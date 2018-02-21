package ACMP;
import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.valueOf(reader.readLine());
        long sum = n * (n + 1) / 2;
        System.out.println(sum);

    }

}

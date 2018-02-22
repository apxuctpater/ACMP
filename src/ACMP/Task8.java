package ACMP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] numbers = line.split(" ");
        int n1 = Integer.valueOf(numbers[0]);
        int n2 = Integer.valueOf(numbers[1]);
        int n3 = Integer.valueOf(numbers[2]);
        if(n3==n1*n2) System.out.println("YES");
        else System.out.println("NO");

    }
}

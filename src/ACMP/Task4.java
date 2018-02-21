package ACMP;

import java.io.*;


public class Task4 {
    public static void main(String[] args) throws FileNotFoundException, IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.valueOf(reader.readLine());
        long n1=n;
        long n2=9;
        long n3=9-n;
        System.out.println((n1 * 100 + n2 * 10 + n3));


    }
}

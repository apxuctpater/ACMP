package ACMP;


import java.io.*;


public class Task3 {
    public static void main(String[] args) throws FileNotFoundException, IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.valueOf(reader.readLine());
        if( n % 10 != 5) System.out.println("Error");
        else System.out.println(n * n);
    }
}


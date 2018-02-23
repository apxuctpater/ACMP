package ACMP;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task14 {
    public static void solve(Scanner in, PrintWriter out) {
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        System.out.println(lcm(n1, n2));


    }
    static long gcd(long a,long b){
        return b == 0 ? a : gcd(b,a % b);
    }

    static long lcm(long a,long b){
        return a / gcd(a,b) * b;
    }

    public static void run(){

        try (
                Scanner in  = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out);
        )
        {
            solve(in,out);
        }


    }



    public static void main(String[] args) throws IOException {


        run();


    }
}


package ACMP;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task13 {
    public static void solve(Scanner in, PrintWriter out) {
        String[] n1 = in.next().split("");
        String[] n2 = in.next().split("");
        int bulls = 0;
        int cows = 0;
        for(int i = 0; i < 4; i++){
            if(n1[i].equals(n2[i])){
                bulls++;
                n1[i]="a";
            }
            for(int j = 0; j < 4; j++){
                if(n1[i].equals(n2[j])){
                    cows++;
                    n1[i]="c";
                }
            }
        }
        System.out.println(bulls+" "+cows);



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


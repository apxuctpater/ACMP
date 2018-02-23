package ACMP;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Task12 {




    public static void solve(Scanner in, PrintWriter out){

        int n = in.nextInt();
        long x = 0;
        long y = 0;
        int x1 = 0;
        int y1 = 0;
        int x3 = 0;
        int y3 = 0;
        ArrayList<String> coords = new ArrayList<>(n);
            for(int i = 0; i <= n; i++){
                        coords.add(in.nextLine());
                }

        for(int i = 1; i < coords.size(); i++){
                x = Character.getNumericValue(coords.get(i).charAt(0));
                y = Character.getNumericValue(coords.get(i).charAt(2));
                x1 = Character.getNumericValue(coords.get(i).charAt(4));
                y1 = Character.getNumericValue(coords.get(i).charAt(6));
                x3 = Character.getNumericValue(coords.get(i).charAt(12));
                y3 = Character.getNumericValue(coords.get(i).charAt(14));
            System.out.println(isTarget(x, y, x1, y1, 1, 1, x3, y3, 1, 1));

        }


    }


    public static boolean isTarget(long x, long y, long x1, long y1, long x2, long y2, long x3, long y3, long x4, long y4){
            if(x1 < x && x < x3 && y1 < y && y < y3 ) return true;
        else return false;
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

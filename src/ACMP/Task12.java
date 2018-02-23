package ACMP;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Task12 {




    public static void solve(Scanner in, PrintWriter out){

        int n = in.nextInt();
        int x = 0;
        int y = 0;
        int x1 = 0;
        int y1 = 0;
        int x3 = 0;
        int y3 = 0;
        int count = 0;
        ArrayList<String> coords = new ArrayList<>();
        ArrayList<Integer> curCoords = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            coords.add(in.nextLine());
        }
        coords.remove(coords.get(0));

        for(int i = 0; i < n; i++){
            for(int j = 0; j < coords.get(i).length()/2-1; j++) {
                curCoords.add(Integer.valueOf(coords.get(i).split(" ")[j]));

            }

            if(isTarget(curCoords.get(0), curCoords.get(1), curCoords.get(2), curCoords.get(3), 1, 1, curCoords.get(6), curCoords.get(7), 1, 1)){
                count = count + 1;
            }
            curCoords = new ArrayList<>();
        }
        System.out.println(count);

    }




    public static boolean isTarget(int x, int y, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
            if(x1 < x && x < x3 && y1 < y && y < y3 ) return false;
        else return true;
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

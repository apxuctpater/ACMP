package ACMP;

import java.io.*;
import java.util.ArrayList;


public class Task5 {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.valueOf(reader.readLine());
        // if (n < 1 || n > 100) System.out.println("Error!");
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(Integer.valueOf(reader.readLine()));

        }

        int even = 0;
        int odd = 0;

        for (int j = 0; j < n; j++) {
            if (arrayList.get(j) % 2 == 0) {
                evenList.add(arrayList.get(j));
                even++;

            } else {
                oddList.add(arrayList.get(j));
                odd++;
            }
        }


        for (int k = 0; k < oddList.size(); k++) {
            System.out.print(oddList.get(k)+" ");
        }
        System.out.println();
        for (int k = 0; k < evenList.size(); k++) {
            System.out.print(evenList.get(k)+" ");
        }

        System.out.println();
        if (even > odd) System.out.println("YES");
        else System.out.println("NO");

    }







}

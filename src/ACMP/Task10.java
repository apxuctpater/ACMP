package ACMP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Task10 {
    public static void main(String[] args) throws IOException{


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] numbers = line.split(" ");
        int a=Integer.parseInt(numbers[0]);
        int b=Integer.parseInt(numbers[1]);
        int c=Integer.parseInt(numbers[2]);
        int d=Integer.parseInt(numbers[3]);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=-100; i<=100; i++){
            if(a*i*i*i+b*i*i+c*i+d==0){

                if(!ans.contains(i)){
                    ans.add(i);

                }
            }

        }
        Collections.sort(ans);
        for(int tmp:ans){
            System.out.print(tmp+" ");
        }


    }
}

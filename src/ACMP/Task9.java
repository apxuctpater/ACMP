package ACMP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int n = Integer.valueOf(line);
        String numbers = reader.readLine();
        String[] strings = numbers.split(" ");
        int[] array = Arrays.asList(strings).stream().mapToInt(Integer::parseInt).toArray();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int max_index = 0;
        int min_index = 0;
        int plus_sum = 0;
        int proizv = 1;

        for(int i=0; i<n; i++){
            if(array[i] > 0) plus_sum = plus_sum+array[i];

            if(array[i]>max){
                max = array[i];
                max_index = i;
            }
            if(array[i]<min){
                min = array[i];
                min_index = i;
            }

        }
        System.out.println(min_index);
        System.out.println(max_index);
        for(int j=min_index+1; j<max_index; j++){
            proizv = proizv*array[j];

        }
        System.out.println(plus_sum+" "+proizv);


    }
}

package ACMP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String turn = reader.readLine();
        if(turn.length()!=5){
            System.out.println("ERROR");
            System.exit(0);
        }
        if(turn.charAt(2)!='-'){
            System.out.println("ERROR");
            System.exit(0);
        }
        String first = turn.split("-")[0];
        String second = turn.split("-")[1];
        ArrayList<Character> letterList =new ArrayList<>(Arrays.asList('A','B','C','D','E','F','G', 'H'));

        boolean isFirst=false;
        boolean isSecond=false;
        for(int i=0;i<letterList.size();i++){
            if(first.charAt(0)==letterList.get(i)){
                isFirst=true;


            }

        }

        for(int i=0;i<letterList.size();i++){
            if(second.charAt(0)==letterList.get(i)){
                isSecond=true;

            }

        }
        if(!isFirst&isSecond) {
            System.out.println("ERROR");
            System.exit(0);
        }
        int firstDigit = Character.getNumericValue(first.charAt(1));
        int secondDigit = Character.getNumericValue(second.charAt(1));
        if(firstDigit<1 || firstDigit>8){
            System.out.println("ERROR");
            System.exit(0);
        }
        if(secondDigit<1 || secondDigit>8){
            System.out.println("ERROR");
            System.exit(0);
        }


        int vertDist = Math.abs(first.codePointAt(0)-second.codePointAt(0));
        int horDist =  Math.abs(first.codePointAt(1)-second.codePointAt(1));
       // if((vertDist== 1 && horDist==2) || vertDist==2 && horDist==1)
        if(Math.abs(firstDigit-secondDigit)*Math.abs(first.charAt(0)-second.charAt(0))==2)
            System.out.println("YES");
        else System.out.println("NO");
        //System.out.println("C".codePointAt(0)-"D".codePointAt(0));


    }
}

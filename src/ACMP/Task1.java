package ACMP;
import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException, IOException{

        FileReader reader =new FileReader("INPUT.TXT");
        Scanner scan = new Scanner(reader);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int c = x+y;
        String ans = String.valueOf(c);

        FileWriter writer  = new FileWriter("OUTPUT.TXT");
        writer.write(ans);

        reader.close();
        writer.flush();
        writer.close();



    }
}

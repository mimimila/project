import java.io.*;
import java.util.Scanner;

/**
 * Created by ACER on 25.05.2017.
 */
public class FilesDZ2 {
    static void getData() {
        String str = "";
        String str2="";

        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\FilesDZ.txt"));
            BufferedReader bf = new BufferedReader(new FileReader("C:\\FilesDZ.txt"));
            while (true) {
                System.out.println("vvodite 4isla ");

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                Scanner sc = new Scanner(br.readLine());
                if (sc.hasNextInt()) {
                    int x = sc.nextInt();
                    str2+=(x+"\n");
                    bw.write(x);// print(double/int/char)/ println()
                    bw.newLine();
                } else { bw.close();
                    str = bf.readLine();
                    throw new Exception("Vi vveli ne 4ilso ");
                }

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println(str);
        }
    }
    public static void main(String args[]){
        getData();
    }

}

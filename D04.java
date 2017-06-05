package D;

import java.io.*;

/**
 * Created by ACER on 25.05.2017.
 */
public class D04 {
    public static void method4() {
        File file = new File("C:\\input.txt");
        int a = (int) (Math.random() * 300);
        try {
            PrintWriter writer = new PrintWriter(file);
            writer.print(a); //write - для того,чтобы писать строковые и символьные значения
            writer.close();
            BufferedReader br = new BufferedReader(new FileReader("D:\\input.txt"));
            String b = br.readLine();
            int b1 = Integer.valueOf(b);
            // System.out.println(a);
            System.out.println(Math.sin(b1));
        } catch (IOException ex) {

        }
    }
}

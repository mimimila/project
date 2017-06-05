package DZlists;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by ACER on 30.05.2017.
 */
public class Dzzzzzzzzzzz {
    public void  print(){// методы public будут достпуны из другого файла

    }
    void task(int x) {

        // ArrayList<String> s=new ArrayList<>();
        try
                (BufferedReader br = new BufferedReader(new FileReader("C:\\1.txt")))
            { String str;
            ArrayList<String> s = new ArrayList<>();
            int k = 0;
            while ((str = br.readLine()) != null) {
                s.add(str);
                k++;
            }
            if (x < k) {
                for (int i = x; i < s.size(); i++)
                    System.out.println(s.get(i));
            }


        } catch (Exception IO) {

        }
    }

    public static void main(String []args) {
        Dzzzzzzzzzzz a = new Dzzzzzzzzzzz();
        a.task(500);

    }
}


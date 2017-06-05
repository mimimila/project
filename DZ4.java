package DZlists;

import java.io.File;
import java.util.Stack;

/**
 * Created by ACER on 04.06.2017.
 */
public class DZ4 {
    public static void main(String args[]) {

    File file = new File("C://newfile");
        Stack s=new Stack();
        if(file.isDirectory())
            System.out.println(file+" katalog");

            String arr[];
        arr=file.list();
        for(int i=0;i<arr.length;i++)
            s.push(arr[i]);
        System.out.println(s);

}
}

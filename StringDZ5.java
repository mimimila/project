import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by ACER on 25.05.2017.
 */
public class StringDZ5 {
   static privateAccsess obj = new privateAccsess();
    public static void main(String[] args){
        obj.getLogin();
        obj.getLogin();


        try {
            BufferedReader br=new BufferedReader(new FileReader("C:\\test.txt"));
            PrintStream p=new PrintStream(System.out);
            String str;int max=1; int n=1;
            while((str=br.readLine())!=null) {
                char a[]=str.toCharArray();
                //int max=1; int n=0;
                for(int i=0;i<a.length-1;i++){
                    n=1;
                    if(a[i]=='0'||a[i]=='1'||a[i]=='2'||a[i]=='3'||a[i]=='4'||a[i]=='5'||a[i]=='6'||a[i]=='7'||a[i]=='8'||a[i]=='9') {
                        for(int j=1+i;j<a.length;j++)
                            if (a[j]=='0'||a[j]=='1'|| a[j] == '2' || a[j] == '3' || a[j] == '4' || a[j] == '5' || a[j] == '6' || a[j] == '7' || a[j] == '8' || a[j] == '9')
                                n++;
                            else
                                break;
                    }
                    if(n>max)
                        max=n;}


                //System.out.println(n);
            }

            System.out.println(max);
        }
        catch(IOException ex){

        }
    }
}

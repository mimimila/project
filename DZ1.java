package DZlists;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by ACER on 29.05.2017.
 */
public class DZ1 { // Компилятору Java важно,чтобы имя класса и имя файла совпадали, также ОБЯЗАТЕЛЬНО должен быть класс public
    public static void main(String [] args){
        List <String> arr=new ArrayList<String>();
        Stack<String> s=new Stack<String>();
        try
                ( BufferedWriter bw= new BufferedWriter(new PrintWriter("C:\\DZ.txt"));
            BufferedReader br=new BufferedReader(new FileReader("C:\\java.txt")))
                {String str="";
                int i=0;
            DZadress a=new DZadress(7,str,5);
            while((str=br.readLine())!=null){
               // DZadress a=new DZadress(7,str,5);

               // a.change();
                arr.add(str);
                s.add(i,str);
                i++;

            }
            for(int j=0;j<arr.size();j++)
                System.out.println(arr.get(j).toString());
            for(int k=0;i<arr.size();i++){
            bw.write(arr.get(k));
            bw.newLine();}
            System.out.println(s);

        }

        catch(Exception IO){
            System.out.println("File not exists or wrong directory");
        }

    }
}


//(ФАЙЛ) класс -> s0101001 ->java машина

//Файл ( класс, класс, класс.... ) -> s0101010100->java машина (построчно выбираются команды и запускаются)

//Интерпретатор, компилятор Python , php - интерпретируемые языки
//Программа выполняется построчно . Считывается строка, переводится в 0101010, запускается

//Java, C++, C - компилируемые



package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * Created by ACER on 25.05.2017.
 */
public class DemoSet {
    //Set - множества
    //Set -интерфейс, нужен для коллекций , в которых не должны дублироваться элементы
    //SortedSet - отсортирован в возврастающем порядке first(), last()
    //HashSet - класс, наследуется AbstractSet , в нем реализован интерфейс Set, хэш-таблица (ключ-значение)
    //Ключ используется вместо индекса (i), (хэш-код=ключ) Иванов-4444, хэш-код =Иванов
    //Поиск в такой коллекции осущ-ся быстрее
    public static  void main(String [] args){

        HashSet<String> country = new HashSet<>();
        country.add("Россия");
        country.add("Франция");
        country.size();//размер таблицы

        Set words =new HashSet(100);// создали таблицу на 100 элементов
        try{
            BufferedReader in = new BufferedReader(new FileReader("d:/test.txt"));
            String line="";//пустая строка
            while(!(line=in.readLine()).equals("END")){ //читаем пока не встретим слово END
                StringTokenizer tokenizer=new StringTokenizer(line); //отправляем в конструктор

                //Александ Пушкин = токен
                while(tokenizer.hasMoreTokens()){
                    String word=tokenizer.nextToken();
                    words.add(word);
                    //System.out.println("\t"+word);
                }
            }
        }catch (IOException ex){

        }
        Iterator it= words.iterator();//получаем указатель на первый элемент множества
        while(it.hasNext()){
            System.out.println(it.next());
        }
        StringTokenizer str = new StringTokenizer("Home cat"," \n\t");// Vector,Stack
        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }

    }
}

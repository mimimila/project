package collections;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by ACER on 25.05.2017.
 */
public class DemoList2 {
    static ListIterator it; //оздаем объект ->
    public static void main(String [] args){
        ArrayList a = new ArrayList();
        int index;
        System.out.println("Колелкция пуста:"+a.isEmpty());
        Character ch = new Character('b');
        a.add(ch);
        for(char c='a'; c<'h'; c++){ // a=90, b=91....
            a.add(new Character(c));
        }
        System.out.println(a+"число элементов"+a.size());
        it=a.listIterator(2);//Извлекаем итератор из списка
        it.add("new");
        System.out.println(a);
        index=a.lastIndexOf(ch);
        a.set(index,"replace");
        System.out.println(a);
        //remove
        // 5 5 5 5 5 5 4 3
    }
}

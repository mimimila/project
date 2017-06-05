import java.util.*;

/**
 * Created by ACER on 28.05.2017.
 */
public class Demogenerics {
    public static void main(String []args){
        //Новый класс не создается для каждого конкретного типа и сама коллекция не меняется, компилятору сообщается о типе элементов
        // int, double,  float
        Map<String, Integer> map = new HashMap<String, Integer>(); //При создании ссылки тип нужно указывать, если тип не будет указан, то можно будт добавлять объекты любого типа
        map.put("Key 1",1);
        int res=map.get("Key 1"); //компилятор уже знает тип значения
        Character ch = new Character('2');
       // map.put(ch);ошибка на этапе компиляции

        Collection c1= new HashSet<String>();
        c1.add("Java");
        c1.add(5); // Ошибки нет, так как ссылка c1 не параметризирована
        for(Object ob: c1) // for each
            System.out.print(ob);
        Collection<String> c2= new HashSet<String>();
        c2.add("Java");
         //c2.add(4); //Ошибка компиляции, так как ссылка параметризована
        //checkedCollection(коллекция, тип элементов коллекции) = создает коллекцию, проверяемую на этапе выполнения, в случае "постороннего" ClassCastException
        Collection с= Collections.checkedCollection(new HashSet<String>(), String.class);
    }
}

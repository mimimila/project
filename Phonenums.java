import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by ACER on 22.05.2017.
 */
public class Phonenums {
    //Hashtable  - класс, нужен для реализации hash таблицы (ключ-значение), Null (0, пустота) - в виде ключа или значения использовать нелья
    public static void main(String [] args){
        Hashtable phoneBook=new Hashtable();//Реализации структуры данных
        phoneBook.put("Лазарев","8-925-452-11-44"); //ключ - фамилия, значение - номер телефона
        phoneBook.put("Ирина Л.","8-925-454-11-44");
        phoneBook.put("Ольга Л.","8-925-451-11-44");
        System.out.println(phoneBook.get("Ольга Л."));
        //Для чтения списка ключей есть метод keys, возвращает объект класса Enumeration - перечисление ( аналог массива)
        Enumeration keys = phoneBook.keys();//Достаем список всех ключей ( фамилий) из таблицы
        //keys - массив строк, который содержит все фамилии
        while(keys.hasMoreElements()){ //есть ли доступные элементы
            //keys[1] - Лазарев
            String user=(String)keys.nextElement(); //Получаем элемент из перечисления, приводим к типу String
            String value =(String)phoneBook.get(user); //В метод get() отправляем фамилию, полученную на текущей итерации
            System.out.println("key(user)="+user+" value(phone)="+value);
        }
    }
}

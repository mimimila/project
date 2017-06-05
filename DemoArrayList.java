package collections;

import java.util.ArrayList;

/**
 * Created by ACER on 25.05.2017.
 */
public class DemoArrayList {
    //Динамический массив
    //ArrayList(), ArrayList(Collction c), ArrayList(int c)
    //add,addAll,get, indexOf,remove
    //ArrayList - для хранения списков, которые не нужно изменять (Потому что удалить элемент из ArrayList досттаочто тяжело ресурсоемко)
    public static void main(String [] args){
        // полиморфизм
        ArrayList c=new ArrayList();// по ссылке типа родительского класса (суперкласса) можно записать объект класса потомка
        // List n1=new ArrayList();

        //Collection c = new ArrayList();
        int i=2, j=5;
        c.add(new Integer (i)); //примитивную переменную отправили в "обёртку", wrapped
        c.add(new Boolean("True"));
        c.add("STRING"); // String str -> Object
        c.add(2, Integer.toString(j)+"X"); //5X
        System.out.println(c);
        if(c.contains("5X")){
            c.remove(c.indexOf("5X"));
        }
        System.out.println(c);
    }

    // Геометрическая фигура (ссылка) = Квадрат obj  (физический объект)
    //квадрат obj (ссылка) = new Квадрат (физический объект)
    //  документ(1адрес) = Дом
    //документ2(адрес)=документ(1адрес)  =Дом
    //Ведомость (основной документ) - Дом
    //List [] arr =Квадрат, Треугольник, Круг
    // for()  arr[i].draw();


}

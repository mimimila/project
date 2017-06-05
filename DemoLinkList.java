package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by ACER on 25.05.2017.
 */
public class DemoLinkList {
    // Для удаления элемента - нужно пройтись по всем предыдущим элементам [-]
    //Для добавления элемента с список - нужно пройтись по всем пред. элементам, вставить в нужное место 4 5 -> 6 [+]
    //
    //ArrayList5->8->6
    //[4][5][100][6][7][7]в обычном массиве элементы хранятся в соседних ячейках
    //[4][dfsf][4][6][][][][][5]
    //{4,address}, {4,address}
    //addFirst(),addLast(),getFirst(),getLast(), removeFirst(), removeLast()
    public static void main(String[] args){
        LinkedList aList=new LinkedList(); //создаем связанный список, объект класса LinkedList
        for(int i=0; i<=20;i++) // 20 раз выполняем итерации по заполнению
            aList.add(""+i);//заполянем список  строками "0","1","2","3","4", int ->string : """+1 ->"1""

        Iterator it=aList.iterator();//получаем указатель на первый элемент списка ->
        // 1 2 ->3 4 5 6 7<-.
        while (it.hasNext()) {  //возвращает true, если стрелка указывает на корректное значение
            System.out.print(it.next() + "->"); //arr.get(i)... arr[i]-> for(; i<N-1; i++)
            //it.next()-возвращает значение на которое указывает итератор, сдвигает итератор к следующему элементу списка
        }
        ListIterator list = aList.listIterator(); //list -указатель на первый элемент списка , индекс =0
        // ->0 1 2
        list.next(); //сдвигаем стрелку на один элемент,
        //0 1-> 2
        list.next();
        //0  1 2-> 3
        list.next();
        System.out.println("\n"+list.nextIndex()+"-й индекс");//индекс=1

        list.remove(); // arr.remove(3) ->arrayList , Для того,чтобы удалить элемент из списка нужно было знать его индекс

        //it=aList.iterator();//перемещаем указатель на начало списка
        //while (it.hasNext()) {
        //  System.out.print(it.next() + "->");
        //}
        list.next();
        while(list.hasNext())
            System.out.print(list.next() + "->");
        while (list.hasPrevious())//проверяем, есть ли предыдущий элемент
            //вывод в обратном порядке
            System.out.println(list.previous()+" ");//получаем предыдущий элемент, стрелка сдвигается влево
        //+ работает быстрее, если вставляем элементы, если удаление идет только с начала списка или только с конца
        aList.removeFirst();
        aList.removeFirst();
        aList.removeLast();
        aList.addFirst("first");
        aList.addLast("last");
        System.out.println("\n"+aList); // toString()
    }
}

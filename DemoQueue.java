import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by ACER on 28.05.2017.
 */
public class DemoQueue {
    public static void main(String []args) {
        LinkedList <Integer>c = new LinkedList<Integer>();
        for(int i=0; i<10; i++){
            c.add(i);
        }
        Queue <Integer> queue=c;
        for(int i: queue){
            System.out.println(i+" ");
        }
        System.out.println("size:"+queue.size());
        for(int i=0; i<9; i++){
            int p=queue.poll(); //возвращает и удаляет головной элемент
            System.out.println("p:"+p);
        }
        System.out.println("size:"+queue.size());
    }
}
//Массивы, ,стэк (FIFO), очередь, списки

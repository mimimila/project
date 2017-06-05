import java.util.Arrays;

/**
 * Created by ACER on 28.05.2017.
 */
public class ArraySdemo {
    //Методы поиска, заполнения, преобразования массива в коллекцию
    public static  void main(String [] args){
        char m1[] = new char[3];
        char m2[]={'a','b','c'};
        Arrays.fill(m1,'n');
        System.out.println("m1:");
        for(int i=0; i<3; i++){
            System.out.println(" "+m1[i]);
        }
        m1[1]='b';
        m1[2]='c';
        if(Arrays.equals(m1,m2)){
            System.out.println("Эквивалентны");
        }else{
            System.out.println("не Эквивалентны");
        }

        m1[0]='z';
        Arrays.sort(m1);
        System.out.println("После сортировки");
        for(int i=0; i<3; i++){
            System.out.println(" "+m1[i]);
        }

        System.out.println("Значение символа  'c'  находится на позиции "+Arrays.binarySearch(m1,'c'));
    }
}

package parall;

/**
 * Created by ACER on 05.06.2017.
 */
public class MoreBasicThreads {
    public static void main(String [] args){ //main создает потоки и не создаат ссылки на объекты
        //сборщик мусора , каждый объект имеет ссылку ,
        for(int i=0; i<5; i++){
            new Thread(new LiftOff()).start(); // Сборщик мусора не реагирует на объекты класса Thread
            //объект класса Thread регестрируется в сборщике мусора и ссылка на него хранится в системе, после того как
            // завершится метод run () объект удаляется
        }
        System.out.println("Waiting");
    }
}
//JDK - библиотеки 1.8
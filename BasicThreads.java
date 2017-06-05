package parall;

/**
 * Created by ACER on 05.06.2017.
 */
//Runnable - создать объект класса, преобразовать объект в нужную задачу ; Задачу нужно передать конструктору класса Runable
public class BasicThreads {
    //Парралельно выполняется метод  main и метод класса LiftOff -> run()
    public static void main(String [] args){
        Thread d= new Thread(new LiftOff());
        d.start();// выполянет инициализацию потока, затем вызывает метод run(), чтобы запустить задачу в новом потоке
        System.out.println("Waiting...");
        System.out.println("Waiting...");
        System.out.println("Waiting...");
    }
}

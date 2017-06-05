package parall;

/**
 * Created by ACER on 05.06.2017.
 */
//Выводит обратный отсчет перед запуском
public class LiftOff implements Runnable {//Планировщик потоков - система, которая переключает процессор с одного потока на другой
    int count=10;
    static int taskCount=0; //общая для всех объектов класса LiftOff
    final int id=taskCount++; //различает номера подхадач
    LiftOff(){}
    LiftOff(int count){
      this.count=count;
    }
    String status(){
        String temp;
        if( count>=0){
            temp=Integer.toString(count);
        }else{
            temp="off";
        }
        return "#"+id+" "+temp;
    }
    public void run(){
        while(count>0){
            System.out.println(status());
            count--;
            Thread.yield();//используем статический метод,
            //"Важная часть моего потока выполнена, можешь переключиться на другую задачу"
        }
    }

}

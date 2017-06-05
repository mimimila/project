package parall;

/**
 * Created by ACER on 05.06.2017.
 */
public class MainThread {
    public  static  void main(String [] args){
        LiftOff launch= new LiftOff();
        launch=new LiftOff(); //  ссылка1->[объект2]        [объект1]
        launch.run();
    }
}

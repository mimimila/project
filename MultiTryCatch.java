/**
 * Created by ACER on 25.05.2017.
 */
public class MultiTryCatch {
    public static void main(String [] srgs) {
        try{
            int a = (int) (Math.random() * 2)-1; // (0, 0.01, 0.02....1 ) * 2  =0/2
            System.out.println(a);// a=0
            try{
                //внутренний блок
                int b=1/a; //  throw new ArithmeticException("информауия об ошибке");
                //String or StringBuffer? В случае работы  со String объект пересоздается, а в StringBuffer информация добавляется
                //16 байт для строки выделяются по умолчанию при создании объекта
                StringBuffer sb=new StringBuffer(a);
            }catch(NegativeArraySizeException ex){
                System.out.println("Недопустимый размер буфера");
            }
            //Программа сначала в данной области будет искать обработчик, если его нет, то начнет подниматься на уровень выше
        }
        catch(ArithmeticException ex){
            System.out.println("Деление на 0"+ex.toString());
        }
    }
}



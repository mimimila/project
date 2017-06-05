/**
 * Created by ACER on 25.05.2017.
 */
public class ThrowGeneration {
    //Оператор throw - генерерирует исключение
    //throw объектThroable;
    static void throGen(){
        try{
            //Хотим самостоятельно сгенерировать исключение (своего типа)
            //Нужно создать объект класса ClassCastException, в конструктор данного класса отправить строчку с информациоей об ошибке
            //,,,,код в котором возможно произойдет ошибка
            String login ="Ivan";
            String password="1234";
            if(login.equals("Ivan")&& password.equals("5555"))
                System.out.println("Верно");
            else {
                // ClassCastException obj = new ClassCastException("data");
                // return obj;
                ClassCastException obj = new ClassCastException("Неверный пароль для входа!!!");
                throw obj; // return obj;
                //.....
                //Позволить доступ работы с сайтом
                //....
            }
        }catch(ClassCastException ex){ //Написать собственный блок catch, отлавливающий "кастомный"
            System.out.println("исключение внутри метода throwGen()"+ex.toString());
            //throw  ex; //ошибка будет обработана методом, котороый вызвал throwGen()
        }
    }
    public static void main(String [] args){
        //  try {
        throGen();
        //  }catch (ClassCastException ex){
        //       System.out.println("Обработчик вне метода");
        //  }
    }
}

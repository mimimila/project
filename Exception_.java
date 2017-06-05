/**
 * Created by ACER on 25.05.2017.
 */
public class Exception_ {

    void doCalc() {
        try {
            int x = 7 / 0;//возникает ошибка, создается объект класса ArithmeticException, в него записывается информация об ошибке
        } catch (ArithmeticException ex) {//В блок cath() приходит объект, в котором хранится информация  об ошибке
            String str = ex.toString();//Сохраняем в строку всю информацию об ошибке
            System.out.println(str);
        }
    }
    //Второй способ обработки - метод генерирует исключение (создает объект нужного класса)
    //Исключение сам обработаь не может, передает его другим методам
    //Нужно использовать throws (выбросить исключение)

    void doCalc2() throws ArithmeticException {
        int x = 7 / 0;
    }

    void myCalc() { //Обрабатывает исключение, котое может возникнуть в doCalc2
        try {
            doCalc2();//Метод, который может выбросить исключение
        } catch (ArithmeticException ex) {
            String str = ex.toString();//Сохраняем в строку всю информацию об ошибке
            System.out.println(str);
        }
    }
}
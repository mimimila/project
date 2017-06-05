/**
 * Created by ACER on 25.05.2017.
 */
public class TwoException {
    public static void main(String [] srgs) {
        try {
            int a = (int) (Math.random() * 2); // (0, 0.01, 0.02....1 ) * 2  =0/2
            System.out.println(a);
            int c[] = {1 / a}; // 1/2 ... 1/0 c[0]
            c[a] = 555; //c[1] ..
            int arr[]={1,2,3,4,5};
//            for(int i=0; i<5; i++){
//                int b=arr[i]+arr[i+1];
//                System.out.println(b);
//            }
        }catch (ArithmeticException ex){
            System.out.println("Деление на 0"+ex.toString());
        }
        catch(ArrayIndexOutOfBoundsException ex){ //выход за границу массива
            System.out.println("Выход за границу массива");
        }
        System.out.println("После блока try-catch");
    }

}

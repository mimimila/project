import java.io.*;
import java.util.ArrayList;

/**
 * Created by ACER on 25.05.2017.
 */
public class Train {
    int cars;
    int number;
    String type;

    Train(int c, int n, String t) {
        type = t;
        number = n;
        cars = c;
    }
    static void tr(ArrayList<Train> A) {
        InputStreamReader obj= new InputStreamReader(System.in);//Связываем поток и источник данных

        BufferedReader br = new BufferedReader(obj);//Читаем строки с консоли
        // BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\java.txt"))
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\java.txt"));
            bw.write("Poezd nomer " + "Koli4estvo vagonov  " + "Tip poezda ");
            System.out.println("Vvedite koli4estvo poezdov");
            int a11;
            while((a11=br.read())!=0){ //Метод read  в случае, когда символы закончились возвращает 0
                System.out.println((char)a11); //Unicode на один символ выделяется 16 бит
            }
            System.out.println("check:"+a11);
            String a1 = br.readLine();
            int a = Integer.valueOf(a1);
            bw.newLine();
            for (int i = 0; i < a; i++) {
                System.out.println("vvedite nomer poezda");
                String str = br.readLine();// Все строки заканчиваются "\n"
                int x = Integer.valueOf(str);
                System.out.println("vvedite koli4estvo vagonov");
                String str1 = br.readLine();
                int y = Integer.valueOf(str1);
                System.out.println("vvedite tip poezda");
                String str2 = br.readLine();
                Train b = new Train(x, y, str2);
                A.add(b);
            }

            System.out.println("Vvedite 1  dlya dobavleniya poezdov, 2 dlya korrektorovki, 3 udalenie, 0 vihod");
            String h = br.readLine();
            if ((h.equals("0"))) {
                for (int i = 0; i < A.size(); i++) {
                    bw.write(A.get(i).cars + "            " + A.get(i).number + "               " + A.get(i).type);
                    bw.newLine();
                }
                bw.close();
            } else if (h.equals("1")) {
                System.out.println("Skolko poezdov vi hotite dobavit?");
                String e=br.readLine();
                int E=Integer.valueOf(e);
                for(int i=0;i<E;i++){
                    System.out.println("vvedite nomer poezda");
                    String str = br.readLine();
                    int g = Integer.valueOf(str);
                    System.out.println("vvedite koli4estvo vagonov");
                    String str1 = br.readLine();
                    int o = Integer.valueOf(str1);
                    System.out.println("vvedite tip poezda");
                    String str2 = br.readLine();
                    Train t = new Train(o, g, str2);
                    A.add(t);}
                for (int i = 0; i < A.size(); i++) {
                    bw.write(A.get(i).number + "            " + A.get(i).cars + "               " + A.get(i).type);
                    bw.newLine();
                }
                bw.close();
            } else if (h.equals("2")) {
                System.out.println("Kakoi poezd vi hotite redaktirovat?");
                String n = br.readLine();
                int num = Integer.valueOf(n);
                System.out.println("vvedite nomer poezda");
                String str = br.readLine();
                int g = Integer.valueOf(str);
                System.out.println("vvedite koli4estvo vagonov");
                String str1 = br.readLine();
                int o = Integer.valueOf(str1);
                System.out.println("vvedite tip poezda");
                String str2 = br.readLine();
                Train t = new Train(o,g, str2);
                A.set(num, t);
                bw.flush();
                for (int i = 0; i < A.size(); i++) {
                    bw.write(A.get(i).number + "            " + A.get(i).cars + "               " + A.get(i).type);
                    bw.newLine();
                }
                bw.close();
            } else if (h.equals("3")) {
                System.out.println("Kakoi poezd vi hotite udalit?");
                String num = br.readLine();
                int n = Integer.valueOf(num);
                bw.flush();
                A.remove(n);
                for (int i = 0; i < A.size(); i++) {
                    bw.write(A.get(i).number + "            " + A.get(i).cars + "               " + A.get(i).type);
                    bw.newLine();}
                bw.close();
            }
            else
                System.out.println("error");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        ArrayList<Train> A=new ArrayList<Train>();
        tr(A);
    }
}

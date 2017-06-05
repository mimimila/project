package D;

import java.io.*;

/**
 * Created by ACER on 25.05.2017.
 */
public class D03 {
    public static void  method2(){
        double arr[]=new double[361];// 4 ->0 1 2 3 4
        double err[]=new double[361];
        int j=0;
        try {
            BufferedReader br=new BufferedReader(new FileReader("C:\\sin.txt"));
            PrintStream p=new PrintStream(System.out);
            ObjectOutputStream ob = new ObjectOutputStream(new FileOutputStream(new File("C:\\sin3.txt")));
            // ObjectOutputStream OB = new ObjectOutputStream(new FileOutputStream(new File("D:\\sin3.txt")));
            String str;
            while((str=br.readLine())!=null) {
                //String str=br.readLine();
                //double x=Double.valueOf(str);
                //char a[]=str.toCharArray();
                String b[]=str.split(" ");
                double d=Double.valueOf(b[0]);
                double dd=Double.valueOf(b[1]);

                arr[j]=d; err[j]=dd;

                //System.out.println(arr[j]+" "+err[j]);
                j++;
            }
            mass A=new mass(arr);
            mass C=new mass(err);
            for(int i=0;i<arr.length;i++) {
                mass1 J = new mass1(arr,i);
                ob.writeObject(J);
            }


            // ob.writeObject(A);
            //OB.writeObject(C);
            ObjectInputStream ob1=new ObjectInputStream(new FileInputStream(new File("C:\\sin3.txt")));
            //ObjectInputStream ob2=new ObjectInputStream(new FileInputStream(new File("D:\\sin3.txt")));
            // mass D=(mass)ob2.readObject();
            //mass B = new mass();// превратим поток байт в реальный объект

            mass1  Y=(mass1)ob1.readObject();
            //B=(mass)ob1.readObject();//прочитает байты из файла и будет готов вернуть объект (внутри объекта хранится массив)
            //  B.show();
            //D.show();
            Y.show1(5);



        }
        catch(IOException ex){

        }
        catch (ClassNotFoundException ex)

        {

        }
    }

}

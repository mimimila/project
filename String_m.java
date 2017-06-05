package strings;

/**
 * Created by ACER on 25.05.2017.
 */
//Шаблон для чтения информации из файла построчно
public class String_m {
   /* public static void main(String args[]){
        //Файл
        try {
            //[file.txt]=======> [file_stream]======>[inputStreamReader] =======> [BufferedReader]
            //[System.in]======>[inputStreamReader] =======> [BufferedReader]

            //Создаем поток для  чтения информации из файла
            FileInputStream fl = new FileInputStream("C:\\test.txt");
            //Свяжем файловый поок и InputStreamReader
            InputStreamReader obj=new InputStreamReader(fl);
            // Воспользуемся классом для чтения данных (отправим ему поток)
            BufferedReader br=new BufferedReader(obj); //Работает быстрее, умеет читать строки

            String str;  int x=0; int y=1;
            //String err[]=str.split(" ");
           while((str=br.readLine())!=null){ //считываем построчно до тех пор, пока не встретим конец файла (null =0)
               // System.out.println(str.charAt(0));
                String err[]=str.split(" ");
                for(int i=0;i<err.length;i++){
                   // System.out.println("Stroka "+y+": ");
                char a=err[i].charAt(0);
                switch(a){
                    case 'a':
                 System.out.println(err[i]); x++;
                 break;
                    case 'e':
                        System.out.println(err[i]); x++; break;
                    case 'i':
                        System.out.println(err[i]); x++; break;
                    case 'o':
                        System.out.println(err[i]); x++; break;
                    case 'u':
                        System.out.println(err[i]); x++; break;
                    case 'y':
                        System.out.println(err[i]);x++; break;}}y++;}
                      if(x==0)
                          System.out.println("Net slov na4inaushihsya s glasnih");



        }catch (IOException ex){
            System.out.println("Ошибка");
        }


    }*/
}

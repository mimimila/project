import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by ACER on 22.05.2017.
 */
public class DZmap {
   static void meth(Map m1,Map m2){
//       for(int j=0;j<m1.size();j++){
//            for(int i=0;i<m1.size();i++){
//                if(m1.get(i).equals(m2.get(j))) {
//                 //   System.out.print(m1.get(i)+" "+m2.get(j)+"\n");
//                    m1.remove(m1.get(i));
//                }
//            }
//
//       }

       for(Iterator<Map.Entry<Integer, String>> it = m1.entrySet().iterator(); it.hasNext(); ) {
           Map.Entry<Integer, String> entry = it.next(); //Строчка из таблицы
           for (Iterator<Map.Entry<Integer, String>> it2 = m2.entrySet().iterator(); it2.hasNext(); ) {
               Map.Entry<Integer, String> entry2 = it2.next();
               if (entry.getValue().equals(entry2.getValue())) { // Сравниваете значения из записи 1 и записи 2
                   it.remove();

               }
           }
       }
       System.out.print(m1+"\n"+m2);
    }
    public static  void main(String [] args){
        Map<Integer,String> map=new HashMap<Integer,String>();
        for(int i=0;i<10;i++)
            map.put(i,""+(i+1));
        Map<Integer,String> map1=new HashMap<Integer,String>();
        int i=0;
        for(int j=0;j<10;j++) {
            map1.put(j,""+i);
             i=i+2;
        }
            System.out.println(map);
            System.out.println(map1);
        meth(map,map1);

    }
}
// { "Line1", line } , line.arr -> point (x,y)
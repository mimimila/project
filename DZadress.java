package DZlists;

import java.util.ArrayList;

/**
 * Created by ACER on 24.05.2017.
 */
public class DZadress {
    int ind;
    String street;
    int number;
    DZadress(int ind,String street,int number){
        this.ind=ind;
        this.street=street;
        this.number=number;
        System.out.println(ind+" "+street+" "+number);
    }
    void ravno(ArrayList<DZadress> A){
        int j=0;
        for(int i=0;i<A.size();i++){
            if(i!=j)
                if(A.get(j).ind==A.get(i).ind&&A.get(j).street.equals(A.get(i).street)&&A.get(j).number==A.get(i).number)
                    System.out.println("adress "+i+"takoi je kak adress "+j);
        }

    }
  static void ch(DZadress a){
        System.out.println(a.ind+" ulitsa "+a.street+" , "+a.number);

  }
  public  void  change(){
      StringBuffer sb=new StringBuffer(street.length());
     // char[] ch=street.toCharArray();
      //char[] ch1=new char[ch.length];
     // ArrayList<Character> ch2=new ArrayList<>();
      //for(int j=0;j<ch.length;j++)
      //    ch2.add(j,ch[j]);
      //Iterator it=ch2.iterator();
      //while (it.hasNext()){
     // for(int i=0;i<ch.length;i++) {
      char err[]={'а','б','в','г','д','е','ж','з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ц','ч','э','ю','я'};
      String arr[]={"a","b","v","g","d","e","jh","z","i","y","k","l","m","n","o","p","r","s","t","u","f","h","c","ch","e","yu","ya"};
      for(int i=0;i<street.length();i++){
      for(int j=0;j<arr.length;j++){
          if(street.charAt(i)==err[j])
              sb.append(arr[j]);

      }}
      for(int i=0;i<sb.length();i++)
          System.out.print(sb.charAt(i));
      System.out.println("\n"+sb);}


 static  void sort(ArrayList<DZadress> arr){
     System.out.println(" ");
      ArrayList<DZadress>arr1=new ArrayList<DZadress>();
      char Err[]={'а','б','в','г','д','е','ё', 'ж', 'з','и','й','к','л','м','н','о','п','р','с','т','у','ф','х','ч', 'ц','ш', 'щ', 'э','ю', 'я', 'ы','ъ','ь'};
      char err[]=new char[arr.size()];
      for(int i=0;i<arr.size();i++){
         err[i]= arr.get(i).street.charAt(0);
      }
      for(int j=0;j<Err.length;j++){
      for(int i=0;i<arr.size();i++){
          if(err[i]==Err[j])
             // arr1.add(arr.get(i));
              System.out.println(arr.get(i).ind+" "+arr.get(i).street+" "+arr.get(i).number);
      }}
  }
  public static void main(String [] args){
      DZadress A=new DZadress(199155,"кораблестроителей",36);
      A.change();
      ch(A);
      DZadress B=new DZadress(1234567,"наличная",42);
      DZadress C=new DZadress(23456,"мичанская",5);
      ArrayList<DZadress> Arr=new ArrayList<>();
      Arr.add(A);
      Arr.add(B);
      Arr.add(C);
      sort(Arr);
  }
}

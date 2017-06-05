package strings;

/**
 * Created by ACER on 28.05.2017.
 */
public class MyQueue { // Данные, интерфейс (методы)
    private  String [] docs; // docs[4] , docs[3]
    private int maxSize;// максимальный размер очереди
    private int size;
    private  int front;// накладываем запрет на произвольное изменение поля класса , MyQueue obj =new... , obj.front=10; obj.
    int end;// можно не делать
    MyQueue(int maxSize){
        this.maxSize=maxSize;
        docs=new String [maxSize];
        front=0;
        size=0;
        end=0;
    }
    // процедуру вставки элемента в очередь
    void insert(String nameDoc){
        if(end==maxSize-1){ // если места закончатся, то сделать циклический перенос в начало
            end=0;
        }
        docs[end]=nameDoc;
        end++;
        size++;
    }
    // 1 2 3 4
   String remove(){//Удаляем начиная с начала очереди
        String temp=docs[front];
        front++;
        size--;
        return  temp;
   }
   private void test(){ // Так как он приватный, его можно использовать только внутри данного класса
       System.out.println("test");
   }
   String getFront(){
       return docs[front];
   }
   boolean isFull(){
       return  (size==maxSize-1);
   }
   private boolean isEmpty(){
       return (size==0);
   }
   int getSize(){
       return size;
   }
   //Arrays
   public static void main(String [] args){// Из методов класса приватные поля доступны
       MyQueue q= new MyQueue(30);
       //q.login="jhkhjk";
       q.maxSize=789;
       q.insert("docc1"); // front=0, end=1
       q.insert("docc2");// front =0, end=2
       q.insert("docc3");// front =0, end=3
       q.insert("docc4");// front =0, end=4
       q.insert("docc5");// front =0, end=5

       q.remove();// front =1, end=5
       q.remove();// front =2, end=5

       while(!q.isEmpty()){ //size!=0
           String doc=q.remove(); // front ++; size --;
           System.out.println("Elem:"+doc);
       }

   }
}
//end=1
//front =1
// [ "test.doc"] -> [ 'test2.txt' ]-> ["test.doc" ] ["test.doc" ] ["test.doc" ]

import java.util.ArrayList;

/**
 * Created by ACER on 22.05.2017.
 */
public class Line {
    ArrayList<Points> line = new ArrayList<>();
    String name;

    void ad(Points p) {
        line.add(p);
    }

    static float len(ArrayList<Points> err) { //Массив из точек
        float sum = 0;
        for (int i = 0; i < err.size() - 1; i++) {// sqrt((y2-y1)^2 + (x2-x1)^2));
            sum += Math.sqrt(Math.pow((err.get(i).x - err.get(i + 1).x), 2) + Math.pow((err.get(i).y - err.get(i + 1).y), 2));
        }
        System.out.println(sum);
        return sum;
    }

    void sort(ArrayList<Line> lines) { //Массив линий
        // 2  3 1 6
        Line temp;
        for (int i = 0; i < lines.size(); i++) {
            for (int j = lines.size(); j > i; j--) {
                if (len(lines.get(i).line) > len(lines.get(i + 1).line)) { //len(Arr.get(i).arr)
                    //Line one = new Line();  one.line  ... one.arr
                    // a=6, b=5 temp=a, a=b, b=a
                    temp = lines.get(i); //a
                    //Узнать индес lines.get(i) -> i

                    //Удалить из массива его по индексу
                    lines.remove(i); //a
                    //Вставить новый элемент по этому индексу
                    lines.add(i,lines.get(i + 1));//b
                    //Удаляем lines.get(i + 1) , вставляем по индексу i+1 temp
                    // 1 2 6 8
                    lines.remove(i+1); //a
                    lines.add(i+1,temp);//b

                }
            }
        }
    }

}
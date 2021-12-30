import java.util.Comparator;
import java.util.TreeSet;
/*
Write a program to insert Integer objects into the TreeSet where the sorting order is descending order.
 */
public class Comapretr implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        Integer I1=(Integer) o1;
        Integer i2=(Integer) o2;
        if(I1>i2) {
            return -1;
        }

        if (I1>i2){
            return -1;
        }
        return 0;
    }
}
 class Mytesting {
    public static void main(String[] args) {
        TreeSet <Integer> obj= new TreeSet<>(new Comapretr());
        obj.add(10);
        obj.add(20);
        obj.add(0);
        obj.add(11);
        obj.add(19);
        obj.add(90);
        obj.add(100);
        obj.add(765);
        System.out.println(obj);
    }
}

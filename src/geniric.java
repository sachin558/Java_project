import java.util.ArrayList;
import java.util.List;

public class geniric{
    void display(){
        List obj1=new ArrayList();
        obj1.add("sachin");
        obj1.add("1937");
        obj1.add(90);
        System.out.println(obj1);
    }
    public static void main(String[] args) {
         geniric obj=new geniric();
         obj.display();
    }
}

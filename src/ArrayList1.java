import java.util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList();
        obj.add("kfl");
        obj.add(10);
        obj.add(809.069);
        obj.add("gk");
        obj.add(null);
        System.out.println(obj);
        obj.remove(1);
        System.out.println(obj);
    }
}

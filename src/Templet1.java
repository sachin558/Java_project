import java.io.PrintWriter;

public class Templet1 <T>{
    public void show (T arr[]){
        for (T r:arr){
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        String arr[]={"sachin","A","yadav"};
        Character arr1[]={'d','a','f'};
        Integer arr2[]={12,3132,423,34,};
        Templet1 obj=new Templet1();
        obj.show(arr);
        obj.show(arr1);
        obj.show(arr2);
    }
}

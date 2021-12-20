import java.util.Scanner;

public class TempletClass<T> {
    private T v1,v2,v3;
    public void setV1(T tval){
        v1=tval;
        v2=tval;
    }
    public T getV1(){
        return v1;
    }
    public static void main(String[] args) {
        TempletClass<String> obj=new TempletClass();
        TempletClass<Integer> obj1=new TempletClass<>();
    }
}

/*
  Create a class named 'Programming'. While creating an object of the class,
  if nothing is passed to it, then the message "I love programming languages" should be printed.
  If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
For example, while creating object if we pass "Java", then "I love Java" should be printed.
 */
public class Qstion6 {
    String str;
    String ss;
    Qstion6(String str){
        ss=str;
    }
    Qstion6(){
        ss="l love programming ";
    }
    void display(){
        System.out.println("I love "+ss);
    }

    public static void main(String[] args){
        Qstion6 obj=new Qstion6("java");
        obj.display();
    }
}

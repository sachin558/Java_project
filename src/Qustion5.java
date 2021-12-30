import java.util.Scanner;

/*
Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.
 If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.
 If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.
 If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.
  If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.
 */
public class Qustion5 {
    public static void main(String[] args) {
        System.out.println("entre the geder of the male of female ");
        Scanner obj=new Scanner(System.in);
        String gedar=obj.nextLine();
        System.out.println("entre teh age and Famle or Male ");
        int age=obj.nextInt();
            if(gedar.equals("Famale")){
                if(age>1 && age<=58){
                    System.out.println("interest is 8.2%.");
                }if(age>59&&age<=100){
                    System.out.println("interest is 9.2%");
                }

            }else if(gedar.equals("Male")){
                if(age>1&&age<=58){
                    System.out.println("interest is 8.4%.");
                }if(age>59&&age<=100){
                    System.out.println("interest is 10.5%.");
                }
            }
    }
}

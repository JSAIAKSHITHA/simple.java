import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the marks:");
        int telugu=s.nextInt();
        int hindi=s.nextInt();
        int english=s.nextInt();
        int maths=s.nextInt();  
        int science=s.nextInt();
        int social=s.nextInt();
        int total=telugu+hindi+english+maths+science+social;
        if(total<=300){
            System.out.println("fail percentage:"+(total*100)/600+"%"+" Grade: F");
        } else if(total<=400){
            System.out.println("pass percentage:"+(total*100)/600+"%"+" Grade: D");
        } else if(total<=500){
            System.out.println("good percentage:"+(total*100)/600+"%"+" Grade: C");
        } else if(total<=550){
            System.out.println("very good percentage:"+(total*100)/600+"%"+" Grade: B");
        } else if(total<=600){
            System.out.println("excellent percentage:"+(total*100)/600+"%"+" Grade: A");}
    }
}

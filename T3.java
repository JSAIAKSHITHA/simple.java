import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Marks: ");
        int telugu = sc.nextInt();
        int hindi=sc.nextInt(); 
        int english=sc.nextInt();
        int maths=sc.nextInt(); 
        int science=sc.nextInt();
        int social=sc.nextInt();
        float total=telugu+hindi+english+maths+science+social;
        System.out.println("Marks Obtained in Telugu: "+telugu);
        System.out.println("Marks Obtained in Hindi: "+hindi);  
        System.out.println("Marks Obtained in English: "+english);
        System.out.println("Marks Obtained in Maths: "+maths);
        System.out.println("Marks Obtained in Science: "+science);
        System.out.println("Marks Obtained in Social: "+social);
        double a=(total/600)*100;
        System.out.println("Total Marks: "+total);
        System.out.println("Percentage: "+a);
        if(a>90){
            System.out.println("Grade: A");
        }
        else if(a>80){
            System.out.println("Grade: B");
        }
        else if(a>70){
            System.out.println("Grade: C");
        }
        else if(a>60){
            System.out.println("Grade: D");
        }
        else if(a>40){
            System.out.println("Grade: E");
        }
        else{
            System.out.println("Grade: F");
        }
        
       
       
    }
}
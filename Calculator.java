import java.util.Scanner;
public class Calculator {

    float e1;
    float e2;
    Calculator(float e1,float e2){
        
        this.e1 = e1;
        this.e2 = e2;
    }
    float add(){
        return e1+e2;
    }
    float sub(){
        return e1-e2;
    }
    float mul(){
        return e1*e2;
    }
    float div(){
        return e1/e2;
    }
    float mod(){
        return e1 % e2;
    }
    void display(){
        System.out.println("ADDITION: "+add());
       
    }
    void subs(){
        System.out.println("SUBTRACTION: "+sub());
    }
    void mult(){
        System.out.println("MULTIPLICATION: "+mul());
    }
    void divi(){
        System.out.println("DIVISION: "+div());
    }
    void modu(){
        System.out.println("MODULUS: "+mod());
    }
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
        float b=s.nextFloat();
         System.out.println("ENTER FIRST NUMBER:" + a);
        System.out.println("ENTER SECOND NUMBER:" + b);

        Calculator obj=new Calculator(a,b);
        
        obj.modu();
        
    }
}
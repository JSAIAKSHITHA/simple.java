import java.util.Arrays;
public class Task5 {
    public static void main(String[] args) {
       int[] a={10,60,30,90,70};
       int s=0;
       int j=a.length;
         Arrays.sort(a);
         System.out.println(Arrays.toString(a));
            for(int i=0;i<a.length;i++){
               s+=a[i];
           } 
         int k=s/j;
         System.out.println("The sum of arrays" + s);
         System.out.println("The average is " + k); 
         System.out.println("The maximum element is " + a[a.length-1]);  
         System.out.println("The minimum element is " + a[0]);
         int [][] m={{4,5,7},{8,9,0},{7,3,2}};
         System.out.println("The matrix is ");
         for(int n=0;n<m.length;n++){
               for(int l=0;l<m[n].length;l++){
                  System.out.print(m[n][l] + " ");
               }
               System.out.println(" ");
         }            
    }
    
}

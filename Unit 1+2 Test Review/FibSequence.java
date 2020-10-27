import java.util.Scanner;



class FibSequence{
    static int total = 0;
    static int a;
    static int b;
    
    public static void Main (String[] args){
    Scanner s = new Scanner(System.in);
    
    for(int i = 1; i < 4000000; i = a + b){
        if(i % 2 == 0){
           total += i; 
        }
      a = b;
      b = i;
        
    }
   System.out.println(total);
 }
}
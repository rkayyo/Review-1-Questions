


class PTriplets{
  
    
 public static void Main (String [] args){
     
     for(int a = 1; a <= 1000; a++){
         for(int b = 1; b <= 1000; b++){
            double c = Math.sqrt((a*a + b*b));
             if(a+b+c == 1000){
                 System.out.println("A * B * C  = " + a*b*c);
                }
                 
                 
            }
         
        }
     
     
     
    }
    
    
}
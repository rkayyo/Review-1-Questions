
class SqaureSums{
    static long squareTotal = 0;
    static long sumSquared = 0;
    
    public static void Main (String[] args){
        
        for(int i = 1; i <= 100; i++){
          squareTotal = i;
          sumSquared += Math.pow(i,2);
            
        }
        
      
        System.out.println(squareTotal * squareTotal - sumSquared);
        
        
    }
    
    
}
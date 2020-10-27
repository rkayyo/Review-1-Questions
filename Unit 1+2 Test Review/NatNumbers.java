
class NatNumbers{
    public static int total;
    public static void Main (String[] args){
        for(int i = 0; i < 1000; i++){
            if(i % 3 == 0 || i % 5 == 0){
                total = total += i;
            }
        }
        System.out.println(total);
    }
    
    
    
    
}
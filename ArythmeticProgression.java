
/**
 *
 * @author Andrij
 */
public class ArythmeticProgression {
    
    public static void main(String[] args) {
        long n = 1000000000;
        long startTime = System.currentTimeMillis();
        System.out.println("sum for " + n + " = " + sum(n));
//        calcMax();
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        System.out.println("time of running = " + runTime + " ms");
        
        
    }
    
    public static long sum(long n) {
        
        if(n < 0) return -1;
        
        return n*(n+1)/2;
        
    }
//    private static void calcMax() {
//        for (int i = 65000; i < 66000; i++){
//            if(sum(i) < 0) {
//                System.out.println(i);
//                return;
//            }
//                
//        }
//    }
}

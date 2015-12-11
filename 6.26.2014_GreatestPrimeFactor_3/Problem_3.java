/*  Solution to Problem 3 of ProjectEuler.com
    
    Finds the greatest prime factor of 600,851,475,143
*/



class Problem_3{
    public static final long BIG_NUMBER = 600851475143L;
    
    public static void main(String [] args){
       System.out.println(get_greatest_prime_factor(BIG_NUMBER));
    }
    
    public static boolean is_divisible(long testNum){
        boolean status = false;
        if(BIG_NUMBER % testNum == 0) status = true;
        return status;
    }
    
    public static boolean is_prime(long testNum){
        if( testNum % 2 == 0 && testNum != 2){
            return false;
        }
        else if(testNum == 2){
            return true;
        }
        else{
            boolean result = true;
            for(long i = 3; i < Math.sqrt(testNum); i+=2){
                if(testNum % i == 0){
                    result = false;
                    break;
                }
            }
            return result;
        }
    }
    
    public static long get_greatest_prime_factor(long testNum){
        int max = 0;

        while(testNum != 1){
            int i = 2;
            while(i <= testNum) {
                if(is_prime(i) && testNum % i ==0){
                    if( i > max) max = i;
                    testNum /= i;
                    break;
                }
                ++i;
            }
        }
        return max;
    }
}
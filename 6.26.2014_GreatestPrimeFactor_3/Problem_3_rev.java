class Problem_3_rev{
	public final static long MAX_NUMBER =  600851475143L;
	public static void main(String [] args){

		System.out.println(greatest_prime_factor(MAX_NUMBER));
        


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
            for(long i = 3; i < (Math.sqrt(testNum)+2); i+=2){
                if(testNum % i == 0){
                    result = false;
                    break;
                }
            }
            return result;
        }
    }

    public static boolean is_divisible(long divisor, long dividend){
        boolean status = false;
        if(dividend % divisor == 0) status = true;
        return status;
    }

    public static long greatest_prime_factor(long num_to_factor){
        long max = 1;
        
        while(num_to_factor != 1){
            int num = 2;
            while(num <= num_to_factor){
                if(is_prime(num) && is_divisible(num,num_to_factor)){
                    if(num > max) max = num;
                    num_to_factor /= num;
                    break;
                }
                num++;
            }
        }
        return max;
    }
}
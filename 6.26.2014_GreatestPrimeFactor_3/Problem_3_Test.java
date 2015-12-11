class Problem_3_Test{

    public static void main(String [] args){

        int testNum_1 = 10;
        int testNum_2 = 2;
        int testNum_3 = 32;
        int testNum_4 = 3;
        int testNum_5 = 11;

        display_num(testNum_1);
        display_num(testNum_2);
        display_num(testNum_3);
        display_num(testNum_4);
        display_num(testNum_5);
        

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
            for(long i = 3; i < testNum; i+=2){
                if(testNum % i == 0){
                    result = false;
                    break;
                }
            }
            return result;
        }
    }

    public static void display_num(int current_num){
        System.out.println(current_num + "" + is_prime(current_num));
    }

}
/*	This program will determine the smallest number that is evenly
	divisible by the numbers 1 - 20 =. */

class SmallestMultiple{

	public static void main(String [] args){
		boolean found = false;
		int startNum = 20;
		int greatest = 0;
		while( !found){
			boolean status = true;
			for(int i = 11; i <=20 ; i++){
				if(startNum % i !=0){
				 status = false;
				 break;
				}
			}
			if(status == false){
				startNum ++;
			}
			else{
				greatest = startNum;
				found = true;
			}
		}

		System.out.println(greatest);
	}
}
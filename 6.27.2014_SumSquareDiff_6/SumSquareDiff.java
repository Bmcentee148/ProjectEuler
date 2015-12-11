/*	This will find the difference between the sum of the squares and the 
	square of the sum, of the fist 100 integers i.e. 1-100. */

class SumSquareDiff{

	public static void main(String [] args){
		int sumOfSquares = 0;
		int squareOfSum = 0;
		for(int i = 1; i <=100 ; i++){
			sumOfSquares += Math.pow(i,2);
			squareOfSum += i;
		}
		 squareOfSum *= squareOfSum;
		 int result = squareOfSum - sumOfSquares;
		System.out.println(result);
	}
}
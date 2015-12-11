/* This class is designed to find the greatest palindrome product of 
	3 digit numbers. I.e the highest possible number to test is 
	999 * 999. */

class PalindromeProduct{
	public static final int START = 100;
	public static final int MAX = 999;
	public static void main(String [] args){
		/*System.out.println(isPalindrome(2120212));
		System.out.println(isPalindrome(5));
		System.out.println(isPalindrome(300020));*/
		System.out.println(CalcGreatestPalindrome());


	}

	public static boolean isPalindrome(int num){
		String numForward = String.valueOf(num);
		StringBuilder temp= new StringBuilder(numForward);
		String numBackward = temp.reverse().toString();

		return numForward.equals(numBackward);
	}

	public static int CalcGreatestPalindrome(){
		int greatest = 0;
		int product = 0;
		for(int i = START; i <= MAX; i ++){
			for(int j = i; j <= MAX; j++){
				product = i * j;
				if(isPalindrome(product) && product > greatest) greatest = product;
			}
		}
		return greatest;
	}
}
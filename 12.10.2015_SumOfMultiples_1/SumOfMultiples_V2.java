/* #############################################################################
	Class SumOfMultiples_V2 -- SumOfMultiples but simpler implementation. Potent
		ially longer running time.

	@author Brian McEntee
	@version 1.0
############################################################################# */
public class SumOfMultiples_V2 {

	public static void main(String[] args) {

		long start = System.nanoTime();
		long sum = 0;
		for(long i = 999; i > 1; i--) {
			if( (i % 3 == 0) || (i % 5 == 0) ) sum+= i;  
		}
		System.out.println(sum);

		long end = System.nanoTime();
		System.out.println(end - start);
	}
}
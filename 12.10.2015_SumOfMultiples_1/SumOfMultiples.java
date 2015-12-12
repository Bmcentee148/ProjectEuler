/* #############################################################################
	Class SumOfMultiples -- Will find the sum of multiples of 3 and 5 that are
		less than 1000

	Project Euler Question #1	
	@author Brian McEntee
	@version 1.0
############################################################################# */

public class SumOfMultiples {

	public static void main(String[] args) {
		long start = System.nanoTime();

		int lim = 1000;
		boolean lim_met = false;
		boolean t_lim = false;
		boolean f_lim = false;
		int curr_mult = 1;
		int sum = 0;
		while( !lim_met ) {
			if( 3 * curr_mult < lim) sum+= (3 * curr_mult);
			else t_lim = true;
			if( (5 * curr_mult >= lim) ) f_lim = true;
			else if(curr_mult % 3 != 0) sum+= (5 * curr_mult);
			if(t_lim && f_lim) lim_met = true;
			curr_mult ++;
		}

		System.out.println(sum);
		long end = System.nanoTime();
		System.out.println(end - start);
	}
}
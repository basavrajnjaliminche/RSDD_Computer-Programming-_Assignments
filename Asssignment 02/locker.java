/*
	 * @author Basavraj Jaliminche (8800149)
	 * PROG8580 - Computer Programming - Section 1
	 * Assignment 2
	 */
package Assignment;

public class locker {
	public static void main(String[] args) {

		/* creating array of 100 boolean elements */
		boolean[] lockers = new boolean[100];

		/* Initially all lockers are closed */
		for (int i = 0; i < 100; i++) {
			lockers[i] = false;
		}

		/* Initially, S1 opens all lockers */
		for (int i = 0; i < 100; i++) {
			lockers[i] = true;
		}
		/* Creating variables for student and locker */
		int j;
		int l;

		/* students change the locker state */
		for (j = 2; j <= 100; j++) {
			/* for every locker, notice we start from L1 */
			for (l = j - 1; l < 100; l = l + j) {
				/*
				 * Condition for change the state of lockers (open if closed, close if opened)
				 */
				if (lockers[l]) {
					lockers[l] = false;
				}

				else {
					lockers[l] = true;
				}
			}
		}

		/* printing results of all lockers which are open */
		for (int i = 0; i < 100; i++) {

			if (lockers[i] == true) {

				System.out.printf("Locker %d is open\n", i + 1);
			}
		}
	}
}

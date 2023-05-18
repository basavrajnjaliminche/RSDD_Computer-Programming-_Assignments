/* Basavraj Jaliminche
 * id- 880
 * Assignment 4
 * PROG8580-Computer Programming
 */

package Assignment4;

//here time class implements comparable and clonable
public class time implements Comparable<time>, Cloneable {
	private long t;

	public time() {
		t = System.currentTimeMillis();
	}

	// constructor spacified with hour,minute,seconds
	public time(long hr, long min, long sec) {
		t = ((((hr * 60) + min) * 60) + sec) * 1000;

	}

	public int getHour() {
		// hours in the between 0 to 23.
		return (int) (t / (1000 * 60 * 60)) % 24;
	}

	public int getMinute() {
		// minutes between 0 to 59
		return (int) (t / (1000 * 60)) % 60;
	}

	public int getSecond() {
		// seconds between 0 to 59.
		return (int) (t / 1000) % 60;
	}

	public int getSeconds() {
		// returns the elapsed time seconds.
		return (int) (t / 1000);
	}

	public time(long time) {
		t = time * 1000;
	}

	@Override
	public String toString() {
		return String.format("%d hours %d minutes %d seconds", getHour(), getMinute(), getSecond());
	}

	@Override
	public int compareTo(time timeCompare) {
		return (int) (this.getSeconds() - timeCompare.getSeconds());
	}

	// time clone throws exception
	public time Clone() throws CloneNotSupportedException {
		return (time) super.clone();
	}

}

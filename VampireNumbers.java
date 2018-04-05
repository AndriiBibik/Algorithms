import java.io.PrintStream;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

class VampireNumbers {
	static PrintStream p = System.out;

	private static Set<Integer> findVampireNumber() {
		Set<Integer> vampireSet = new HashSet<Integer>();
		for (int y = 1000; y <= 9999; y++) {
			char[] numbersSeparately = ("" + y).toCharArray();
			int numberOfDigits = numbersSeparately.length;
			for (int i = 0; i < numberOfDigits; i++) {
				for (int j = 0; j < numberOfDigits; j++) {
					if (i != j) {
						int value1 = Integer.valueOf("" + numbersSeparately[i] + numbersSeparately[j]);
						int ki = -1;
						for (int k = 0; k < numberOfDigits; k++) {
							if (k != i && k != j) {
								ki = k;
							}
						}
						int kj = -1;
						for (int t = 0; t < numberOfDigits; t++) {
							if (t != i && t != j && t != ki) {
								kj = t;
							}
						}

						int value21 = Integer.valueOf("" + numbersSeparately[ki] + numbersSeparately[kj]);
						int value22 = Integer.valueOf("" + numbersSeparately[kj] + numbersSeparately[ki]);
						if (value1 * value21 == y && !(numbersSeparately[j] == 0 && numbersSeparately[kj] == 0)
								|| value1 * value22 == y
										&& !(numbersSeparately[j] == 0 && numbersSeparately[ki] == 0)) {
							vampireSet.add(y);
						}
					}
				}
			}
		}
		return vampireSet;
	}

	public static void main(String[] args) {
		Set<Integer> vampireSet = findVampireNumber();
		Iterator<Integer> i = vampireSet.iterator();
		int number = 1;
		while (i.hasNext()) {
			p.println(number + ": " + i.next());
			number++;
		}
	}
}
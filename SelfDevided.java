
import java.util.ArrayList;
import java.util.List;

class SelfDevided {

	public int selfDivide(int number) {
		int temp = number;
		int firstpart;
		int lastpart;
		while (temp > 0) {
			lastpart = temp % 10;
			firstpart = temp / 10;
			if (number % lastpart == 0) {
				temp = firstpart;
				lastpart = 0;
			} else
				return 0;
		}
		System.out.println(number);
		return number;
		
	}

	public List<Integer> selfDividingNumbers(int left, int right) {
		int len = right - left;
		int update = 0;
		List<Integer> zeroreminders = new ArrayList<>(len);
		for (int i = left; i < right; i++) {
			update = selfDivide(i);
		}
		if (update != 0) {
			zeroreminders.add(update);
		}
		System.out.println(zeroreminders);
		return zeroreminders;
	}

	public static void main(String args[]) {
		SelfDevided sd = new SelfDevided();
		List<Integer> aa = new ArrayList<>(20);
		int a = 2;
		int b = 22;
		aa = sd.selfDividingNumbers(a, b);
		System.out.println(aa);
	}
}


public class Test1 {
	public String goatLatinWord(String s, int ab) {
		StringBuffer str = new StringBuffer();
		char temp;
		String S = s;
		int n = ab;
		if (S.charAt(0) == 'a' || S.charAt(0) == 'e' || S.charAt(0) == 'i' || S.charAt(0) == 'o'
				|| S.charAt(0) == 'u') {
			str.append(s);
			str.append("ma");
			for (int i = 0; i < n; i++) {
				str.append("a");
			}
		} else {
			temp = S.charAt(0);
			str.append(S);
			str.deleteCharAt(0);
			str.append(temp);
			for (int i = 0; i < n; i++) {
				str.append("a");
			}

		}
		return str.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 n = new Test1();
		String s = "Hello i am neha";
		StringBuffer str = new StringBuffer();
		String temp;
		String[] arr = s.split(" ");
		int count = 1;
		for (String wo : arr) {
			temp = n.goatLatinWord(wo, count);
			count++;
			str.append(temp);
			str.append(" ");
		}

		System.out.println(str.toString());

	}

}

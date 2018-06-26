
public class Test1 {
	public String goatLatinWord(String s, int ab) {
		StringBuffer str = new StringBuffer();
		char temp;
		
		String S = s.toLowerCase();
		System.out.println(S);
		int n = ab;
		if (S.charAt(0) == 'a' || S.charAt(0) == 'e' || S.charAt(0) == 'i' || S.charAt(0) == 'o'
				|| S.charAt(0) == 'u') {
			str.append(S);
			str.append("ma");
			for (int i = 0; i < n; i++) {
				str.append("a");
			}
		} else {
			//temp = S.charAt(0);
			str.append(S.substring(1,S.length()));
			//str.deleteCharAt(0);
			str.append(S.charAt(0));
			for (int i = 0; i < n; i++) {
				str.append("a");
			}

		}
		return str.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 n = new Test1();
		String s = "";
		if(s == "") {
			System.out.println("empty string");
			System.exit(0);
		   }
		StringBuffer str = new StringBuffer();
		String temp;
		String[] arr = s.split(" ");
		int count = 0;
		for (String wo : arr) {
			temp = n.goatLatinWord(wo, count);
			count++;
			str.append(temp+" ");
			
		}

		System.out.println(str.toString());

	}

}

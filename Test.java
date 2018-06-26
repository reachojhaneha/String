
public class Test {

	public String reverseVowels(String s) {
		String r= s.toLowerCase();
		char[] arr=r.toCharArray();
		char a; char b;char temp;
		for(int i = 0; i<s.length(); i++) {
			for(int j = s.length()-1; j>0;j--) {
				if (arr[i] == 'a'|| arr[i] == 'e'|| arr[i] == 'i'|| arr[i] == 'o'|| arr[i] == 'u'){
					 a = arr[i];
					 i++;
				}
				if(arr[j] == 'a'|| arr[j] == 'e'|| arr[j] == 'i'|| arr[j] == 'o'|| arr[j] == 'u') {
					b = arr[j];
					
					temp = a;
					arr[j] = arr[i-1];
					arr[j]= temp;
					//arr[i-1] = a;
					//arr[j+1] = b;
					j--;
				}else {
					i++;
					j--;
				}
			}
		}
		System.out.println(arr);
		return arr.toString();
	}
public static void main(String[] args) {
	Test st = new Test();
	st.reverseVowels("Hello");
}
}

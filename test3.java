
public class test3 {

	public int compress(char[] chars) {
		if (chars == null) return 0;
        int len = chars.length;
        char[] ch = new char[len];
        int count = 0;
        int j = 0;
        ch[0]=chars[0];
        for (int i = 0; i<len; i++) {
        	if(ch[j]==chars[i]) {
        		count++;
        		continue;
        		//System.out.println(ch);
        	}j=j+1;
        	if(count != 0) {
            	ch[j] = (char) count;
            }
    		System.out.println(ch);
    		count = 0;
        	if(ch[j] != chars[i]) {
        		ch[j] = chars[i];
        		j++;
        		
        	}
        }
        if(count != 0) {
        	ch[j] = (char) count;
        }
        System.out.println(ch);
        return ch.length;
        
    }
	
	public static void main(String[] args) {
		int temp;
		test3 t = new test3();
		String s= "aaaaaabbbb";
		char[] ch = s.toCharArray();
		temp = t.compress(ch);
		System.out.println(temp);
		
		
	}
}

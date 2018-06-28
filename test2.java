
public class test2 {
	
	public char[] reverse(String st) {
		char temp;
		char[] ch = st.toCharArray();
		//System.out.println(ch);
		int l = st.length()-1;
		for(int i=0;i<st.length();i++) {
			temp = ch[i];
			ch[i]=ch[l];
			ch[l]=temp;
			l--;
			i++;
			//System.out.println(ch);
			if(i==(st.length()/2)) {
			break;	
			}
		}
		//System.out.println(ch.toString());
		return ch;
		
	}
	public static void main(String[] args) {
        String s = "abcdefghi";
        int k = 2;
        int l = k;
        test2 t = new test2();
        String temp;
        StringBuffer str = new StringBuffer();
        for(int i=0;i<s.length();) {
        	if(i>=s.length()) {break;}
        	if(l>=s.length()) {
        		l=l-1;
        	}
            str.append(t.reverse(s.substring(i,l)));            
            i = l;    //2
            l = l + k;  //4 
            if(i>=s.length()) {break;}
        	if(l>=s.length()) {
        		l=l-1;
        	}
         str.append(s.substring(i,l));
         System.out.println();

            i = l; //4
            l += k; //6
           
        }
                
    System.out.println(str.toString());    
    }

	

}

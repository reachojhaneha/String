
public class Neha {
	
		public static void main(String[] args) {
			String[] words = {"neha","is","a","good","person"};
			String s = "nehaojhanehaojhanehaojhaakshatkumaralokmishra";
			String a = "neha";
			String b = "ojha";
			
			/*System.out.println(a + b);
			System.out.println(a.concat(b));
			System.out.println(a.replace('a','b'));
			System.out.println(a.toLowerCase());
			System.out.println(a.toUpperCase());
			System.out.println(a.charAt(0));*/
			
			StringBuilder res = new StringBuilder();
			for (String wo: words) {
				res.append(new StringBuffer(wo).reverse());
				/*System.out.println("======================");
				System.out.println(res);*/
			//	System.out.println("========================");
			}
			
			
			//startsWith
			for(String w:  words) {
				if(w.startsWith("am")) {
					System.out.println(w +" stats with am");
				}
			}
			
			//endsWith
			for(String w:  words) {
				if(w.endsWith("ma")) {
					//System.out.println(w +" ends with ma");
				}
			}
			
			//System.out.println(s.indexOf('o',10));
		}
}


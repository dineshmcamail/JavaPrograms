package com.example.excercise1;

public class SwapTwo {
	
	public boolean buddyStrings(String A, String B) {
		
		StringBuffer sb= new StringBuffer();
		Boolean result=false;
		int count=0;
		for(int i=A.length()-1;i>=0;i--) {
			if (count <= 2) {
				sb.append(A.charAt(i));
				count++;
			}
			/*System.out.println(sb.toString()+"  "
			+A.substring(0,i)+sb.toString() + "  "
					+A.substring(0,i).length() + " B ="+B + " I = "+(A.length()-3)+" i="+i);
			
			System.out.println((A.substring(0,i)
					+sb.toString()).equals(B) && 
					A.substring(0,i).length() > 2 && i<A.length()-3);
			
			System.out.println("sb="+sb.toString()+" b="+B);*/
			
			System.out.println(A.substring(0, A.length()/2));
			System.out.println(A.substring(A.length()/2, A.length()) );
			
			if(sb.toString().equals(B) || (A.substring(0,i)+sb.toString()).equals(B) 
					&& A.substring(0,i).length() > 2 && i<A.length()-3) {
				System.out.println(1);
				result = true;
			}else if((A.substring(0,i)+sb.toString()).equals(B) && A.substring(0,i).length() > 2 && !A.equals(B)){
				System.out.println(2);
				result = true;
			}else if(A.substring(0, A.length()/2).equals(A.substring(A.length()/2, A.length()))) {
				System.out.println(3);
				result = true;
			}else if((A.substring(0, 1).equals(B.substring(B.length()-1,B.length())) &&
					A.substring(A.length()-1, A.length()).equals(B.substring(0,1))  &&
                     A.length()>2)) {
				
				result = true;
			} if (count == 2){
				sb.delete(0, sb.length());
				count = 0;
			}
		}
		
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTwo obj = new SwapTwo();
		/*"aaaaaaabc"
		"aaaaaaacb"*/
		System.out.println(obj.buddyStrings("abcd", "badc"));

	}

}

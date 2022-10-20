package lab3;

import java.util.StringTokenizer;

public class exercise1 {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("1 2 3 4 5 6 7 8 9 10"," "); 
		int sum=0, i=0;
        String[] str = new String[st.countTokens()];
        System.out.println("displaying integers");
	     while (st.hasMoreTokens()) {   
	         str[i] = st.nextToken();
	         System.out.println(str[i]);
	         sum += Integer.parseInt(str[i]);
	         i++;
	     }
	     System.out.println();
	     System.out.print("sum is ");
	     System.out.println(sum);

	}

}

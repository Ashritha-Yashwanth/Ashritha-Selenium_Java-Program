package basicknowledge;

import java.util.Arrays;

public class CountOfSpecialChar
{
		static int CountOfNumeric;
		static int CountOfSpace;
		static int CountOfSpecialChar=0;
		static int CountOfAplha=0;
		public static void main(String[] args) {
			String name="Sushravya Yashwanth 1234%$^";
			
			char[] C1=name.toCharArray();
			System.out.println(Arrays.toString(C1));
			
			for(int i=0;i<C1.length;i++) {
				boolean answer=Character.isAlphabetic(C1[i]);
				if(answer==true) {
					CountOfAplha++;
				}
				boolean answer1=Character.isDigit(C1[i]);
				if(answer1==true) {
					
					CountOfNumeric++;
					
				}
				boolean answer2=Character.isSpaceChar(C1[i]);
				if(answer2==true) {
					CountOfSpace++;
					
				}
			}
			System.out.println(CountOfAplha);
			System.out.println(CountOfNumeric);
			System.out.println(CountOfSpace);
			//System.out.println("The Total no of SpecialChar:"+(CountOfNumeric+CountOfAplha+CountOfSpace);
	       System.out.println(CountOfAplha+CountOfNumeric+CountOfSpace);
	       int TotalCount=CountOfAplha+CountOfNumeric+CountOfSpace;
	       System.out.println(name.length());
	        System.out.println(name.length()-TotalCount);

	}

}

package string.in.com;

public class CountOccurrenceOfACharacterInString {
	public static void main(String[] args) {
		String s = "sonal soni";int t=0;
		
		for(char chr = 'a'; chr<='z';chr++) {
			 
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==chr) {
					t++;
				}
			}System.out.println(chr+"="+t);t=0;

		}
		}

}
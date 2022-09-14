package string.in.com;

public class StringAppend {
	
	
	public static void main(String[] args) {
		StringBuffer S = new StringBuffer("one two three");
        S.append(" four five six");
        S.append(" seven eight nine");
        S.append(" ten");
        System.out.println(S);
	}

}

import java.util.*;
import java.util.regex.*;
public class Task4 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String s=scan.next();
	char ch[]=s.toCharArray();
	int n;
	for(int i=0;i<ch.length;i++) {
	if(Pattern.matches("[1-9]",Character.toString(ch[i]))) {
		n=Character.getNumericValue(ch[i]);
		for(int j=0;j<n;j++) {
			System.out.print(ch[i-1]);
		}
	}
	}
	scan.close();
	}

}

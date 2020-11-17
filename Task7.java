import java.util.*;
import java.util.regex.*;
public class Task7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		String s=scan.next();
		   if(Pattern.matches("^(?=.{10,}$)(?=.*?[a-z])(?=.*?[A-Z])"
		   		+ "(?=.*?[0-9])(?=.*?\\W).*$",s)){
		       System.out.println("Strong");
		   }else if(Pattern.matches("^(?=.{10,}$)(?=.*?[a-z])"
		   		+ "(?=.*?[A-Z]).*$",s)){
		       System.out.println("Medium");
		   }else if(Pattern.matches("^(?=.{10,}$)(?=.*?[a-z])(?=.*?[A-Z])"
		   		+ "(?=.*?[0-9]).*$",s)) {
			   System.out.println("Good");
		   }else if(Pattern.matches("^(?=.{2,9}$)(?=.*?[a-z])(?=.*?[A-Z])"
		   		+ "(?=.*?[0-9])(?=.*?\\W).*$",s)) {
			   System.out.println("Weak");
		   }
scan.close();
	}

}

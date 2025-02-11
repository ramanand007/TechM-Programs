package samplejavaproject2;
import java.util.*;
public class Exx11 {
	
	
	public static void main(String args[]) {
		int vowcnt=0;
		int constcnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				vowcnt++;
				
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				constcnt++;
			}
			
		}
		System.out.println("Vowel cont: "+vowcnt);
		System.out.println("Vowel cont: "+constcnt);
	}
}

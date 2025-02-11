package samplejavaproject2;
import java.util.*;
class Exx10 {
    public static void main(String args[])
    {
         int vCount = 0, cCount = 0;    
         Scanner scan=new Scanner(System.in);
            //Declare a string    
         System.out.println("Enter string:\n");
         
            String str = scan.next();   
                
            //Converting entire string to lower case to reduce the comparisons    
            str = str.toLowerCase();    
                
            for(int i = 0; i < str.length(); i++) {    
    
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    
                    //Increments the vowel counter    
                    vCount++;    
                }    
                //Checks whether a character is a consonant    
                else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {      
                    //Increments the consonant counter    
                    cCount++;    
                }    
            }    
            System.out.println("Number of vowels: " + vCount);    
            System.out.println("Number of consonants: " + cCount);    
    }
}
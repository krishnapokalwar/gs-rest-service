package hello;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

  String str="abcd";
  boolean palResult;
  String str1="bcda";
  palResult=checkPalindron(str);
  if(palResult){
  System.out.println(str+"is"+"palindrome");       
  }else{
    System.out.println(str+"is not palindrome");             
  }
 

public static void isAnagram(String input1, String input2){
        //Remove all whitespace first
        String  s1= input1.replaceAll("\\s", "");
 
        String s2 = input2.replaceAll("\\s", "");
        
        boolean status = true;
 
        if(s1.length() != s2.length())
        {
            status = false;
        }else {
            //Convert into character array
 
            char[] s1Array = s1.toLowerCase().toCharArray();
 
            char[] s2Array = s2.toLowerCase().toCharArray();
 
            //Sorting both character array
 
            Arrays.sort(s1Array);
 
            Arrays.sort(s2Array);
 
            //Check if both arrays are equal
 
            status = Arrays.equals(s1Array, s2Array);
        }
        if(status){
            System.out.println(s1+" and "+s2+" are anagrams");
        } else {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }
	
	
}
 public boolean checkPalindron(String str){
      int length = original.length();
     
      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + original.charAt(i);
         
      if (original.equals(reverse))
         System.out.println("The string is a palindrome.");
      else
         System.out.println("The string isn't a palindrome.");
 }
     
}
    
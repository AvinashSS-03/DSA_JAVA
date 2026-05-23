package Recursion;
public class Check_if_String_is_Palindrome_or_Not {
    public static void main(String[] args) {
          Check_if_String_is_Palindrome_or_Not obj=new Check_if_String_is_Palindrome_or_Not();
          String name="madam";
          int start=0;
          int end=name.length()-1;
          System.out.print(obj.palindrome(name,start,end));

    }
    public boolean palindrome(String n,int start,int end){
        if(start>=end){
            return true;
        }
        if(n.charAt(start)!=n.charAt(end)){
            return false;
        }return palindrome(n,start+1,end-1);
    }
}

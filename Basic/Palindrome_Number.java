public class Palindrome_Number {
    public static void main(String args[]){
        int num=121;
        Palindrome_Number obj=new Palindrome_Number();
        obj.reverse(num);
    }
    public void reverse(int num){
         int r=0;
         int c=num;
        while(num!=0) { 
            r = r * 10 + (num % 10);
            num = num / 10;
        }
         if(r==c){
             System.out.print("Palindrome");
         }
         else{
             System.out.print("Not a palindrome");
         }

    }
}

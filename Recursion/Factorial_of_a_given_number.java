package Recursion;
public class Factorial_of_a_given_number {
    public static void main(String[] args) {
        Factorial_of_a_given_number obj=new Factorial_of_a_given_number();
        System.out.print( obj.factorial(5));
    }
    public int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}

public class Fibonacci_Number {
    public static void main(String[] args) {
       Fibonacci_Number obj=new Fibonacci_Number();
       System.out.print(obj.fibanocci(5));
    }
    public int fibanocci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibanocci(n-1)+fibanocci(n-2);
    }
}

public class Check_for_Prime_Number {
    public static void main(String[] args) {
        int n=11;
        boolean isprime=true;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime){
            System.out.print("The number is prime");
        }
        else{
            System.out.print("Not a prime number");
        }
    }
}

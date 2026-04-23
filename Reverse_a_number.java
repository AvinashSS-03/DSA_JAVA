import java.util.*;
public class Reverse_a_number {
public static void main(String args[]){
    int n=1234;
    int r=0;
    while(n!=0){
        r=r*10+(n%10);
        n/=10;

    }
    System.out.print(r);
}
}

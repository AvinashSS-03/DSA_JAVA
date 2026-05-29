
package Basic;
public class GCD_of_Two_Numbers {
    public static void main(String args[]){
        int a=48;
        int b=18; 
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.print("The Gcd is "+ a);
        //eucilidean algortithmal
    }
}

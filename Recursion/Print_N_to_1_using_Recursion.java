package Recursion;
public class Print_N_to_1_using_Recursion {
    public static void main(String[] args) {
        Print_N_to_1_using_Recursion obj=new Print_N_to_1_using_Recursion();
        obj.num(5);
    }
    public void num(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        num(n-1);
    }
}

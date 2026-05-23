package Recursion;
public class Print_1_to_N_using_Recursion {
    public static void main(String args[]){
               Print_1_to_N_using_Recursion obj=new Print_1_to_N_using_Recursion();
               obj.num(5);
    }
    public void  num(int n){

        if(n==0){
            return ;
        }
        num(n-1);
        System.out.print(n + " ");
    }
}

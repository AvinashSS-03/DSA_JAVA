public class Sum_of_First_N_Numbers {
    public static void main(String[] args) {
        Sum_of_First_N_Numbers obj=new Sum_of_First_N_Numbers();
        System.out.print(obj.sum(5));

    }
    public int  sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}

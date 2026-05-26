package array;

public class Stock_sell_and_buy_1 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int profit=0;
        for(int num:prices){
            if(num<min){
                min=num;
            }
            else{
                profit=num-min;
                if(profit>max){
                    max=profit;
                }
            }
        }
        if(max==Integer.MIN_VALUE){
            System.out.print("0");
        }else{
            System.out.print(max);
        }
    }
}

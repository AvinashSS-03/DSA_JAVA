package Basic;
public class Check_if_the_Number_is_Armstrong {
    public static void main(String args[]){
        int num=153;
        int dup=num;
        String s=String.valueOf(num);
        int r=s.length(); 
        int y=0;
        while(num!=0){
            int e=num%10;
            y+=Math.pow(e,r);
            num/=10;

        }
        if(y==dup) {
            System.out.print("Armstrong");
        }
        else{
            System.out.print("Not an Armstrong");
        }
    }
}

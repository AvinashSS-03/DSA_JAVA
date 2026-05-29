package array.Easy;
/* problem statement:the problem is to find the missing number It consits of distinct values and the values are upto 0 and n without order
Solution:we can use factorial formula
 */
public class find_missing_number {
    public static void main(String[] args) {
        int[] arr={1,2,0,4,5};//12
        int actualsum=0;
        int exp=arr.length*(arr.length+1)/2; //15
        for(int i=0;i<arr.length;i++){
            actualsum+=arr[i];
        }
        int ans=exp-actualsum;
        System.out.print("The Missing number is "+ans);
    }
}

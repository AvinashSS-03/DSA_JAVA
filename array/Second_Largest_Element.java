package array;
/* problem statement:we have to find the second largest elements in the array.So edge cases are if all the elements are smae in the array we have  to return -1 because we are not having any second element
then if the second element is same as the first element you have to return the next largest element.
Solution:First we can find the largest and second largest next  we can see largest != seond largest condition then we can return Second largest element
 */
public class Second_Largest_Element {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4};
        int largest=Integer.MIN_VALUE;
        int Slargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                Slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>Slargest && arr[i]!=largest){
                Slargest=arr[i];
            }
        }
        System.out.print(Slargest);
    }
}

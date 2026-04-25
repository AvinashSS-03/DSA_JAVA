package src.Sorting;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr1={5,4,3,2};
        int[] arr2={6,7,8,1};

        int[] arr=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr[k++]=arr[i];
                i++;
            }
            else{
                arr[k++]=arr[j];
                j++;
            }
        }
        while(i<arr1.length && i<k)
    }
}

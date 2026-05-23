package Sorting;

import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
       int arr[]={6,7,2,99,32,1};

       int left=0;
       int right=arr.length-1;
       if(left<right) {
           int mid = (left + right) / 2;
           merge(arr,mid,left,right);
       }


    }
    static void merge(int[] arr,int mid,int left,int right){
        int n1=mid-left+1;
        int n2=mid-right;
        int L[]=new int[n1];
        int R[]=new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[mid+1+j];
        }

    }
}

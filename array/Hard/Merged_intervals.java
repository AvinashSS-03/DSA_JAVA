package array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
   /*
    Problem statement:given an array we need to return the array in merged intervals which are sorted
    Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    Output: [[1,6],[8,10],[15,18]]
    Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
    Solution:
    Brute force:
           -->First sort the array
           -->then check the starting element is less than the next starting interval
           -->then check the ending element is greater than next interval
           -->then add to the list
     */

public class Merged_intervals {


        public static void main(String[] args) {
            int[][] intervals= {{1,3},{2,6},{8,10},{15,18}};
            List<List<Integer>> arr=new ArrayList<>();
            Arrays.sort(intervals,(a, b)->a[0]-b[0]);
            int i=0;
            int n=intervals.length;
            while (i<n){
                int start=intervals[i][0];
                int end=intervals[i][1];
                int j=i+1;
                while(j<n && intervals[j][0]<=end){
                    end=Math.max(end,intervals[j][1]);
                    j++;
                }
                arr.add(Arrays.asList(start,end));
                i=j;
            }
            System.out.print(arr);
            array.Hard.Merged_intervals obj=new array.Hard.Merged_intervals();
            obj.optimal(intervals);
        }
        void optimal(int[][] intervals) {
            List<List<Integer>> arr = new ArrayList<>();
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

            for (int[] inte : intervals) {
                if (arr.isEmpty() || arr.get(arr.size() - 1).get(1) < inte[0]) {
                    arr.add(Arrays.asList(inte[0], inte[1]));
                } else {
                    int last = arr.size() - 1;
                    int max = Math.max(arr.get(last).get(1), inte[1]);
                    arr.get(last).set(1,max);
                }

            }
            System.out.print(arr);
        }
    }


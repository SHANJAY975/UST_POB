package com.ust.Milestone_1;

public class Largest_then_shortest_order {
    int n;
    int []arr;
    public Largest_then_shortest_order(int n, int []arr) {
        this.arr = arr;
        this.n = n;
    }
    public int[] answer(){
        int min=arr[0],max=arr[0], min_index=0, max_index=0;
        for(int i=0;i<n-1;i+=2)
        {
            System.out.println(i);
            min = arr[i];
            max = arr[i];
            min_index = i;
            max_index = i;
         for(int j=i;j<n;j++){
             if(min>arr[j]){
                 min_index=j;
                 min = arr[j];
             }
             if(max<arr[j]){
                 max=arr[j];
                 max_index = j;
             }
         }
         int temp = arr[i];
         arr[i] = arr[max_index];
         arr[max_index] = temp;
         if(i == min_index) {
             min_index = max_index;
         }
         temp = arr[i+1];
         arr[i+1] = arr[min_index];
         arr[min_index] = temp;
        }
        System.out.println();
        return arr;
    }

}

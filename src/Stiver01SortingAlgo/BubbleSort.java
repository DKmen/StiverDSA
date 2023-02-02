package Stiver01SortingAlgo;

public class BubbleSort {

    public static void main(String[] arr){
        int[] unSortArray = new int[]{4,2,10,1,5,6,3,7,8,9};
        for (int ele : unSortArray) System.out.print(ele+" ");
        System.out.println();
        bubbleSort(unSortArray);
        for (int ele : unSortArray) System.out.print(ele+" ");
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean isDoingSwapping = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    isDoingSwapping = true;
                }
            }
            if(!isDoingSwapping) break;
        }
    }
}

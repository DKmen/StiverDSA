package Stiver01SortingAlgo;

public class InsertionSort {

    public static void main(String[] arr){
        int[] unSortArray = new int[]{4,2,10,1,5,6,3,7,8,9};
        for (int ele : unSortArray) System.out.print(ele+" ");
        System.out.println();
        insertionSort(unSortArray);
        for (int ele : unSortArray) System.out.print(ele+" ");
    }

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int index=i;
            int element = arr[i];
            while (true && index>0){
                if(element<arr[index-1]){
                    arr[index]=arr[index-1];
                    index--;
                }else{
                    break;
                }
            }
            arr[index]=element;
        }
    }
}

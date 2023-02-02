package Stiver01SortingAlgo;

public class SelectionSort {

    public static void main(String[] arr){
        int[] unSortArray = new int[]{4,2,10,1,5,6,3,7,8,9};
        for (int ele : unSortArray) System.out.print(ele+" ");
        System.out.println();
        selectionSort(unSortArray);
        for (int ele : unSortArray) System.out.print(ele+" ");
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int minimumElement=arr[i];
            int index=i;
            for(int j=i;j<arr.length;j++) {
                if(minimumElement>arr[j]){
                    minimumElement=arr[j];
                    index=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
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

import java.util.Scanner;

class Linear_search{
    public int LinearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }


}
public class Array_Linear_Search {
    public static void displayArray(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Linear_search obj= new Linear_search();
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter Array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println(" Enter array Elements");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        long time_taken_Before_Search=System.nanoTime();
        long time_taken_after_Search=System.nanoTime();

        Long time_diff=time_taken_after_Search-time_taken_Before_Search;

        System.out.println("---------------Linear Search------------");
        System.out.print("Enter Any Element To Find Out:  ");
        int linearSearchNum = sc.nextInt();
        System.out.println("Time before Linear Search: " + time_taken_Before_Search + " Nano Second");
        int linearSearchResult = obj.LinearSearch(arr, linearSearchNum);
         System.out.println("Time After Linear Search: " + time_taken_after_Search + " Nano Second");
        System.out.println("Time difference Between Before and After Linear Search : " +time_diff);
        System.out.println("Index of Found Number: " + linearSearchResult);
        System.out.println(" founded Number is :"+ linearSearchNum);
        System.out.println("--------------------------------------");


    }
}

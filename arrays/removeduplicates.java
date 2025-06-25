package trees.arrays;

public class removeduplicates {
    public static void removeDuplicates(int[] arr) {
        // Code Here
        int n = arr.length;
        int arr1[] = new int[n];
        arr1[0] = arr[0];
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (arr1[res - 1] != arr[i]) {
                arr1[res] = arr[i];
                res++;
            }

        }
        for (int i = 0; i < res; i++) {
            arr[i] = arr1[i];

        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 50, 60 };
        removeDuplicates(arr);
    }
}

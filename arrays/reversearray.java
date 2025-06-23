package trees.arrays;

public class reversearray {
    public static void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        reverseArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

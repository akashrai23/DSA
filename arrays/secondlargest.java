package trees.arrays;

public class secondlargest {
    public static int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int l = largest(arr);
        int res = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[l]) {
                if (res == -1) {
                    res = i;
                } else if (arr[res] < arr[i]) {
                    res = i;
                }
            }
        }
        if (res == -1) {
            return -1;
        }
        return arr[res];

    }

    static int largest(int[] arr) {
        int n = arr.length;
        int largest = 0;
        for (int i = 1; i < n; i++) {
            if (arr[largest] < arr[i]) {
                largest = i;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        System.out.print(getSecondLargest(arr));
    }
}
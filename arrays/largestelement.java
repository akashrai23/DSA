package trees.arrays;

public class largestelement {
    static int largest(int[] arr) {
        // code here
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 50 };
        System.out.println(largest(arr));
    }
}

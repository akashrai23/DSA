package trees.arrays;

public class movezerotoend {

    static void pushZerosToEnd(int[] arr) {
        // code here
        // int n= arr.length;
        // for(int i=0; i<n; i++){
        // if(arr[i]==0){

        // for(int j=i+1;j<n; j++){
        // if(arr[j]!=0){
        // int temp= arr[j];
        // arr[j]= arr[i];
        // arr[i]= temp;
        // break;
        // }
        // }

        // }

        // }

        // optimised solution
        int n = arr.length;
        int count = 0; // count of non zero element
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // swap
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 0, 30, 40, 0, 90 };
        pushZerosToEnd(arr);
    }

}

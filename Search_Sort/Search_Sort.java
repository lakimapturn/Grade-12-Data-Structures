package Search_Sort;

public class Search_Sort {
    static int[] arr = {6, 4, 2, 8, -2, 6, -8, 16, 9};

    public static void main(String args[]) {
        System.out.println(binary(2));
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void bubble() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) { // can remove the -i and it will still work
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }

    public static void insertion() {
        for(int i = 1; i<arr.length; i++) {
            int pos = arr[i];
            int j = i-1;

            for(;j>=0 && pos < arr[j]; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = pos;
        }
    }

    public static boolean binary(int val) {
        insertion();
        int f = 0;
        int r = arr.length-1;

        while(f<=r) {
            int mid = (f+r)/2;

            if(arr[mid] == val) return true;
            else if(arr[mid] > val) {
                r = mid-1;
            }
            else {
                f = mid+1;
            }
        }

        return false;
    }
}

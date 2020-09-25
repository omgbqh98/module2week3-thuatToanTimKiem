public class BinarySearch {
    static int binarySearch(int[] arr, int value) {
        int mid;
        int left=0;
        int right=arr.length-1;
        while (right >= left) {
            mid = (right + left) / 2;

                if (value > arr[mid]) {
                    left = mid + 1;
                } else if (value < arr[mid]) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println( binarySearch(arr, 5));
    }
}

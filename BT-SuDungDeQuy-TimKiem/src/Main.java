public class Main {
    static int binarySearch(int low, int height, int xValue, int[] arr) {
        if (height >= low) {
            int mid = (height + low) / 2;
            if (xValue > arr[mid]) {
                return binarySearch(mid + 1, height, xValue, arr);
            } else if (xValue < arr[mid]) {
                return binarySearch(low, mid - 1, xValue, arr);
            } else if (xValue == arr[mid]) {
                return mid;
            }
        }return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(0, arr.length - 1, 11, arr));
    }
}

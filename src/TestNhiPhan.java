public class TestNhiPhan {
//Bắt đầu phương thức binarySearch (list, value)
//low = 0; high = list.lengh-1;
//while (high >= low)
//bắt đầu while
//mid = (low + high)/2;
//if a[mid] = value: Tìm thấy. Trả về vị trí mid
//else if a[mid] > value, tìm tiếp trong value trong dãy con a[low] ... a[mid-1]
//high = mid – 1
//else if a[mid] < value, tìm tiếp trong value trong dãy con a[mid + 1] ... a[high]
//low = mid + 1
//kết thúc while
//return -1
//Kết thúc phương thức

    static public int binarySearch(int list[], int value) {
        int low = 0;
        int hight = list.length - 1;
        while (hight >= low) {
            int mid = (hight + low) / 2;
            for (int i = 0; i < list.length; i++) {
                if (value > list[mid]) {
                      low = mid + 1;
                } else if (value < list[mid]) {
                     hight = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println( binarySearch(arr, 5));

    }
}



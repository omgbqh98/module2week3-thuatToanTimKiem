import java.util.Scanner;

public class TestTimKiemNhiPhan {
   static public int rbinarySearch(int l, int r, int k[], int x) {
        int loc = 0;
        int m = 0;
        if (l > r) {
            loc = 0;
        } else {
            m = (l + r) / 2;
        }
        if (x < k[m]) {
            loc = rbinarySearch(l, m - 1, k, x);
        } else if (x > k[m]) {
            loc = rbinarySearch(m + 1, r, k, x);
        } else if (x == k[m]) {
            loc = m;
        } else if (x!=k[m]){
            System.out.println("ko co so nay trong list !");
        }
        return loc;
    }
    public static void main(String[] args) {
        System.out.println("input number: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int k[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(rbinarySearch(1, 10, k, x));


    }



}

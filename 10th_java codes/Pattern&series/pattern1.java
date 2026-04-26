//1, 12, 123, 1234, 12345, 123456,
public class pattern1 {
    public static void main(String[] args) {

        int n = 1;
        while (n <= 6) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum * 10 + i;
            }
            System.out.print(sum+ ", ");
            n++;
        }
    }
}

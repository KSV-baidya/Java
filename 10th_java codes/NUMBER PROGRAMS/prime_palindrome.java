public class prime_palindrome {
    public static void main(String[] args) {

        for (int i = 10; i <= 1000; i++) {

            int temp = i;
            int reverse = 0;
            int x = 0;

            // Reverse the number
            while (temp != 0) {
                int last = temp % 10;
                reverse = reverse * 10 + last;
                temp /= 10;
            }

            // Prime check
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    x++;
                }
            }

            // Check both conditions
            if (x == 2 && reverse == i) {
                System.out.println("Prime palindrome is " + i);
            }
        }
    }
}
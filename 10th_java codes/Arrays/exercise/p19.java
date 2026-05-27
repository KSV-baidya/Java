//Array 2D M and Arrray M+N are given values. find the value of N.

public class p19 {
    public static void main(String[] args) {
        int M[][] = { { -1, 0, 2 }, { -3, -1, 6 }, { 4, 3, -1 } };
        int MN[][] = { { -6, 9, 4 }, { 4, 5, 0 }, { 1, -2, -3 } };
        int N[][] = new int[3][3];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                N[i][j] = MN[i][j] - M[i][j];
            }
        }

        // Print the value of N
        for (int i = 0; i < N.length; i++) {
            for (int j = 0; j < N[0].length; j++) {
                System.out.print(N[i][j] + " ");
            }
            System.out.println();
        }
    }
}
package kz.epam.chess;

import java.text.DecimalFormat;

public class KnightPath {

    int[][] moving;
    int path = 0;

    public KnightPath(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                moving[i][j] = 0;
            }
        }
    }

    public void solve() {
        if (findPath(0, 0, 0, moving.length)) {
            print();
        } else {
            System.out.println("NO PATH FOUND");
        }
    }

    public boolean findPath(int row, int column, int index, int N) {
        if (moving[row][column] != 0) {
            return false;
        }

        moving[row][column] = path++;
        if (index == N * N - 1) {
            return true;
        }


        // go down and right
        if (canMove(row + 2, column + 1, N)
                && findPath(row + 2, column + 1, index + 1, N)) {
            return true;
        }
        // go right and down
        if (canMove(row + 1, column + 2, N)
                && findPath(row + 1, column + 2, index + 1, N)) {
            return true;
        }
        // go right and up
        if (canMove(row - 1, column + 2, N)
                && findPath(row - 1, column + 2, index + 1, N)) {
            return true;
        }
        // go up and right
        if (canMove(row - 2, column + 1, N)
                && findPath(row - 2, column + 1, index + 1, N)) {
            return true;
        }
        // go up and left
        if (canMove(row - 2, column - 1, N)
                && findPath(row - 2, column - 1, index + 1, N)) {
            return true;
        }
        // go left and up
        if (canMove(row - 1, column - 2, N)
                && findPath(row - 1, column - 2, index + 1, N)) {
            return true;
        }
        // go left and down
        if (canMove(row + 1, column - 2, N)
                && findPath(row + 1, column - 2, index + 1, N)) {
            return true;
        }
        // go down and left
        if (canMove(row + 2, column - 1, N)
                && findPath(row + 2, column - 1, index + 1, N)) {
            return true;
        }

        moving[row][column] = 0;
        path--;
        return false;
    }



    public boolean canMove(int row, int col, int N) {
        if (row >= 0 && col >= 0 && row < N && col < N) {
            return true;
        }
        return false;
    }

    public void print() {
        DecimalFormat twodigits = new DecimalFormat("00");
        for (int i = 0; i < moving.length; i++) {
            for (int j = 0; j < moving.length; j++) {
                System.out.print("   " + twodigits.format(moving[i][j]));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int N = 8;
        KnightPath i = new KnightPath(N);
        i.solve();
    }
}
